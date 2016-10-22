package dao.CheckOrderDao._stub;

import PO.OrderPO;
import dao.CheckOrderDao.CheckOrderDao;
import util.OrderType;
import util.UserType;

/**
 * 
 * @author insomnia
 *
 */

public class CheckOrderDao_stub implements CheckOrderDao {
	
	 public OrderPO[] getOrderList(String username, UserType userType, OrderType orderType) {
	        return new OrderPO[0];
	    }

}
