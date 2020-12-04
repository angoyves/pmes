<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ma premiere page test</title>
<script type="text/javascript">
	/* function fn_onLoad(){
		var form = document.frm_employesTest;
		form.action = "";
		from.target = "employeTestFrame";
		form.submit();
		
	} */
</script>
</head>
<body onLoad="fn_onLoad()">
	<iframe src="/pmes/employes/add" name="employeTestFrame" id="employeTestFrame"  style="height: 500px; width:500px; border:none"></iframe>
	<iframe name="resultFrame" id="resultFrame" style="height: 500px; width:500px; border:none"></iframe></body>

</html>