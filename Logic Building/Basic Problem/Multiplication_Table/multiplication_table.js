// function printTable(n) {
//     for(let i=1;i<=10;i++) {
//         console.log(n +"*"+i+"="+ n*i);
//     }
// }

// recursive way to print the same function.
// function printTable(n, i = 1) {
//   // Base case
//   if (i == 11) return;
//   console.log(n + "*" + i + "=" + n * i);
//   i++;
//   printTable(n, i);
// }

// let n = 6;
// printTable(n);

// As per GFG.

class Solution {
  getTable(n) {
    let arr = [];
    for(let i=1;i<=10;i++) {
      arr.push(n*i);
    }

    return arr;
  }
}

let n=5;
const obj = new Solution();
const result = obj.getTable(n);
console.log(result);


// In real applications, JavaScript receives input via browser events or HTTP requests. Stdin handling is mainly used in competitive programming, typically via readline or fs.