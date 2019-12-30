// 全域變數 - global scope
var num1 = 20;
var num2 = 3;
var name = 'Jim';

function multiply() {
    return num1 * num2;
}

// 輸出 60
console.log(multiply());

function getScore () {
    // 局部變數 - function scope
    // 作用範圍只在函數內部
    var num1 = 2;
    var num3 = 4;
    
    // 如果沒加 var 宣告變數，這個變數則是一個全域變數
    num2 = 5; // 存取到全域變數 num2
    num4 = 6; // 宣告一個新的全域變數 num4

    // 函數也可以宣告在其他函數內部 (nested function)
    function add() {
        // 內部函數可以存取到外部函數的局部變數
        return name + ' scored ' + (num1 + num2 + num3);
    }
  
    return add();
}

console.log(getScore()); //  "Jim scored 11"

// 會存取到全域變數 num1，輸出 20
console.log(num1);

// 因為全域變數 num2 在函數內部被設成 5
console.log(num2);

// 會存取到全域變數 num4，輸出 6
console.log(num4);

// 全域空間存取不到 function 內部的變數, 會發生錯誤 - Uncaught ReferenceError
console.log(num3);

// 全域空間也存取不到 function 的內部函數, 會發生錯誤 - Uncaught ReferenceError
console.log(add());
