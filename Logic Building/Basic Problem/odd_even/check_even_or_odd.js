function isEven(n){
    if((n&1) == 0) {
        return true;
    }
    else {
        return false;
    }
}

let n = 12;
if(isEven(n)) {
    console.log("Even");
}else {
    console.log("odd");
}
