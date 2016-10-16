package dao.LoginDao._driver;
import static org.junit.Assert.*;

import PO.ClientPO;
import dao.LoginDao.LoginDao;
import dao.LoginDao._stub.LoginDao_stub;
import org.junit.BeforeClass;
import org.junit.Test;
import util.UserType;

public class LoginDao_driverTest {
    static LoginDao loginDao;
    @BeforeClass
    public static void before(){
        loginDao=new LoginDao_stub();
    }

    @Test
    public void loginTest(){
        assertEquals(true,loginDao.login("root","root"));
    }
    @Test
    public void registerTest(){
        assertEquals(true,loginDao.register(new ClientPO("root",UserType.HOTELSTAFF,"",null,0,0,null)));
    }

}
