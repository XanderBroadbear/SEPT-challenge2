package com.example.account.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "account")
public class Account {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String accountType;

    @Column(nullable = false)

    private int accountNumber;
    @Column(nullable = false)
    private String accountName;
    @Column(nullable = false)
    private double balance;
    @Column(nullable = false)
    private String date;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber() {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountType) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance() {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String accountType) {
        this.date = date;
    }

}
