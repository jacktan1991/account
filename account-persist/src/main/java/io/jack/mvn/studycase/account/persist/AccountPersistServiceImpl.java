package io.jack.mvn.studycase.account.persist;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import io.jack.mvn.studycase.account.vo.Account;

public class AccountPersistServiceImpl implements AccountPersistService {

    private static final String ELEMENT_ACCOUNTS = null;

    private static final String ELEMENT_ACCOUNTS_ID = null;

    private static final String ELEMENT_ACCOUNTS_NAME = null;

    private String file;
    
    private SAXReader reader;
    
    public AccountPersistServiceImpl () {
        reader = new SAXReader();
    }
    
    private Document readDocument() throws AccountPersistException {
        //TODO:uncomplete
        return null;
    }
    
    private void writeDocument(Document doc) throws AccountPersistException {
        //TODO:uncomplete
    }
    
    public Account createAccount(Account account) throws AccountPersistException {
        //TODO:uncomplete
        return null;
    }

    public Account findAccountById(String id) throws AccountPersistException {
        Document doc = null;
        
        Element accountsEle = doc.getRootElement().element(ELEMENT_ACCOUNTS);
        
        for (Element account_cell : (List<Element>)accountsEle.elements()) {
            if (account_cell.elementText(ELEMENT_ACCOUNTS_ID).equals(id)) {
                return buildAccount(account_cell);
            }
        }
        
        return null;
    }
    
    private Account buildAccount(Element accountEle) {
        Account account = new Account();
        
        account.setId(accountEle.elementText(ELEMENT_ACCOUNTS_ID))
            .setName(accountEle.elementText(ELEMENT_ACCOUNTS_NAME));
        
        return account;
    }

    public Account updateAccount(Account account) throws AccountPersistException {
        //TODO:uncomplete
        return null;
    }

    public void deleteAccount(String id) throws AccountPersistException {
        
    }
}