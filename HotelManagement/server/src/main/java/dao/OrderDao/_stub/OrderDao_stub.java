package dao.OrderDao._stub;

import PO.OrderPO;
import VO.OrderInfoVO;
import dao.OrderDao.OrderDao;
import util.OrderType;
import util.RoomType;
import util.UserType;


public class OrderDao_stub implements OrderDao {
    OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

    public OrderPO getOrderInfo(String orderID) {
        return orderInfoVO;
    }

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

    public boolean addAnOrder(OrderPO orderPO) {
        return true;
    }
}
