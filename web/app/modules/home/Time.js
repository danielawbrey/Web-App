$(document).ready(function printTime() {
  var date = new Date();
  document.getElementById("currentTime").innerText = date;
  setInterval(printTime, 500);
});

$(document).ready(function getGreeting() {
  var date = new Date();
  var hour = date.getHours();
  if(hour < 12) { document.getElementById("greeting").innerText = "Good Morning"; }
  else if(hour >= 12 && hour < 17) { document.getElementById("greeting").innerText = "Good Afternoon"; }
  else { document.getElementById("greeting").innerText = "Good Evening"; }
  setInterval(getGreeting, 500);
});