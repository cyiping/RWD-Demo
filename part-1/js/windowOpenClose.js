var win1 = window.open('https://tw.news.yahoo.com/');
var win2 = window.open(
       'https://tw.news.yahoo.com/',
       'yahoo-window',
       'width=800,height=600,resizable=yes,scrollbars=yes,location=yes'
);
//5秒後自動關閉
setTimeout( function() {
    win2.close();
}, 5000);

