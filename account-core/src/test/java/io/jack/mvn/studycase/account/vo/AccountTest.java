/**
 * 
 */
package io.jack.mvn.studycase.account.vo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Jack
 *
 */
public class AccountTest {

    private static final String CONST_ID = "#007";
    private static final String CONST_NAME = "Jack";
    private static final String CONST_EMAIL = "jack@gmail.com";
    private static final String CONST_PWD = "admin";
    private static final boolean CONST_ACTIVE = false;
    Account testAccount;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() {
        testAccount = new Account();
    }

    /**
     * Test method for
     * {@link io.jack.mvn.studycase.account.vo.Account#toString()}.
     */
    @Test
    public final void testToString() {

        testAccount.setId(CONST_ID)
                .setName(CONST_NAME)
                .setEmail(CONST_EMAIL)
                .setPassword(CONST_PWD)
                .setActivated(CONST_ACTIVE);

        String json_account = String
                .format("{\"id\":\"%s\",\"name\":\"%s\",\"email\":\"%s\",\"password\":\"%s\",\"activated\":%b}",
                        CONST_ID, CONST_NAME, CONST_EMAIL, CONST_PWD, CONST_ACTIVE);

        assertEquals(json_account, testAccount.toString());
    }

}
