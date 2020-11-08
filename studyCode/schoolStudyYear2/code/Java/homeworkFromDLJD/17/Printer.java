package com.makun.computer.module;

import com.makun.computer.link.InsertDrawable;

// 打印机类
public class Printer implements InsertDrawable{
    private String name = "打印机";

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