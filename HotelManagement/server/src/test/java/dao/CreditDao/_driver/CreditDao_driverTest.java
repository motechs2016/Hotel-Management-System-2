package dao.CreditDao._driver;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import PO.CreditPO;
import dao.CreditDao.CreditDao;
import dao.CreditDao._stub.CreditDao_stub;

/**
 * 
 * @author insomnia
 * @version Oct 16,2016
 */
public class CreditDao_driverTest {
	static CreditDao creditDao;
	@BeforeClass
	public static void before(){
		creditDao=new CreditDao_stub();
	}
	@Test
	public void showCreditInfoTest(){
		assertNotNull(creditDao.showCreditInfo("github"));
	}
	@Test
	public void addNewCreditInfoTest(){
		CreditPO credit=new CreditPO("github","112233445566778899","2016.10.16:23:59:59","执行");
        assertEquals(true, creditDao.addNewCreditInfo(credit));
	}
	
	

}
