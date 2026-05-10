function gpaValidation() {
  let mark = document.getElementById("value").value;
  let marks = parseFloat(mark);

  if (marks >= 8) {
    console.log("greater marks");
    document.getElementById("result").innerHTML = "Greater marks";
  } else {
    console.log("lesser marks");
    document.getElementById("result").innerHTML = "Lesser marks";
  }
}
