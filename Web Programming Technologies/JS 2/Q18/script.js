const str = document.getElementById("str");
const subStr = document.getElementById("sub");
const replaceStr = document.getElementById("rep");
const operations = document.getElementsByName("operation");
const div1 = document.getElementById("div1");

document.getElementById("btn").addEventListener("click", ()=>{
  console.log(operations);
  let index = -1;
  for (let i = 0; i < operations.length; i++) {
    if (operations[i].checked) {
      index = i;
    }
  }
  switch (index) {
    case 0:
      if(str.value.indexOf(subStr.value)!=-1){
        div1.innerHTML = `"${subStr.value}" found in "${str.value}" 
        at index ${str.value.indexOf(subStr.value)}`;
      }
      else
        div1.innerHTML = "No Such String Found" 
      break;

    case 1:
      div1.innerHTML = `After UpperCase: ${str.value.toUpperCase()}`;
      break;

    case 2:
      div1.innerHTML = `After LowerCase: ${str.value.toLowerCase()}`;
      break;

    case 3:
      div1.innerHTML = `After Removing WhiteSpaces: ${str.value.trim()}`;
      break;

    case 4:
      div1.innerHTML = `Concatenated String 1 and String 2, resulting to ${str.value.concat(
        subStr.value
      )}`;
      break;

    case 5:
      div1.innerHTML =
        "Replaced: " + str.value.replace(subStr.value, replaceStr.value);
      break;

    default:
      div1.innerHTML = `Please Select an Operation`;
      break;
  }
});
