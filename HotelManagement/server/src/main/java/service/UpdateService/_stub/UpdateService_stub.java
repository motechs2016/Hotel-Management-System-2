package service.UpdateService._stub;

import VO.OrderInfoVO;
import VO.RoomVO;
import VO.UpdateRoomVO;
import service.UpdateService.UpdateService;
import util.Message;
import util.OrderType;
import util.RoomType;

/**
 * Created by Dell on 2016/10/16.
 */
public class UpdateService_stub implements UpdateService {
    public RoomVO getRoomInfo(String hotelmanagerid) {
        return new RoomVO(1,1,1);
    }

    public Message updateRoomInfo(UpdateRoomVO updateRoomVO) {
        UpdateRoomVO updateRoomVO1=updateRoomVO.getUpdateRoomVO();
        if(updateRoomVO1.change>10){
            return Message.FAIL;
        }else{
            return Message.SUCCESS;
        }
    }

    public Message addOfflineOrder(OrderInfoVO order) {
        OrderInfoVO orderInfoVO=order.getOrderInfoVO();

        if(isFull(orderInfoVO.orderID, orderInfoVO.userName, orderInfoVO.orderType, orderInfoVO.hotelName,orderInfoVO.roomType,orderInfoVO.numberOfRoom,
        orderInfoVO.expectedNumberOfUser,orderInfoVO.hasChild, orderInfoVO.expectedInTime, orderInfoVO.expectedOutTime,
                orderInfoVO.lastestTime, orderInfoVO.actualInTime, orderInfoVO.actualOutTime, orderInfoVO.exception,
                orderInfoVO.cancelTime)){
            return Message.SUCCESS;
        }else{
            return Message.FAIL;
        }
    }

    private boolean isFull(String orderID, String userName, OrderType orderType, String hotelName, RoomType roomType, int  numberOfRoom,
                           int expectedNumberOfUser, boolean hasChild, String expectedInTime, String  expectedOutTime,
                           String lastestTime, String actualInTime, String actualOutTime, String  exception,
                           String cancelTime){
        return orderID!=null&&userName!=null&&orderType!=null&&hotelName!=null&&roomType!=null&&numberOfRoom!=0
       &&expectedNumberOfUser!=0&&expectedInTime!=null&&expectedOutTime!=null&&
                lastestTime!=null&&actualInTime!=null&&actualOutTime!=null&&exception!=null&&
                cancelTime!=null;
    }
}
