package io.jack.mvn.studycase.account.vo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Account {
    private String id;
    private String name;
    private String email;
    private String password;
    private boolean activated;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     * @return the account itself
     */
    public Account setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     * @return the account itself
     */
    public Account setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     *            the email to set
     * @return the account itself
     */
    public Account setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     * @return the account itself
     */
    public Account setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * @return the activated
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * @param activated
     *            the activated to set
     * @return the account itself
     */
    public Account setActivated(boolean activated) {
        this.activated = activated;
        return this;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                ToStringStyle.JSON_STYLE);
    }
}