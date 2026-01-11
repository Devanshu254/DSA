// function printTable(n) {
//     for(let i=1;i<=10;i++) {
//         console.log(n +"*"+i+"="+ n*i);
//     }
// }

// recursive way to print the same function.
function printTable(n, i = 1) {
  // Base case
  if (i == 11) return;
  console.log(n + "*" + i + "=" + n * i);
  i++;
  printTable(n, i);
}

let n = 6;
printTable(n);
