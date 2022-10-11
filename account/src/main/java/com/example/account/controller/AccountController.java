package com.example.account.controller;
import com.example.account.model.Account;
import com.example.account.services.AccountService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private AccountService accountService;
    @Autowired
    public AccountController(AccountService theAccountService) {
        accountService = theAccountService;
    }

    @GetMapping("/accounts")
    public List<Account> findAll() {
        return accountService.findAll();
    }

    @GetMapping("/accounts/{accountId}")
    public Account getAccount(@PathVariable int accountId) {

        Account theAccount = accountService.findById(accountId);

        if (theAccount == null) {
            throw new RuntimeException("account id not found - " + accountId);
        }

        return theAccount;
    }

    @PostMapping("/accounts")
    public Account addAccount(@RequestBody Account theAccount) {

        //theAccount.setId(0);

        accountService.save(theAccount);

        return theAccount;
    }

    @PutMapping("/accounts")
    public Account updateAccount(@RequestBody Account theAccount) {

        accountService.save(theAccount);

        return theAccount;
    }

    @DeleteMapping("/accounts/{accountId}")
    public String deleteAccount(@PathVariable int accountId) {

        Account tempAccount = accountService.findById(accountId);

        // throw exception if null

        if (tempAccount == null) {
            throw new RuntimeException("account id not found - " + accountId);
        }

        accountService.deleteById(accountId);

        return "Deleted account id - " + accountId;
    }


}
