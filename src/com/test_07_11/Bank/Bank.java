package com.test_07_11.Bank;

public class Bank {
    private Customer[] customers;   // 客户的数组
    private int customerCount;  // 客户的个数
    public Bank() {
        customers = new Customer[10];
    }

    public Customer[] getCustomers() {
        return customers;
    }

    /**
     * 添加用户
     * @param name  用户的姓名
     * @return Customer  // 新增的用户信息
     */
    public Customer addCustomer(String name) {
        Customer newCustomer =  new Customer(name);
        if(customerCount == customers.length) {
            Customer[] newCustomers = new Customer[customers.length + 10];
            for(int i = 0; i < newCustomers.length; i++) {
                newCustomers[i] = customers[i];
            }
        }
        this.customers[customerCount++] = newCustomer;
        return newCustomer;
    }

    /**
     * 用户列表中存储的用户个数
     * @return  int
     */
    public int getCustomerCount() {
        return customerCount;
    }

    /**
     * 获取指定索引的客户
     * @param index
     * @return Customer
     */
    public Customer getCustomer(int index) {
        if(index < 0 || index >= customerCount) {
            return null;
        }
        return customers[index];
    }
}
