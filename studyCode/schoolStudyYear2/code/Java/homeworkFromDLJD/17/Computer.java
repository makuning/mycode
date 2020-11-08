package com.makun.computer.computer;

import com.makun.computer.link.*;

public class Computer{
    private InsertDrawable[] inser;

    public Computer(int amount){
        this.inser = new InsertDrawable[amount];
        
        System.out.println("您有一台拥有" + amount + "个接口的笔记本~");
    }
    public Computer(){
        System.out.println("您有一台拥有没有接口的笔记本~");
    }

    // 修改接口数量的方法
    public void modLink(){
        boolean ifBreakAll = true;

        for(int i = 0;i < inser.length;i++){
            if(inser[i] != null){
                ifBreakAll = false;
                break;
            }
        }

        if(ifBreakAll == false){
            System.out.println("请先拔掉所有的接口再进行更改。");
            return;
        }else{
            System.out.println("请输入您想要更改为个接口（0-10的整数）");

            java.util.Scanner sc = new java.util.Scanner(System.in);
            
            int amount = -2;
            int flag = 0;
            do{
                if(amount == -1){
                    System.out.println("宁已退出修改~");
                    return;
                }
                if(flag > 0){
                    System.out.println("宁输入的数不符合要求，请重新输入0-10的整数，你也可以输入-1以退出修改。");
                }
                amount = sc.nextInt();
                flag++;
            }while(amount < 0 && amount > 10);

            this.inser = new InsertDrawable[amount];

        }   
    }

    // 连接设备的方法
    public void link(InsertDrawable inser){
        boolean isLink = false;
        int i;

        for(i = 0;i < this.inser.length;i++){
            if(this.inser[i] == null){
                this.inser[i] = inser;
                isLink = true;
                break;
            }
        }

        if(isLink == true){
            System.out.println("宁把" + inser.getDeviceName() + "连接在了" + (i + 1) + "号口上。");
        }else{
            System.out.println("接口全被插满了，需要您先拔掉一个接口哦。");
        }
    }

    // 断开所有接口的方法
    public void outLint(){
        for(int i = 0;i < this.inser.length;i++){
            if(this.inser[i] != null){
                System.out.println("宁把" + this.inser[i].getDeviceName() + "从" + (i + 1) + "号口上拔了下来。");
                this.inser[i] = null;
            }
        }
        System.out.println("宁已断开所有的接口。");
        return;
    }

    // 断开某个接口的方法
    public void outLint(InsertDrawable inser){
        for(int i = 0;i < this.inser.length;i++){
            if(this.inser[i] == inser){
                System.out.println("宁把" + inser.getDeviceName() + "从" + (i+1) + "号口上拔了下来。");
                this.inser[i] = null;
                return;
            }
        }
    }

    public InsertDrawable[] getInser() {
        return inser;
    }
    public void setInser(InsertDrawable[] inser) {
        this.inser = inser;
    }
}