package io.jack.mvn.studycase.account.persist;

public class AccountPersistException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 886350737426574940L;

    public AccountPersistException (String msg, Throwable ex) {
        super(msg, ex);
    }
}