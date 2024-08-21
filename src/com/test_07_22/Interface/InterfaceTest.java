package com.test_07_22.Interface;

public class InterfaceTest {
    public static void main(String[] args) {
        // 电脑
        Computer computer = new Computer();

        // 相机 创建接口实现类的对象
        Camera camera = new Camera();
        System.out.println(camera.length);
        computer.transferData(camera);

        System.out.println("===============================");

        //   打印机 创建接口实现类的匿名对象
        Printer printer = new Printer();
        System.out.println(printer.width);
        computer.transferData(printer);

        System.out.println("===============================");

        //创建接口匿名实现类的对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("USB开始");
            }

            @Override
            public void stop() {
                System.out.println("USB结束");
            }
        });
    }
}

class Computer {
    public void transferData(USB usb) {
        System.out.println("设备连接成功...");
        usb.start();

        System.out.println("数据传输中...");
        usb.stop();
    }
}

interface USBprop {
    int length = 10;
    int width = 20;
    int height = 10;
}

interface USB {
    void start();
    void stop();
}

interface USBall extends USB, USBprop {}


// 照相机
class Camera implements USBall {
    @Override
    public void start() {
        System.out.println("相机开始工作。");
    }

    @Override
    public void stop() {
        System.out.println("相机工作结束");
    }
}

// 打印机
class Printer implements USBall {
    @Override
    public void start() {
        System.out.println("打印机开始工作。");
    }

    @Override
    public void stop() {
        System.out.println("打印机工作结束");
    }
}