<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title><s:text name="HelloWorld.message"/></title>
    </head>

    <body>
        <h2><s:property value="message"/></h2>

        <h3>Languages</h3>
        <ul>
            <li>
                <s:url id="url" action="HelloWorld">
                    <s:param name="request_locale">en</s:param>
                </s:url>
                <s:a href="%{url}">English</s:a>
            </li>

            <li>
                <s:url id="url" action="HelloWorld">
                    <s:param name="request_locale">es</s:param>
                </s:url>

                <s:a href="%{url}">Espanol</s:a>
                <%
                    String path = request.getContextPath();
                %>
                <a href="test.action">test</a>

            </li>
        </ul>
        <!--<iframe scrolling="auto" frameborder="0" name="main_post" src="test" style="background-color: #9999ff;margin-top: 60px;width: 100%;height: 510px"></iframe>-->
    </body>
</html>

