<%@ page contentType="text/html; charset=GBK" language="java"
	errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>WordMaster Menu</title>
<script type="text/javascript" src="/wordmaster/dwr/engine.js"></script>
<script type="text/javascript" src="/wordmaster/dwr/interface/WordMasterRemote.js"></script>
<script type="text/javascript" src="/wordmaster/scripts/jquery-1.7.2.js"></script>

</head>
<body>
<form>
Welcome to the menu.
	
	
<script>
$(document).ready(function(){
	WordMasterRemote.hello(function(data){
		alert(data);
	});
	
});

</script>	
	
</form>
</body>
</html>