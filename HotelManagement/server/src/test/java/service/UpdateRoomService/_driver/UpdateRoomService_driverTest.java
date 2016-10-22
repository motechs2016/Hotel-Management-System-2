package service.UpdateRoomService._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.OrderInfoVO;
import VO.UpdateRoomVO;
import service.UpdateRoomService.UpdateRoomService;
import service.UpdateRoomService._stub.UpdateRoomService_stub;
import service.UpdateService.UpdateService;
import service.UpdateService._stub.UpdateService_stub;
import util.Message;
import util.OrderType;
import util.RoomType;

public class UpdateRoomService_driverTest {
	static UpdateRoomService updateRoomService;
    @BeforeClass
    public static void before(){
        updateRoomService=new UpdateRoomService_stub();
    }

    @Test
    public void getRoomInfoTest(){
        assertNotNull(updateRoomService.getRoomInfo("root"));
    }
    @Test
    public void updateRoomInfoTest(){
        assertEquals(Message.SUCCESS,updateRoomService.updateRoomInfo(new UpdateRoomVO("root", RoomType.FAMILY_ROOM,1)));
        assertEquals(Message.FAIL,updateRoomService.updateRoomInfo(new UpdateRoomVO("root", RoomType.FAMILY_ROOM,11)));
    }
    @Test
    public void addOfflineOrderTest(){
        OrderInfoVO orderInfoVO=new OrderInfoVO("111111111111111111","root", OrderType.AbnormalOrder,"root",RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");
        assertEquals(Message.SUCCESS,updateRoomService.addOfflineOrder(orderInfoVO));
    }
	

}
