package service.ExecutionService._stub;

import VO.OrderInfoVO;
import service.ExecutionService.ExecutionService;
import util.Message;
import util.OrderType;
import util.RoomType;

public class ExecutionService_stub implements ExecutionService{
	OrderInfoVO orderInfoVO=new OrderInfoVO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

    public OrderInfoVO getOrderInfo(String orderID) {
        return orderInfoVO;
    }
    public Message changeOrderState(String orderID, OrderType orderType) {
        return Message.SUCCESS;
    }

}
