package service.ClientService._stub;

import PO.HotelPO;
import VO.HotelVO;
import service.ClientService.ClientService;
import util.CommentMessage;


/**
 * Created by Dell on 2016/10/16.
 */
public class ClientService_stub implements ClientService {
    public CommentMessage submitComment(String name, String HotelName, String comment, int star) {
        if(comment.length()<15){
            return CommentMessage.LESS_WORD;
        }else{
            return CommentMessage.SUCCESS;
        }
    }

    public HotelVO[] getHotelList(String address, String area, String price, String star, String grade) {
        return new HotelVO[0];
    }

    public HotelVO getHotelInfo(String hotelName) {
        return new HotelVO("如家酒店","南京最好的酒店","南京新街口","新街口","早餐供应",'3',"rujiaadmin",5.0,100,null);

    }
}
