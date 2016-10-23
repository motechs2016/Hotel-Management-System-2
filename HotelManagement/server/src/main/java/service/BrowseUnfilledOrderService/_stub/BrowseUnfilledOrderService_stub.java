package service.BrowseUnfilledOrderService._stub;

import VO.OrderInfoVO;
import service.BrowseUnfilledOrderService.BrowseUnfilledOrderService;
import util.OrderType;
import util.RoomType;

public class BrowseUnfilledOrderService_stub implements BrowseUnfilledOrderService{

	OrderInfoVO orderInfoVO=new OrderInfoVO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

    public OrderInfoVO getOrderInfo(String orderID) {
        return orderInfoVO;
    }
	
}
