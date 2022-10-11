package com.example.account.services.impl;
import java.util.List;

import com.example.account.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.account.model.Account;
import com.example.account.dao.AccountDao;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Autowired
    public AccountServiceImpl(AccountDao theAccountDao) {
        accountDao = theAccountDao;
    }

    @Override
    @Transactional
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    @Transactional
    public Account findById(int theId) {
        return accountDao.findById(theId);
    }

    @Override
    @Transactional
    public void save(Account theAccount) {
        accountDao.save(theAccount);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        accountDao.deleteById(theId);
    }
}