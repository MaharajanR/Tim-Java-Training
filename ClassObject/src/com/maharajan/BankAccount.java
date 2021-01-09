package com.maharajan;

public class BankAccount {
    private String accNum;
    private double balance;
    private String cusName;
    private String email;
    private String phoneNum;

    public BankAccount() {
        this("10002", 500.0d, "Priya", "maha@mail.com", "(+91 123456789)");
        System.out.println("Default construction called");
    }

    public BankAccount(String accNum, double balance, String cusName, String email, String phoneNum) {
        System.out.println("Constructor OverLoading called");
        this.accNum = accNum;
        this.balance = balance;
        this.cusName = cusName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void depositFunds(double depAmount) {
        System.out.println("Deposit amount =" + depAmount);
        balance += depAmount;
    }

    public void withdrawFunds(double withAMount) {
        System.out.println("Depict amount =" + withAMount);
        {
            if (balance - withAMount < 0) {
                System.out.println("No available balance ,You Have= " + balance);
            } else {
                balance -= withAMount;
                System.out.println("Balance funds = " + balance);
            }

        }
    }
}
