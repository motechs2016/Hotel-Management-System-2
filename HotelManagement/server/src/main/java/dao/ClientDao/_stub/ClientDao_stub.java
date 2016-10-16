package dao.ClientDao._stub;

import PO.CommentPO;
import PO.HotelPO;
import PO.OrderPO;
import dao.ClientDao.ClientDao;

/**
 * Created by Dell on 2016/10/16.
 */
public class ClientDao_stub implements ClientDao {
    public boolean addComment(CommentPO commentPO) {
        if (commentPO!=null){
            return true;
        }else {
            return false;
        }
    }

    public HotelPO[] getHotelList(String address, String area, String price, String star, String grade) {
        return new HotelPO[0];
    }

    public boolean addAnOrder(OrderPO orderPO) {
        if (orderPO!=null){
            return true;
        }else{
            return false;
        }
    }
}
