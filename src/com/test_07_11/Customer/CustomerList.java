package com.test_07_11.Customer;

public class CustomerList {
    private Customer[] customers;
    private int size;

    public CustomerList(int length) {
        this.customers = new Customer[length];
    }

    public int getSize() {
        return size;
    }

    /**
     * 获取用户信息
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {
        if(index <= size && index >0) {
            return customers[index-1];
        } else {
            return null;
        }
    }

    /**
     * 添加用户
     * @param Customer
     */
    public void addCustomer(Customer customer) {
        if(size == customers.length) {
            Customer[] newCustomers = new Customer[size + 10];
            for (int i = 0; i < customers.length; i++) {
                newCustomers[i] = customers[i];
            }
            customers = newCustomers;
        }
        customers[size++] = customer;
    }

    /**
     * 删除用户
     * @param index
     */
    public boolean removeCustomer(int index) {
        if(index > size || index <= 0) {
            return false;
        }
        for(int i = index; i <size; i++) {
            customers[i-1] = customers[i];
        }
        customers[--size] = null;
        return true;
    }

    /**
     * 修改用户信息
     * @param index
     * @param customer
     */
    public boolean updateCustomers(int index, Customer customer) {
        if(index >0 && index <= size) {
            customers[index-1] = customer;
            return true;
        }
        return false;
    }

    /**
     * 查看用户
     */
    public void showCustomers() {
        for(int i = 0; i < size; i++) {
            System.out.println((i + 1) + "\t" +  customers[i].getInfo());
        }
    }

}
