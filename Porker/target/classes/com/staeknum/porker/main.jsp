<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Poker Game!</title>
</head>
<body>
<h1>This is Poker Game</h1>
<h2>Choose a game mode.</h2>
<form name = "ChozenMode" method = "post" action="playPoker">
	<input type ="radio" name =Mode value = 5 checked>
	<input type ="radio" name =Mode value = 3>
	<input type ="submit" name="submit" value = "submit" >
</form>


</body>
</html>