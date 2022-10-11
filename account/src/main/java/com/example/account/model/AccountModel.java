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
public class AccountModel {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String accountType;
        private int accountNumber;

        private String accountName;

        private double balance;

        private String date;


        public Long getId() {
            return id;
        }
        public void setId(Long id) {
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
