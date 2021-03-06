if(localStorage.getItem('token')!=null){
	window.location.href = "../home";
}

$(document).on('submit', '*[name="loginForm"]',function(e){
	e.preventDefault();
	const form = document.forms['loginForm'];
	const data = formToJSON(form.elements);
	$.ajax({
		type : 'POST',
		url : "/clinicAdminLogin",
		contentType : 'application/json',
		dataType : "json",
		data : data,
		success : function(successData) {
			localStorage.setItem('token', successData.token);
			window.location.href = "../clinicAdminHome";
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			window.location.replace("../clinicAdminLogin?error");
		}
	});	
});

function formToJSON(form) {
	return JSON.stringify({		
		"email" : form[0].value,
		"password" : form[1].value
	});
}