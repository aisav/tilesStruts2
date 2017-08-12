<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>Struts 2 Login example</title>
        <s:head/>
    </head>

    <body>
        <h1><s:text name="welcome" /></h1>
        <s:if test="hasActionErrors()">
	        <div id="fieldErrors">
	            <s:actionerror/>
	        </div>
        </s:if>
        <s:form action="loginAction" namespace="/" method="post" name="myForm" theme="xhtml">
            <s:textfield name="name" size="16" maxlength="12" key="your.name-label"/>
            <s:password name="password" size="16" maxlength="12" key="your.name-label"></s:password>
            <s:submit key="Submit" />
        </s:form>
    </body>
</html>