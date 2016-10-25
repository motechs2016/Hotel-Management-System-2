package service.ExceptionOrderService._stub;

import VO.ExceptionVO;
import VO.OrderInfoVO;
import service.ExceptionOrderService.ExceptionOrderService;
import util.Message;
import util.OrderType;
import util.RoomType;

public class ExceptionOrderService_stub implements ExceptionOrderService{
	OrderInfoVO orderInfoVO=new OrderInfoVO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

    public OrderInfoVO getOrderInfo(String orderID) {
        return orderInfoVO;
    }
    public Message changeOrder(ExceptionVO exceptionVO) {
        ExceptionVO exceptionVO1=exceptionVO.getExceptionVO();
        return Message.SUCCESS;
    }
}
