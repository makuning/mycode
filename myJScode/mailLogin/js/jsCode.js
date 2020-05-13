window.onload = init;
//先给需要操作的标签添加一个查找变量(全局变量)
var mailNameText;           //用于查找邮箱名文本框
var pswdText;               //用于查找第一次密码框
var secPswdText;            //用于查找第二次密码框
var phoneNumText;           //用于查找手机输入框

var mailNameHint;               //用于查找邮箱名输入框提示信息
var pswdHint;                   //用于查找第一次密码框提示信息
var secPswdHint;                //用于查找第二次密码框提示信息
var phoneNumHint;               //用于查找电话号码输入框提示信息
var hintImgs;                   //用于查找提示信息的警示图片

var verifyBton1;                //用于查找验证信息的第一个按钮
var verifyBton2;                //用于查找验证信息的第二哥按钮
var verify;                     //用于查找切换验证方式的现实框
var sbmitBton;                  //用于查找提交按钮

var verifyImgHint1;             //用于查找验证按钮下的绿色选中提示1
var verifyImgHint2;             //用于查找验证按钮下的绿色选中提示2
var verify;                     //用于查找验证按钮点击后的提示框

var serveCheckbox;              //用于查找服务条款的阅读勾选按钮 

var randomFlag;                 //标志变量，用于查看验证码是否验证正确
var wxFlag;

function init(){
    //给全局变量设定功能
    mailNameText = document.getElementById("mailNameText");     //用于查找邮箱名文本框
    pswdText = document.getElementById("pswdText");             //用于查找第一次密码框
    secPswdText = document.getElementById("secPswdText");       //用于查找第二次密码框
    phoneNumText = document.getElementById("phoneNumText");     //用于查找手机输入框
    
    mailNameHint = document.getElementById("mailNameHint");     //用于查找邮箱名输入框提示信息
    pswdHint = document.getElementById("pswdHint");             //用于查找第一次密码框提示信息
    secPswdHint = document.getElementById("secPswdHint");       //用于查找第二次密码框提示信息
    phoneNumHint = document.getElementById("phoneNumHint");     //用于查找电话号码输入框提示信息
    hintImgs = document.getElementsByClassName("hintImg");      //用于查找提示信息的警示图片

    verifyBton1 = document.getElementById("verifyBton1");       //用于查找验证信息的第一个按钮
    verifyBton2 = document.getElementById("verifyBton2");       //用于查找验证信息的第二个按钮
    verify = document.getElementById("varify");                 //用于查找切换验证方式的显示框
    sbmitBton = document.getElementById("sbmitBton");           //用于查找提交按钮

    verifyImgHint1 = document.getElementById("verifyImgHint1"); //用于查找验证按钮下的绿色选中提示1
    verifyImgHint2 = document.getElementById("verifyImgHint2"); //用于查找验证按钮下的绿色选中提示2
    verify = document.getElementById("verify");                 //用于查找验证按钮点击后的提示框

    serveCheckbox = document.getElementById("serveCheckbox");       //用于查找服务条款的阅读勾选按钮
    randomFlag = 1;

    mailNameText.onblur = mailNameFunc;                         //邮箱名输入框失去焦点发生的事件函数
    mailNameText.onfocus = mailNameFunc;                        //邮箱名输入框获取焦点发生的事件函数

    pswdText.onblur = pswdFunc;                                 //密码输入框失去焦点时发生的事件函数
    pswdText.onfocus = pswdFunc;                                //密码输入框获取焦点时发生的事件函数

    secPswdText.onblur = secPswdFunc;                           //确认密码框失去焦点的函数
    secPswdText.onfocus = secPswdFunc;                          //确认密码框获取焦点的函数

    phoneNumText.onblur = phoneNumFunc;                         //号码输入框失去焦点的事件函数
    phoneNumText.onfocus = phoneNumFunc;                        //号码输入框获取焦点的事件函数

    verifyBton1.onclick = verifyBton1Func;                      //验证信息按钮1被点击时触发的事件函数
    verifyBton2.onclick = verifyBton2Func;                      //验证信息按钮2被点击时触发的事件函数

    sbmitBton.onclick = sbmitBtonClickFunc;
}

//字典
    //邮箱名合法字符
var mailNameDict = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890.-_";
    //密码合法字符(字母+数字)
var pswdDict = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    //英语字母字典
var englishWordDict = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    //数字字典
var numDict = "1234567890";

//自定义函数
    //判断一个字符串是否在另一个字符串中,在返回true，不在返回false
function ifStringIn(stringSmall,stringBig){
    var i;
    for(i = 0;i < stringSmall.length;i++)
    {
        if(stringBig.indexOf(stringSmall.charAt(i)) == -1)
        return false;
    }
    return true;
}
    //提示信息的颜色
function hintColor(hintLocation,imgLength){
    if(event.type == "blur")
    {
        hintLocation.style.color = "red";
        hintImgs[imgLength].innerHTML = "<img src=\"../image/judge/wrongout.gif\"/>"
    }else{
        hintLocation.style.color = "black";
        hintImgs[imgLength].innerHTML = "<img src=\"../image/judge/wrongin.gif\"/>"
    }
}

    //产生一个指定范围的随机数
function produceRandom(lengthStart,lengthEnd)
{
    var result;

    result = Math.floor(Math.random() * (lengthEnd + 1) + lengthStart);
    return result; 
}

    //邮箱输入事件函数
function mailNameFunc(){
    hintColor(mailNameHint,0);

    var str = mailNameText.value;
    
    if(str.length == 0)
    {
       mailNameHint.innerText = "不能为空";
       return false;
        
    }else   if(str.length < 6 || str.length > 18)
            {
                mailNameHint.innerText = "用户名需在6-18字符之间";
                return false;
            }else   if(isNaN(Number(str.charAt(0))) == false)
                    {
                        mailNameHint.innerText = "不能以数字开头";
                        return false;
                    }else   if(ifStringIn(str,mailNameDict) == false)
                            {
                                mailNameHint.innerText = "用户名不能含有特殊字符";
                                return false;
                            }else   if(str.charAt(0) == "." || str.charAt(0) == "_" || str.charAt(0) == "-")
                                    {
                                        mailNameHint.innerText = "不能以特殊字符开头";
                                        return false;
                                    }else{
                                        mailNameHint.style.color = "rgb(82, 189, 82)";
                                        hintImgs[0].innerHTML = "<img src=\"../image/judge/right.jpg\"/>"
                                        mailNameHint.innerText = "恭喜您！可以注册";
                                        return true;
                                    }
}
    //第一次密码框输入事件函数
function pswdFunc(){
    hintColor(pswdHint,1);

    var str = pswdText.value;

    if(str.length == 0)
    {
        pswdHint.innerText = "不能为空";
        return false;
    }else   if(str.length < 6 || str.length > 18)
            {
                pswdHint.innerText = "密码须在6-18字符之间";
                return false;
            }else   if(ifStringIn(str,pswdDict) == false || ifStringIn(str,englishWordDict) == true || ifStringIn(str,numDict) == true)
                    {
                        pswdHint.innerText = "请尝试“字母+数字”的组合";
                        return false;
                    }else{
                        pswdHint.innerText = "";
                        hintImgs[1].innerHTML = "<img src=\"../image/judge/right.jpg\"/>";
                        return true;
                    }
}
    //第二次密码输入事件函数（即判断这两个字符串是否相同）
function secPswdFunc(){
    hintColor(secPswdHint,2);

    var str1 = pswdText.value;
    var str2 = secPswdText.value;

    if(str2.length == 0)
    {
        secPswdHint.innerText = "不能为空";
        return false;
    }else   if(str1 != str2)
            {
                secPswdHint.innerText = "两次密码不一致";
                return false;
            }else{
                hintImgs[2].innerHTML = "<img src=\"../image/judge/right.jpg\"/>";
                secPswdHint.innerText = "";
                return true;
            }
}
    //手机好输入框事件函数
function phoneNumFunc(){
    hintColor(phoneNumHint,3);

    var str = phoneNumText.value;
    var telephoneArea = "";
    var area = "";
 

    if(str.length == 0)
    {
        phoneNumHint.innerText = "不能为空";
        return false;
    }else   if(str.length != 11 || ifStringIn(str,numDict) == false)
            {
                phoneNumHint.innerText = "手机号输入有误";
                return false;
            }else{
                //运营商判断
                var telephoneAreaNum = Number(str.substring(0,3));
                var areaNum = Number(str.substring(3,7));

                switch(telephoneAreaNum)
                {
                    case 133:telephoneArea = "中国电信";break;
                    case 153:telephoneArea = "中国电信";break;
                    case 180:telephoneArea = "中国电信";break;
                    case 181:telephoneArea = "中国电信";break;
                    case 189:telephoneArea = "中国电信";break;
                    case 173:telephoneArea = "中国电信";break;
                    case 177:telephoneArea = "中国电信";break;
                    case 130:telephoneArea = "中国联通";break;
                    case 131:telephoneArea = "中国联通";break;
                    case 132:telephoneArea = "中国联通";break;
                    case 155:telephoneArea = "中国联通";break;
                    case 156:telephoneArea = "中国联通";break;
                    case 185:telephoneArea = "中国联通";break;
                    case 186:telephoneArea = "中国联通";break;
                    case 145:telephoneArea = "中国联通";break;
                    case 176:telephoneArea = "中国联通";break;
                    case 185:telephoneArea = "中国联通";break;
                    case 134:telephoneArea = "中国移动";break;
                    case 135:telephoneArea = "中国移动";break;
                    case 136:telephoneArea = "中国移动";break;
                    case 137:telephoneArea = "中国移动";break;
                    case 138:telephoneArea = "中国移动";break;
                    case 139:telephoneArea = "中国移动";break;
                    case 150:telephoneArea = "中国移动";break;
                    case 151:telephoneArea = "中国移动";break;
                    case 152:telephoneArea = "中国移动";break;
                    case 158:telephoneArea = "中国移动";break;
                    case 159:telephoneArea = "中国移动";break;
                    case 182:telephoneArea = "中国移动";break;
                    case 183:telephoneArea = "中国移动";break;
                    case 184:telephoneArea = "中国移动";break;
                    case 147:telephoneArea = "中国移动";break;
                    case 178:telephoneArea = "中国移动";break;
                    case 184:telephoneArea = "中国移动";break;
                    default:telephoneArea = "未知运营商";
                }
                //地区判断
                if(areaNum >= 0 && areaNum <= 294)
                {
                    area = "河北省";
                }else   
                if(areaNum > 294 && areaNum <= 588)
                {
                    area = "山东省";
                }else   
                if(areaNum > 588 && areaNum <= 882)
                {
                    area = "辽宁省";
                }else   
                if(areaNum > 882 && areaNum <= 1176)
                {
                    area = "黑龙江省";
                }else   
                if(areaNum > 1176 && areaNum <= 1470)
                {
                    area = "甘肃省";
                }else   
                if(areaNum > 1470 && areaNum <= 1764)
                {
                    area = "吉林省";
                }else   
                if(areaNum > 1764 && areaNum <= 2058)
                {
                    area = "青海省";
                }else   
                if(areaNum > 2058 && areaNum <= 2352)
                {
                    area = "河南省";
                }else   
                if(areaNum > 2352 && areaNum <= 2646)
                {
                    area = "江苏省";
                }else   
                if(areaNum > 2646 && areaNum <= 2940)
                {
                    area = "湖北省";
                }else   
                if(areaNum > 2940 && areaNum <= 3234)
                {
                    area = "湖南省";
                }else   
                if(areaNum > 3234 && areaNum <= 3528)
                {
                    area = "浙江省";
                }else   
                if(areaNum > 3528 && areaNum <= 3822)
                {
                    area = "江西省";
                }else   
                if(areaNum > 3822 && areaNum <= 4116)
                {
                    area = "广东省";
                }else   
                if(areaNum > 4116 && areaNum <= 4410)
                {
                    area = "云南省";
                }else
                if(areaNum > 4410 && areaNum <= 4704)
                {
                    area = "福建省";
                }else
                if(areaNum > 4704 && areaNum <= 4998)
                {
                    area = "台湾省";
                }else
                if(areaNum > 4998 && areaNum <= 5292)
                {
                    area = "海南省";
                }else
                if(areaNum > 5292 && areaNum <= 5586)
                {
                    area = "山西省";
                }else
                if(areaNum > 5586 && areaNum <= 5880)
                {
                    area = "四川省";
                }else
                if(areaNum > 5880 && areaNum <= 6174)
                {
                    area = "陕西省";
                }else
                if(areaNum > 6174 && areaNum <= 6468)
                {
                    area = "贵州省";
                }else
                if(areaNum > 6468 && areaNum <= 6762)
                {
                    area = "安徽省";
                }else
                if(areaNum > 6762 && areaNum <= 7056)
                {
                    area = "北京市";
                }else
                if(areaNum > 7056 && areaNum <= 7350)
                {
                    area = "重庆市";
                }else
                if(areaNum > 7350 && areaNum <= 7644)
                {
                    area = "上海市";
                }else
                if(areaNum > 7644 && areaNum <= 7938)
                {
                    area = "天津市";
                }else
                if(areaNum > 7938 && areaNum <= 8232)
                {
                    area = "内蒙古自治区";
                }else
                if(areaNum > 8232 && areaNum <= 8526)
                {
                    area = "广西藏族自治区";
                }else
                if(areaNum > 8526 && areaNum <= 8820)
                {
                    area = "西藏自治区";
                }else
                if(areaNum > 8820 && areaNum <= 9114)
                {
                    area = "新疆维吾尔自治区";
                }else
                if(areaNum > 9114 && areaNum <= 9408)
                {
                    area = "宁夏回族自治区";
                }else
                if(areaNum > 9408 && areaNum <= 9502)
                {
                    area = "澳门特别行政区";
                }else
                if(areaNum > 9502 && areaNum <= 9999)
                {
                    area = "香港特别行政区";
                }

                phoneNumHint.innerHTML = "运营商：" + telephoneArea + "<br/>归属地：" + area;
                hintImgs[3].innerHTML = "<img src=\"../image/judge/right.jpg\"/>";
                phoneNumHint.style.color = "rgb(82, 189, 82)";
                return true;
            } 
}

    //验证信息按钮1事件函数
function verifyBton1Func(){
    verifyBton1.style.color = "rgb(82, 189, 82)";
    verifyImgHint1.style.backgroundColor = "rgba(42, 225, 42, 0.639)";
    verifyBton2.style.color = "black";
    verifyImgHint2.style.backgroundColor = "white";

    if(mailNameFunc() == true && pswdFunc() == true && secPswdFunc() == true && phoneNumFunc() == true)
    {
        verify.innerHTML = "<p style=\"font-size:15px;color:grey;\">请使用微信<img src=\"../image/wx_icon.png\"/>扫描二维码验证</p> <img style=\"height:150px;width:150px;\" src=\"../image/makunWX.jpg\"/>";
        wxFlag = 1;
        return true;
    }else{
        verify.innerHTML = "<p style=\"font-size:15px;color:grey;\">请使用微信<img src=\"../image/wx_icon.png\"/>扫描二维码验证</p> <img style=\"height:150px;width:150px;\" src=\"../image/code_icon.png\"/>";
        wxFlag = -1;
        return false;
    }
}

    //验证信息按钮2事件函数
function verifyBton2Func(){
    var randomStr = "";
    var i;

    verifyBton2.style.color = "rgb(82, 189, 82)";
    verifyImgHint2.style.backgroundColor = "rgba(42, 225, 42, 0.639)";
    verifyBton1.style.color = "black";
    verifyImgHint1.style.backgroundColor = "white";

    for(i = 0;i < 4;i++)
    {
        randomStr += pswdDict.charAt(produceRandom(0,61));
    }

    if(mailNameFunc() == true && pswdFunc() == true && secPswdFunc() == true && phoneNumFunc() == true)
    {
        verify.innerHTML = "<br/><br/><span id=\"randomHint\">请在输入栏中输入右侧验证码</span><br/><input type=\"text\" id=\"randomText\"/>" + randomStr + "<br/><br/><br/><input id=\"randomSubmit\" type=\"submit\" value=\"提交验证\" />";
    }else{
        verify.innerHTML = "<br/><br/><br/><span id=\"randomHintCant\">请填写注册信息<br/><br/>后生成验证码</span>";
        return false;
    }

    var randomSubmit = document.getElementById("randomSubmit");
    
    function randomSubmitFunc(){
        var randomText = document.getElementById("randomText");
        var userRandomStr = randomText.value;
        var userDisposeText = userRandomStr.toUpperCase();
        var systemDisposeText = randomStr.toUpperCase();

        if(userDisposeText == systemDisposeText)
        {
            randomSubmit.value = "验证成功";
            randomSubmit.disabled = true;
            randomFlag = 1;
            return true;
        }else{
            randomSubmit.value = "验证失败,请重新验证";
            randomFlag = -1;
            return false;
        }
    }
    randomSubmit.onclick = randomSubmitFunc;
}

    //判断服务条款按钮是否已勾选
function serveIfRead(){
    if(serveCheckbox.checked == true)
    {
        return true;
    }else{
        return false;
    }
}

    //注册按钮点击事件
function sbmitBtonClickFunc(){
    if(mailNameFunc() == false)
    {
        alert("请填写邮箱号");
    }else
    if(pswdFunc() == false)
    {
        alert("请填写密码");
    }else
    if(secPswdFunc() == false)
    {
        alert("请确认密码");
    }else
    if(phoneNumFunc() == false)
    {
        alert("请填写手机号码");
    }else
    if(wxFlag == -1)
    {
        alert("请选择其中一种验证方式");
    }
    else
    if(randomFlag == -1)
    {
        alert("验证码验证错误，请重新验证");
    }else
    if(serveIfRead() == false)
    {
        alert("请认真阅读“服务条款”并勾选“我已阅读”");
    }else
    if(serveIfRead() == true && mailNameFunc() == true && pswdFunc() == true && secPswdFunc() == true && phoneNumFunc() == true && randomFlag == 1)
    {
        window.location.replace("succeed.html");
    }else
    if(serveIfRead() == true && mailNameFunc() == true && pswdFunc() == true && secPswdFunc() == true && phoneNumFunc() == true && wxFlag == 1)
    {
        window.location.replace("succeed.html");
    }else
    {
        alert("未知错误！！！");
    }
    return false;
}