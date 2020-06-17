<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<html>
<head>
    <title>Index</title>

<%--    <script src="/webjars/jquery/3.3.1-2/jquery.min.js"></script>--%>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

    <script>
        $(function () {

            $('#btn1').bind('click',function () {
                $.ajax({
                    type:'get',
                    url: 'student/findAll',
                    success:function (data) {
                        console.log(data);
                        alert("成功！");
                    },
                    error:function () {
                        alert("失败！");
                    }
                });
            })

            $('#btn2').bind('click',function () {
                $.ajax({
                    type:'get',
                    url: 'student/findID',
                    success:function (data) {
                        console.log(data);
                        alert("成功！");
                    },
                    error:function () {
                        alert("失败！");
                    }
                });
            })

        })
    </script>

</head>
<body>
<h2>Hello World!</h2>

    <button id="btn1">查询全部</button> <br>

    <button id="btn2">ID查询</button>

</body>
</html>
