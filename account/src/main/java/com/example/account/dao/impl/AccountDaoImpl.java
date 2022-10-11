package com.example.account.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import com.example.account.dao.AccountDao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.account.model.Account;
@Repository
public class AccountDaoImpl implements AccountDao {

    // define field for entitymanager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public AccountDaoImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Account> findAll() {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create a query
        Query theQuery =
                currentSession.createQuery("from Account", Account.class);

        // execute query and get result list
        List accounts = theQuery.getResultList();

        // return the results
        return accounts;
    }


    @Override
    public Account findById(int theId) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the employee
        Account theAccount =
                currentSession.get(Account.class, theId);

        // return the employee
        return theAccount;
    }


    @Override
    public void save(Account theAccount) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // save employee
        currentSession.saveOrUpdate(theAccount);
    }


    @Override
    public void deleteById(int theId) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // delete object with primary key
        Query theQuery =
                currentSession.createQuery(
                        "delete from Account where id=:accountId");
        theQuery.setParameter("accountId", theId);

        theQuery.executeUpdate();
    }
}