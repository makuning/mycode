package com.makun.javase.exception.userregistered;

// 用户注册
public class UserService {
    // 这个类有一个注册方法（我设置为静态的）
    public static void register (String userName,String password) throws MyRegisterException {
        // 如果userName的长度在4-16个长度之外就会有异常
        if (userName.length() < 4) {
            // 抛出异常
            throw new MyRegisterException("用户名长度不能小于4！");
        } else if (userName.length() > 16) {
            // 抛出异常
            throw new MyRegisterException("用户名长度不能大于16！");
        } else {
            System.out.println("恭喜你注册成功！[姓名:" + userName + "\t密码:" + password +"]");
        }
    }
}
