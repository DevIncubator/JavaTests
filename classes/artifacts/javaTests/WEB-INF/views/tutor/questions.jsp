<%--
  Created by IntelliJ IDEA.
  User: O'win
  Date: 22.02.2018
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Tutor Question</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<li>
<input type="text" name="question" id="choose_question" list="question_list">
    <datalist id="question_list">
        <c:forEach items="${questionList}" var="question">
            <option>${question.getDescription()}</option>
        </c:forEach>
    </datalist>
</li>

<input type="text" id="answers" list="answer_list">
<datalist id="answer_list">
    <c:forEach items="${answerList}" var="answer">
        <option>${answer.getDescription()}</option>
    </c:forEach>
</datalist>

<a class="btn btn-success" id="save">Сохранить</a>
<a class="btn btn-primary" href="/tutorMainPage">Назад</a>

<script>

    $("#choose_question").on("change keyup input", function(){
        var question = $(this).val();

        $.ajax({
            type: "get",
            url: "/getAnswersByQuestionId",
            data: {question: question},
            contentType:
                "application/json; charset=utf-8",
            success: function (data) {
            },
            error: function () {
            }
        });
    });

</script>
</body>
</html>
