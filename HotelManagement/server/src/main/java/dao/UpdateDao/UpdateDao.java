package dao.UpdateDao;

import PO.RoomPO;
import PO.UpdateRoomPO;

/**
 * Created by Dell on 2016/10/15.
 */
public interface UpdateDao {
    /**
     * 根据酒店工作人员的名称得到所在酒店的房间数目
     * @param hotelmanagerid 酒店管理员的ID
     * @return
     */
    RoomPO getRoomInfo(String hotelmanagerid);

    /**
     * 更新房间信息
     * @param updateRoomPO 更新房源信息的PO
     * @return
     */
    boolean updateRoomInfo(UpdateRoomPO updateRoomPO);

}
