$(document).ready(function() {
    console.log( "ready!");
});



var recipe = document.getElementById("recipe"); 

recipe.addEventListener("mouseover", function() {
  recipe.style.color = "blue";
  
  });


recipe.addEventListener("mouseleave", function() {
  recipe.style.color = "black";

});
