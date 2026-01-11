function sumOfSquares(n) {
    let sum = 0;
    for(let i=1;i<=n;i++) {
        sum = sum + (i*i);
    }
    return sum;
}
const n = 5;
const result = sumOfSquares(n);
console.log(result);
