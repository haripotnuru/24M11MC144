function helpfunction()
    {
      prompt("Enter the query you have")
    }
function signopen()
{
  document.getElementById("signopen").style.display="flex";
}
function signupclose()
{
  document.getElementById("signopen").style.display="none";
}
function showpass()
{
   var password=document.getElementById("pass");
   if(password.type === "password")
   {
    password.type="text";
   }
   else
   {
    password.type="password";
   }
}
let icon=document.getElementById("theme-icon");
let body=document.body;
document.getElementById("theme-toggle").onclick = () =>
{
  body.classList.toggle("dark-mode");

  if(body.classList.contains("dark-mode"))
  {
    icon.classList.remove("fa-moon")
    icon.classList.add("fa-sun")
  }
  else{
    icon.classList.remove("fa-sun");
    icon.classList.add("fa-moon")
  }
};