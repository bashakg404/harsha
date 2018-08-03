function validate(){
	
   var jsname = /^[A-Za-z]+$/;
   var jsusrname = /^[A-Za-z0-9]+$/;
   var jspswrd = /^[A-Za-z0-9]+$/;
   var jsamt = /^[0-9]+$/;
   var jsmail =/^[a-ZA-Z0-9]+[@]+[a-ZA-Z]+[.]+[c][o][m]+$/;
   if(!document.myform.name.value.match(jsname) || document.myform.name.value==""){
	   alert("please enter your name with only letters is mandatory");
	   document.myform.name.focus;
	   return false;
   }
   
   if(!document.myform.username.value.match(jsusrname) || document.myform.username.value==""){
	   alert("please enter your username which is mandatory");
	   document.myform.username.focus;
	   return false;
   }
   
   if(!document.myform.password.value.match(jspswrd) || document.myform.password.value==""){
	   alert("please enter your password which is mandatory, special symbols not allowed");
	   document.myform.password.focus;
	   return false;
   }
   
   if(!document.myform.amount.value.match(jsamt) || document.myform.amount.value==""){
 //  if(document.myform.amount.value==""){
   alert("please enter amount minimum 1000 rupees");
	   document.myform.amount.focus;
	   return false;
   }
   
   if(!document.myform.emailid.value.match(jsmail) || document.myform.emailid.value==""){
  // if(document.myform.emailid.value==""){
	   alert("please enter your emailid in aaa@gmail.com format");
	   document.myform.emailid.focus;
	   return false;
   }
   
  return (true); 
}