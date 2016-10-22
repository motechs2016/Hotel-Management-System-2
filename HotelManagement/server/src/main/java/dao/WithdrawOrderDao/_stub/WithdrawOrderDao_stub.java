package dao.WithdrawOrderDao._stub;

import PO.OrderPO;
import dao.WithdrawOrderDao.WithdrawOrderDao;
import util.OrderType;
import util.UserType;

/**
 * 
 * @author insomnia
 *
 */

public class WithdrawOrderDao_stub implements WithdrawOrderDao{
	
    public boolean updateOrder(OrderPO orderPO) {
        if (orderPO!=null){
            return true;
        }else{
            return false;
        }
    }

    public OrderPO[] getOrderList(String username, UserType userType, OrderType orderType) {
        return new OrderPO[0];
    }

}
