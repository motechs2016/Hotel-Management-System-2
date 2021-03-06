package PO;

import util.RoomType;

import java.io.Serializable;

/**
 *
 * 更改酒店房源信息的VO
 * @author mingzhizhe
 * @version 16/10/15
 */
public class UpdateRoomPO {
    /**
     * 酒店工作人员的用户名
     */
    public String hotelManagerID;



    /**
     * 要更新的房间类型
     */
    public RoomType roomType;
    /**
     * 数目的变化
     */
    public int change;

    public UpdateRoomPO(String hotelManagerID,RoomType roomType,int change){
        this.change=change;
        this.hotelManagerID=hotelManagerID;
        this.roomType=roomType;
    }
    public String getHotelManagerID() {
        return hotelManagerID;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getChange() {
        return change;
    }
}
