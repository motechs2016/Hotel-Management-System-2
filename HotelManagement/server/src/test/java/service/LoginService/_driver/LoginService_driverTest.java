package service.LoginService._driver;

import static org.junit.Assert.*;

import VO.LoginVO;
import VO.RegisterVO;
import org.junit.BeforeClass;
import org.junit.Test;
import service.LoginService.LoginService;
import service.LoginService._stub.LoginService_stub;
import util.Message;
import util.UserType;

public class LoginService_driverTest {

    static LoginService loginService;
    @BeforeClass
    public static void before(){
        loginService=new LoginService_stub();
    }
    @Test
    public void loginTest() {
        assertEquals(Message.SUCCESS,loginService.login(new LoginVO("root","root")));
        assertEquals(Message.NOT_COMPLETE,loginService.login(new LoginVO("root",null)));
    }

    @Test
    public void registerTest(){
        assertEquals(Message.SUCCESS,loginService.register(new RegisterVO(UserType.HOTELSTAFF,"root","root",null,null)));

    }

}

