package dao.UpdateRoomDao._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import PO.UpdateRoomPO;
import dao.UpdateRoomDao.UpdateRoomDao;
import dao.UpdateRoomDao._stub.UpdateRoomDao_stub;
import util.RoomType;

public class UpdateRoomDao_driverTest {
	 static UpdateRoomDao updateRoomDao;
	    @BeforeClass
	    public static void before(){
	        updateRoomDao=new UpdateRoomDao_stub();
	    }
	    @Test
	    public void getRoomInfoTest() {
	        assertNotNull(updateRoomDao.getRoomInfo("root"));
	    }
	    @Test
	    public void updateRoomInfo(){
	        assertEquals(true,updateRoomDao.updateRoomInfo(new UpdateRoomPO("root", RoomType.FAMILY_ROOM,2)));
	    }
	

}
