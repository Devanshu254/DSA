function sumOfDigits(n){
    let sum = 0;
    while(n!=0) {
        let last_digit = n%10;
        sum = sum +last_digit;
        n = Math.floor(n/10);
    }
    return sum;
}

let n = 12345;
let result = sumOfDigits(n);
console.log(result);
