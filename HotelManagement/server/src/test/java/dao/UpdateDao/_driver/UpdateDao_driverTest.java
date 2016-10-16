package dao.UpdateDao._driver;

import static org.junit.Assert.*;

import PO.UpdateRoomPO;
import dao.UpdateDao.UpdateDao;
import dao.UpdateDao._stub.UpdateDao_stub;
import org.junit.BeforeClass;
import org.junit.Test;
import util.RoomType;

public class UpdateDao_driverTest {

    static UpdateDao updateDao;
    @BeforeClass
    public static void before(){
        updateDao=new UpdateDao_stub();
    }
    @Test
    public void getRoomInfoTest() {
        assertNotNull(updateDao.getRoomInfo("root"));
    }
    @Test
    public void updateRoomInfo(){
        assertEquals(true,updateDao.updateRoomInfo(new UpdateRoomPO("root", RoomType.FAMILY_ROOM,2)));
    }

}