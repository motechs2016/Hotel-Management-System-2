package service.BrowseOrderService._stub;

import VO.OrderInfoVO;
import service.BrowseOrderService.BrowseOrderService;
import util.OrderType;
import util.RoomType;

public class BrowseOrderService_stub implements BrowseOrderService {

	OrderInfoVO orderInfoVO=new OrderInfoVO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

    public OrderInfoVO getOrderInfo(String orderID) {
        return orderInfoVO;
    }
	
}
