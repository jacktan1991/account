package io.jack.mvn.studycase.account.persist;

import io.jack.mvn.studycase.account.vo.Account;

public interface AccountPersistService {

    Account createAccount(Account account) throws AccountPersistException;

    Account findAccountById(String id) throws AccountPersistException;

    Account updateAccount(Account account) throws AccountPersistException;

    void deleteAccount(String id) throws AccountPersistException;
}