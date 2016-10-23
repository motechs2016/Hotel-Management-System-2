package dao.UpdateRoomDao._stub;

import PO.RoomPO;
import PO.UpdateRoomPO;
import dao.UpdateRoomDao.UpdateRoomDao;

public class UpdateRoomDao_stub implements UpdateRoomDao{
	   public RoomPO getRoomInfo(String hotelmanagerid) {
	        return new RoomPO(1,1,1);
	    }

	    public boolean updateRoomInfo(UpdateRoomPO updateRoomPO) {
	        return true;
	    }
}
