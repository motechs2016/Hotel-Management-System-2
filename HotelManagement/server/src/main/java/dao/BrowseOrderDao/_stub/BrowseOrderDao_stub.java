package dao.BrowseOrderDao._stub;

import PO.OrderPO;
import dao.BrowseOrderDao.BrowseOrderDao;
import util.OrderType;
import util.RoomType;

public class BrowseOrderDao_stub implements BrowseOrderDao{

	 OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

	    public OrderPO getOrderInfo(String orderID) {
	        return orderInfoVO;
	    }
}
