package service.RechargeService._driver;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import service.RechargeService.RechargeService;
import service.RechargeService._stub.RechargeService_stub;
import util.Message;
/**
 * 
 * @author insomnia
 *
 */

public class RechargeService_driverTest {
	
	static RechargeService rechargeService;
	@BeforeClass
	public static void before(){
		rechargeService=new RechargeService_stub();
		
	}
	@Test
	public void rechargeTest(){
		assertEquals(rechargeService.recharge("000",100),Message.SUCCESS);
		assertEquals(rechargeService.recharge("001", 100), Message.FAIL);
		assertEquals(rechargeService.recharge("002", 100), Message.NOT_COMPLETE);
	}
}
