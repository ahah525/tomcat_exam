package com.ll.exam;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
    // GetMapping
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Rq rq = new Rq(req, resp);

        int dan = rq.getIntParam("dan", 0);
        int limit = rq.getIntParam("limit", 0);

        // request에 정보를 담기(jsp에서 사용할 수 있도록)
        req.setAttribute("dan", dan);
        req.setAttribute("limit", limit);

        // html 로직 처리는 jsp에 토스
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/gugudan2.jsp");
        requestDispatcher.forward(req, resp);
    }
}
