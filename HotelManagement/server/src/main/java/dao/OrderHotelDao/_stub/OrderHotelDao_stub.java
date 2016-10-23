package dao.OrderHotelDao._stub;

import PO.CreditPO;
import PO.HotelPO;
import PO.OrderPO;
import dao.OrderHotelDao.OrderHotelDao;
/**
 * 
 * @author insomnia
 *
 */
public class OrderHotelDao_stub implements OrderHotelDao{
	

	/**
	 * 显示该用户所有的信用记录
	 * @param clientName
	 * @return
	 * @author insomnia
	 */
	public CreditPO[] showCreditInfo(String clientName){
		return new CreditPO[]{new CreditPO("github","112233445566778899","2016.10.16:23:59:59","执行")};
	}

    public boolean addAnOrder(OrderPO orderPO) {
        return true;
    }
    
    public HotelPO[] getHotelList(String address, String area, String price, String star, String grade) {
        return new HotelPO[0];
    }

}
