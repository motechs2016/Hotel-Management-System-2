package service.WithdrawOrderService._stub;

import VO.ExceptionVO;
import VO.OrderInfoVO;
import service.WithdrawOrderService.WithdrawOrderService;
import util.Message;
import util.OrderType;
import util.UserType;

public class WithdrawOrderService_stub  implements WithdrawOrderService {
    public Message changeOrderState(String orderID, OrderType orderType) {
        return Message.SUCCESS;
    }


    public OrderInfoVO[] getOrderList(String userName, UserType userType, OrderType orderType) {
        return new OrderInfoVO[0];
    }

    public boolean checkSixHour(OrderInfoVO orderInfo) {
        OrderInfoVO orderInfoVO1=orderInfo.getOrderInfoVO();
        return true;
    }

}
