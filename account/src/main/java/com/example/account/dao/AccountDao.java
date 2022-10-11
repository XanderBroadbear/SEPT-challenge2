package com.example.account.dao;

import java.util.List;

import com.example.account.model.Account;
public interface AccountDao {

    public List findAll();

    public Account findById(int theId);

    public void save(Account theAccount);

    public void deleteById(int theId);

}