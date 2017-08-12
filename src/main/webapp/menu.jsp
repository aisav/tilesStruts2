<%@taglib uri="/struts-tags" prefix="s"%>

<s:set var="test" value="%{'7asdasd'}" />
Test is <s:property value="test"/>

MENu
<a href="<s:url action="tigerMenu"/>" Tiger</a><br>
<a href="<s:url action="lionMenu"/>" Lion</a><br>