package service.UpdateDao._driver;
import static org.junit.Assert.*;

import VO.OrderInfoVO;
import VO.UpdateRoomVO;
import org.junit.BeforeClass;
import org.junit.Test;
import service.UpdateService.UpdateService;
import service.UpdateService._stub.UpdateService_stub;
import util.Message;
import util.OrderType;
import util.RoomType;

public class UpdateService_driver {
    static UpdateService updateService;
    @BeforeClass
    public static void before(){
        updateService=new UpdateService_stub();
    }

    @Test
    public void getRoomInfoTest(){
        assertNotNull(updateService.getRoomInfo("root"));
    }
    @Test
    public void updateRoomInfoTest(){
        assertEquals(Message.SUCCESS,updateService.updateRoomInfo(new UpdateRoomVO("root", RoomType.FAMILY_ROOM,1)));
        assertEquals(Message.FAIL,updateService.updateRoomInfo(new UpdateRoomVO("root", RoomType.FAMILY_ROOM,11)));
    }
    @Test
    public void addOfflineOrderTest(){
        OrderInfoVO orderInfoVO=new OrderInfoVO("111111111111111111","root", OrderType.AbnormalOrder,"root",RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");
        assertEquals(Message.SUCCESS,updateService.addOfflineOrder(orderInfoVO));
    }


}
