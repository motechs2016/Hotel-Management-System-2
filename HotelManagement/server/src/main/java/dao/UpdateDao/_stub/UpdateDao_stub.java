package dao.UpdateDao._stub;

import PO.RoomPO;
import PO.UpdateRoomPO;
import dao.UpdateDao.UpdateDao;

/**
 * Created by Dell on 2016/10/16.
 */
public class UpdateDao_stub implements UpdateDao {
    public RoomPO getRoomInfo(String hotelmanagerid) {
        return new RoomPO(1,1,1);
    }

    public boolean updateRoomInfo(UpdateRoomPO updateRoomPO) {
        return true;
    }
}
