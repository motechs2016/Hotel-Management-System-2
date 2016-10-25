package dao.BrowseUnfilledOrderDao._stub;

import PO.OrderPO;
import dao.BrowseUnfilledOrderDao.BrowseUnfilledOrderDao;
import util.OrderType;
import util.RoomType;

public class BrowseUnfilledOrderDao_stub implements BrowseUnfilledOrderDao{


	 OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

	    public OrderPO getOrderInfo(String orderID) {
	        return orderInfoVO;
	    }
}
