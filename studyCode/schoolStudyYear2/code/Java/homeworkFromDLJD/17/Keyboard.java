package com.makun.computer.module;

import com.makun.computer.link.InsertDrawable;

// 键盘类
public class Keyboard implements InsertDrawable{
    private String name = "键盘";

    @Override
    public void link() {
        System.out.println("你连接了一个" + this.name);
    }
    @Override
    public String getDeviceName() {
        return this.name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
