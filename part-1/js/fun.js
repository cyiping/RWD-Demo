function square(number) {
    return number * number;
}
function noReturn() {
    
}

// 可以將返回值存到一個變數
var squareValue = square(10);
console.log(squareValue); //100
console.log(square(10) * 10); //1000
console.log(noReturn()); //undefined
