package com.example.account.services;

import java.util.List;

import com.example.account.model.Account;
public interface AccountService {

    public List<Account> findAll();

    public Account findById(int theId);

    public void save(Account theAccount);

    public void deleteById(int theId);
}