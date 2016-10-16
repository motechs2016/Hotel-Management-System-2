package service.OrderService._stub;

import VO.ExceptionVO;
import VO.OrderInfoVO;
import service.OrderService.OrderService;
import util.Message;
import util.OrderType;
import util.RoomType;
import util.UserType;

/**
 * Created by Dell on 2016/10/16.
 */
public class OrderService_stub implements OrderService {
    OrderInfoVO orderInfoVO=new OrderInfoVO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

    public OrderInfoVO getOrderInfo(String orderID) {
        return orderInfoVO;
    }

    public Message changeOrderState(String orderID, OrderType orderType) {
        return Message.SUCCESS;
    }

    public Message changeOrder(ExceptionVO exceptionVO) {
        ExceptionVO exceptionVO1=exceptionVO.getExceptionVO();
        return Message.SUCCESS;
    }

    public OrderInfoVO[] getOrderList(String userName, UserType userType, OrderType orderType) {
        return new OrderInfoVO[0];
    }

    public boolean checkSixHour(OrderInfoVO orderInfo) {
        OrderInfoVO orderInfoVO1=orderInfo.getOrderInfoVO();
        return true;
    }

    public Message addAnOrder(OrderInfoVO orderInfoVO) {
        OrderInfoVO orderInfoVO1=orderInfoVO.getOrderInfoVO();
        if(orderInfoVO1!=null){
            return Message.SUCCESS;
        }else{
            return Message.FAIL;
        }
    }
}
