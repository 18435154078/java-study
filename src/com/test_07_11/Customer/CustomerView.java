package com.test_07_11.Customer;

public class CustomerView {
    CMUtility cm = new CMUtility();
    CustomerList customerList = new CustomerList(10);
    boolean flag = true;
    public static void main(String[] args) {
        CustomerView cv = new CustomerView();
        cv.entryMainMenu();
    }
    public void entryMainMenu() {
        int num;
        do {
            num = cm.init();
            switch (num) {
                case 1: addNewCustomers();
                    break;
                case 2: updateCustomers();
                    break;
                case 3: deleteCustomers();
                    break;
                case 4: showCustomers();
                    break;
                case 5: close();
                    break;
                default: System.out.println("输入有误，请重新输入！");
            }
        } while (flag);
    }
    public void addNewCustomers() {
        customerList.addCustomer(cm.addSc());
        System.out.println("添加成功");
    }
    public void updateCustomers() {
        int n = cm.removeSc(customerList.getSize());
        boolean updateResult = customerList.updateCustomers(n, cm.updateSc(customerList.getCustomer(n)));
        if(updateResult) System.out.println("修改成功！！！");
        else System.out.println("没有找到指定客户，请重新输入！");
    }
    public void deleteCustomers() {
        boolean removeResult = customerList.removeCustomer(cm.removeSc(customerList.getSize()));
        if(removeResult) System.out.println("删除成功！！！");
        else System.out.println("没有找到指定客户，请重新输入！");
    }
    public void showCustomers() {
        if(customerList.getSize() == 0) System.out.println("暂无数据");
        else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
            customerList.showCustomers();
        }
    }
    public void close() {
        boolean confirm = cm.closeScan();
        if(confirm) {
            System.out.println("退出成功");
            flag = false;
        }
    }
}
