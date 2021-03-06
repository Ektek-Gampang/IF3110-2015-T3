<%-- 
    Document   : voteDownAnswer
    Created on : Nov 25, 2015, 5:41:38 AM
    Author     : Marco Orlando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="4, <% out.println("url=questionAnswerPage.jsp?token=" + request.getParameter("token") + "&q_id=" + request.getParameter("q_id") + "\""); %>">
        <title>JSP Page</title>
    </head>
    <body onload="checkLogin(<%= request.getParameter("token") %>)">
        <h1>Vote down answer</h1>
        
        
        
              <%-- start web service invocation --%><hr/>
    <%
    try {
	wsmodel.WS_Service service = new wsmodel.WS_Service();
	wsmodel.WS port = service.getWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String accessToken = request.getParameter("token");
	int answerId = Integer.parseInt(request.getParameter("a_id"));
	int questionId = Integer.parseInt(request.getParameter("q_id"));
	// TODO process result here
	java.lang.String result = port.voteDownAnswer(accessToken, answerId, questionId);
        
        if (result.equals("valid")){
            String site = "questionAnswerPage.jsp?token=" + request.getParameter("token") + "&q_id=" + request.getParameter("q_id");
            response.setStatus(response.SC_MOVED_TEMPORARILY);
            response.setHeader("Location", site); 
        } else if (result.equals("expired")) {
            out.println("failed<br/>token expired, please login again");
        } else if (result.equals("invalid")) {
            out.println("failed<br/>token invalid, please login again");     
        } else {
            out.println("failed<br/>");
            out.println(result);
        }
        
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
        
    </body>
</html>
