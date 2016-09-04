<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
test html <br>
<#list page.getList() as user>
${user.name!} --- ${user.password!}<br/>
</#list>
<#include "_paginate.ftl"/>
<@paginate currentPage=page.pageNumber totalPage=page.totalPage actionUrl="/jfinal_demo/action1/" />
</body>
</html>