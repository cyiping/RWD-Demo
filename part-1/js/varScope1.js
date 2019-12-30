function foo() {
    // 在 function 裡面宣告的變數，作用(存在)範圍只在 function 裡面 (local)
    var abc = 'Jim';
    console.log(abc); // 會顯示 Jim
}
foo();
console.log(abc); // 會發生錯誤，因為找不到變數