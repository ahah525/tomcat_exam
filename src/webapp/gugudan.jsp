<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- import -->
<%@ page import="com.ll.exam.Rq" %>
<%
    Rq rq = new Rq(request, response);
    int dan = rq.getIntParam("dan", 0);
    int limit = rq.getIntParam("limit", 0);
%>

<h1><%=dan%>단 (JSP 버전)</h1>

<% for(int i = 1; i <= limit; i++) { %>
    <div><%=dan%> * <%=i%> = <%=dan * i%></div>
<% } %>