package com.makun.javase.iostream.directorycopy;

import java.io.*;

// 用于尝试对目录的复制粘贴
public class DirectoryCopyTest01 {
    public static void main(String[] args) {
        String directoryForCopy = "E:\\schoolStudyYear2\\notebook\\Java";
        String directoryForCopyTo = "E:\\schoolStudyYear2\\notebook\\JavaCopy";
        File originalFile = new File(directoryForCopy);
        File goalFile = new File(directoryForCopyTo);

        // 调用复制路径的方法
        try {
            DirectoryCopyTest01.directoryCopy3(originalFile,goalFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    * 程序思路：
    * 1、因为拷贝的目录可能是一个目录套目录的结构，也可能就是一个文件
    *   所以遇到文件就应该复制后终止程序，但是遇到的是目录就继续复制直到文件复制完后才终止程序、
    *   这里就应该使用递归的方法
    * 2、程序分两种情况
    *   2.1：第一种情况
    *       如果只是文件，那么复制后就终止程序
    *   2.2：第二种情况
    *       如果是目录，就挨个找到它下面的文件，如果还是目录就递归（并创建这个目录），如果只是文件就复制
    *       这个程序有不确定因素，所以使用递归，这个程序的宗旨就是看一个文件，它是目录就新建这个目录，然后再往下找
    *       它下面是目录就新建这个目录，下面是文件，就将文件复制到这个文件的父目录下
    *       然后又到新建的目录下重复这个操作
    * */

    // 看了动力节点后做的1（这个程序相对较好）

    /**
     * 这个方法用来复制目录或文件
     * 程序思路：
     * 1、因为拷贝的目录可能是一个目录套目录的结构，也可能就是一个文件
     *   所以遇到文件就应该复制后终止程序，但是遇到的是目录就继续复制直到文件复制完后才终止程序、
     *   这里就应该使用递归的方法
     * 2、程序分两种情况
     *   2.1：第一种情况
     *       如果只是文件，那么复制后就终止程序
     *   2.2：第二种情况
     *       如果是目录，就挨个找到它下面的文件，如果还是目录就递归（并创建这个目录），如果只是文件就复制
     *       这个程序有不确定因素，所以使用递归，这个程序的宗旨就是看一个文件，它是目录就新建这个目录，然后再往下找
     *       它下面是目录就新建这个目录，下面是文件，就将文件复制到这个文件的父目录下
     *       然后又到新建的目录下重复这个操作
     * 3、如果复制到的地址是文件的话，需要做一个判断，如果需要复制的和复制到的都是文件，那么可以，
     *  但是需要复制的是个目录，那么就不能通过，需要输出提示信息
     * @param originalFile 需要复制的文件
     * @param goalFile 文件复制到的地址
     */
    public static void directoryCopy3(File originalFile,File goalFile) throws IOException {
        // 如果需要复制的文件或者目录不存在的话，就抛异常，然后结束这个程序
        if(!originalFile.exists()) {
            // 一旦上报，当前方法就结束
            throw new FileNotFoundException("您需要复制的文件不存在！");
        }

        // 如果复制到的地址是一个文件，就抛异常，然后结束这个程序
        if(goalFile.isFile()) {
            throw new FileNotFoundException("复制到的地址必须为一个目录！");
        }

        // 如果目标目录不存在，或者是一个文件的话，就创建这个目录
        if(!goalFile.exists()) {
            // 规定用户必须将文件复制到的地址设置为目录
            goalFile.mkdirs();
        }


        // 定义一个用来装读到的字节的数组
        byte[] bytes = new byte[1024 * 1024];   // 表示一次复制1MB

        // 第一种情况（需要复制的是一个文件）
        if(originalFile.isFile()) {
            // 开始复制到当前目录 当前的goalFile
            // 定义输出流和输入流
            FileInputStream fis = new FileInputStream(originalFile);
            // 在复制到的目录路径和文件名加个斜杠
            FileOutputStream fos = new FileOutputStream(goalFile + "\\" + originalFile.getName());

            // 循环复制
            int content = 0;
            while((content = fis.read(bytes)) != -1) {
                // 复制
                fos.write(bytes,0,content);
            }

            // 刷新
            fos.flush();

            // 关闭
            fis.close();
            fos.close();

            // 因为需要复制的是一个文件，所以这个文件复制了，程序就可以结束了
            return;
        }
        // 第二种情况（需要复制的是一个目录），
        // 因为判断了需要复制的是否存在，并且它不是一个文件，所以他一定是一个目录
        // 在复制到的目标目录中创建这个目录（如果不存在）
        File file1 = new File(goalFile.getAbsolutePath() + "\\" + originalFile.getName());
        if(!file1.exists()) {
            file1.mkdirs();
        }
        // 然后找到这个需要复制的目录下所有的文件，再使用这个函数
        File[] files = originalFile.listFiles();
        for(File file : files) {
            // 递归
            directoryCopy3(file,file1);
        }

    }



    // 创建一个复制文件的方法
    public static void directoryCopy1(String directoryForCopy,String directoryForCopyTo) {
        // 创建一个File对象，这个路径是我的一个Java笔记
        File f1 = new File(directoryForCopy);
        // 如果f1为空就打印提示信息，并退出程序
        if(!f1.exists()) {
            System.out.println("您需要复制的路径不存在！");
            return;
        }


        // 创建一个File对象，作为我复制目录的地址
        File f2 = new File(directoryForCopyTo);
        // 如果f2这个路径不存在就以目录的形式创建出来
        if(!f2.exists()) {
            f2.mkdirs();
        }

        // 获取f1下所有子文件（目录和文件）
        File[] files = f1.listFiles();

        FileInputStream fis = null;
        FileOutputStream fos = null;
        // 复制所有的文件
        for(File file : files) {
            if(file.isFile()) {
                try {
                    fis = new FileInputStream(f1.getAbsolutePath());
                    fos = new FileOutputStream(f2.getAbsolutePath());

                    // 定义一个字节数组
                    byte[] bytes = new byte[1024 * 1024]; // 1KB/次

                    // 循环复制
                    int content = 0;
                    while((content = fis.read(bytes)) != -1) {
                        fos.write(bytes,0,content);
                    }

                    // 清空管道
                    fos.flush();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    // 关闭管道
                    if(fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(fos != null) {
                        try {
                            fos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }


        // 使用字节流来复制
    }

    // 大佬案例
    public static void directoryCopy2(String directoryForCopy,String directoryForCopyTo) throws IOException {
        // 定义输入的目录
        File parent = new File(directoryForCopy);
        // 定义输出的目录
        File goal = new File(directoryForCopyTo);
        // 如果找不到需要复制的地址就打印提示信息，然后退出
        if(!parent.exists()) {
            System.out.println("您需要复制的目录不存在！");
            return;
        }
        // 如果目标地址不存在就新建
        if(!goal.exists()) {
            goal.mkdirs();
        }

        // 先找到输入文件下的所有文件，目录
        File[] sourceFileArr = parent.listFiles();

        // 循环
        for (int i = 0; i < sourceFileArr.length; i++) {
            // 如果它是文件夹就执行这个
            if (sourceFileArr[i].isDirectory()) {
                // 创建目标地址的子目录
                File file1 = new File(goal.getAbsolutePath() + "/" + sourceFileArr[i].getName());
                if(!file1.exists()) {
                    file1.mkdirs();
                }
                File[] subFile = sourceFileArr[i].listFiles();
                for (int j = 0; j < subFile.length; j++) {

                    BufferedOutputStream bos = new BufferedOutputStream
                            (new FileOutputStream(file1.getAbsolutePath() + "/" + subFile[j].getName()));

                    BufferedInputStream bis =
                            new BufferedInputStream
                                    (new FileInputStream(subFile[j].getAbsolutePath()));


                    int b;
                    while((b = bis.read()) != -1) {
                        bos.write(b);
                    }
                    bis.close();
                    bos.close();
                }
            } else {
                // 如果不是文件夹，是文件，就执行这个

                BufferedOutputStream bos = new BufferedOutputStream
                        (new FileOutputStream(goal.getAbsolutePath() + "/" + sourceFileArr[i].getName()));

                BufferedInputStream bis =
                        new BufferedInputStream
                                (new FileInputStream(sourceFileArr[i].getAbsolutePath()));


                int b;
                while((b = bis.read()) != -1) {
                    bos.write(b);
                }
                bis.close();
                bos.close();
            }
        }
    }

}

