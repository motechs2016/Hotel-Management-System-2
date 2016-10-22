package service.CheckOrderService._stub;

import VO.OrderInfoVO;
import service.CheckOrderService.CheckOrderService;
import util.OrderType;
import util.UserType;

/**
 * 
 * @author insomnia
 * @version Oct 20 2016
 */

public class CheckOrderService_stub implements CheckOrderService{
	
    public OrderInfoVO[] getOrderList(String userName, UserType userType, OrderType orderType) {
        return new OrderInfoVO[0];
    }

}
