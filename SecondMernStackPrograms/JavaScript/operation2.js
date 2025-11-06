let h1=document.querySelector(".external");
let originaltext = h1.innerHTML
h1.addEventListener("mouseenter",function(e)
{
h1.innerHTML="Hi Friend How is your day";
})

h1.addEventListener("mouseleave",function(e){

  let h2=originaltext.concat(" \nPlease Exit")
  h1.innerHTML = h2;
})

