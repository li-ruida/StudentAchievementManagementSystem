window.onload = function () {
    //当页面加载完成，我们需要绑定各种事件





    //根据id获取到表格
    var stuTbl = document.getElementById("tbl_stu");
    //获取表格中的所有的行
    var rows = stuTbl.rows;
    for (var i = 1; i < rows.length; i++) {
        var tr = rows[i];
        var cells = tr.cells;
        var grade = cells[4];
        if(grade<60){
            grade.style.color="red";
        }
        trBindEvent(tr);
    }
    
}

function $(id){
    return document.getElementById(id);
}





function trBindEvent(tr){
    //1.绑定鼠标悬浮以及离开时设置背景颜色事件
    tr.onmouseover = showBGColor;
    tr.onmouseout = clearBGColor;
    //获取tr这一行的所有单元格
    var cells = tr.cells;
    var priceTD = cells[1];
    //2.绑定鼠标悬浮在单价单元格变手势的事件
    priceTD.onmouseover = showHand;
    //3.绑定鼠标点击单价单元格的事件
    priceTD.onclick = editPrice;


    //7.绑定删除小图标的点击事件
    var img = cells[3].firstChild;
    if (img && img.tagName == "IMG") {
        //绑定单击事件
        img.onclick = delStu;
    }
}
