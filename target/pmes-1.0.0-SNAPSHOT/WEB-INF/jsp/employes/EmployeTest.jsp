<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ma premiere page test</title>
<script type="text/javascript" language="javascript">
	function fn_onLoad(){
		var form = document.frm_employesTest;
		form.action = "<c:url value='/employes/employeTest/addEmployeTest.do'>";
		from.target = "employeTestFrame";
		form.submit();
		
	}
</script>
</head>
<body onLoad="fn_onLoad()">
<iframe name="employeTestFrame" id="employeTestFrame" width="100%" frameborder="0" scrolling="no"></iframe>
<iframe name="resultFrame" id="resultFrame" heigth="0" width="0" frameborder="0"></iframe></body>

</html>