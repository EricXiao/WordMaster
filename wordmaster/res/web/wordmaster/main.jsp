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
<div id="div_main">
Welcome to the menu. Select a function.

<br/>
<a href="javascript: void(0)" id="link_newWord">Input New Word</a>
	
</div>	

<div id="div_newWord" style="display:none">
Word: <input type="text" id="field_newWord" name="field_newWord" /><br/>
Chinese Translation: <input type="text" id="field_cnTranslation" name="field_cnTranslation"/><br/>
English Translation: <input type="text" id="field_enTranslation" name="field_enTranslation"/><br/>
Type: <select id="field_type" name="field_type">
</select> &#160; Code:<input type="text" id="field_newTypeCode" name="field_newTypeCode" style="display:none" />
&#160;Description:<input type="text" id="field_newTypeDescription" name="field_newTypeDescription" style="display:none" />
<br/>
Notes: <input type="text" id="field_notes" name="field_notes"/><br/>
Example: <input type="text" id="field_example" name="field_example" size="60"/><br/>

<input type="button" id="button_save" value="Save"/>
<input type="button" id="button_back" value="Back"/>

</div>
<script>
$(document).ready(function(){
	WordMasterRemote.getWordTypes(function(data){
		$("#field_type").html("");
		for(var i=0; i<data.length; i++){
			$("<option value=\""+data[i].code+"\">"+data[i].description + "</option>").appendTo($("#field_type"));
		}
	});
	
	$("#field_type").change(function(){
		if($(this).val()=="OT"){
			$("#field_newTypeCode").show();
			$("#field_newTypeDescription").show();
		}else{
			$("#field_newTypeCode").hide().val("");
			$("#field_newTypeDescription").hide().val("");
		}
	});
	
	$("#link_newWord").click(function(){
		$("#div_main").hide();
		$("#div_newWord").show();
	});

	$("#button_back").click(function(){
		$("#div_main").show();
		$("#div_newWord").hide();
	});
	
	$("#button_save").click(function(){
		var newTypeCode = $.trim($("#field_newTypeCode").val());
		var newTypeDescription = $.trim($("#field_newTypeDescription").val());
		if(newTypeCode!="" && newTypeDescription!=""){
			WordMasterRemote.addNewType(newTypeCode, newTypeDescription, function(data){
				if(data != "success"){
					alert("Failed to create new type.");
				}else{
					alert("success");
				}
			});
		}else if(newTypeCode!="" || newTypeDescription!=""){
			alert("please input new type.");
		}
	});
	
});

</script>	
	
</form>
</body>
</html>