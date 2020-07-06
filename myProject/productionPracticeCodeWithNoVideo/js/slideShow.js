window.onload = init;
var cnt = 1;
var inforImgs;//提示黑白点
function init(){
    inforImgs = document.getElementsByClassName("inforImgs");
    inforImgs[0].onclick = inforImgsFunc;
    inforImgs[1].onclick = inforImgsFunc;
    inforImgs[2].onclick = inforImgsFunc;
    inforImgs[3].onclick = inforImgsFunc;
    inforImgs[4].onclick = inforImgsFunc;
    autoSlide();
}
function autoSlide(){
    var slideImgBg = document.getElementById("slideImgBg");
    var inforImgs = document.getElementsByClassName("inforImgs");
    var i;
    for(i = 0;i < 5;i++)
    {
        inforImgs[i].src = '../../../../image/slideImg/changeInfor/whitePoint.png';
    }
    if(cnt == 6)
    {
        cnt = 1;
    }
    switch(cnt)
    {
        case 1:slideImgBg.style.backgroundImage = 'url("../../../../image/slideImg/blue.jpg")';inforImgs[0].src = '../../../../image/slideImg/changeInfor/blackPoint.png';break;
        case 2:slideImgBg.style.backgroundImage = 'url("../../../../image/slideImg/fleshcolor.jfif")';inforImgs[1].src = '../../../../image/slideImg/changeInfor/blackPoint.png';break;
        case 3:slideImgBg.style.backgroundImage = 'url("../../../../image/slideImg/homocharomy.jfif")';inforImgs[2].src = '../../../../image/slideImg/changeInfor/blackPoint.png';break;
        case 4:slideImgBg.style.backgroundImage = 'url("../../../../image/slideImg/orange.jfif")';inforImgs[3].src = '../../../../image/slideImg/changeInfor/blackPoint.png';break;
        case 5:slideImgBg.style.backgroundImage = 'url("../../../../image/slideImg/purple.jpg")';inforImgs[4].src = '../../../../image/slideImg/changeInfor/blackPoint.png';break;
    }
    cnt++;
    setTimeout(autoSlide,2500);
}
function inforImgsFunc(){
    var obj = event.srcElement ? event.srcElement : event.target;
    var inforImgs = document.getElementsByClassName("inforImgs");
    // var slideImgBg = document.getElementById("slideImgBg");
    // var i;
    switch(obj)
    {
        case inforImgs[0]:cnt = 1;break;
        case inforImgs[1]:cnt = 2;break;
        case inforImgs[2]:cnt = 3;break;
        case inforImgs[3]:cnt = 4;break;
        case inforImgs[4]:cnt = 5;break;
    }
    // if(obj == inforImgs[0])
    // {
    //     cnt = 1;
    // }else   if(obj == inforImgs[1])
    //         {
    //             cnt = 2;
    //         }else   if(obj == inforImgs[2])
    //                 {
    //                     cnt = 3;
    //                 }else   if(obj == inforImgs[3])
    //                         {
    //                             cnt = 4;
    //                         }else   if(obj == inforImgs[4])
    //                                 {
    //                                     cnt = 5;
    //                                 }
}
