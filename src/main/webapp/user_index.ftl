<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<#include "inc_header.ftl"/>
<div>
<@aTag>
    <#list articles as article>
        <a href="#">${article}</a> <br/> <br/>
    </#list>
</@aTag>

    <br/><br/><br/>
    会员列表：<br/>

<#list users as user>
    <a href="#">${user}</a>
</#list>
    <br/>
</div>
<#include "inc_footer.ftl"/>
</body>
</html>