function validateForm() {
  let x = document.forms["myForm"]["uname"].value;
  let y = document.forms["myForm"]["pass"].value;
  if (x == "") {
    alert("Name must be filled out");
    if (y == "") {
      alert("Name must be filled out");
    }
  }
}

function checkValue() {
  let name = "Ivin";
  let password = "Ivin123";
  document.getElementById("uname");
  document.getElementById("pass");
  if (pass.value != password && uname.value == name) {
    alert("Enter correct Password");
  }
}

var btn = document.getElementById("myBtn");
btn.addEventListener("click", validateForm);
btn.addEventListener("click", checkValue);
