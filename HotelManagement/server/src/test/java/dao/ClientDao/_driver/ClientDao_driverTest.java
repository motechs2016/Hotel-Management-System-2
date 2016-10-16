package dao.ClientDao._driver;

import static org.junit.Assert.*;

import PO.CommentPO;
import PO.OrderPO;
import dao.ClientDao.ClientDao;
import dao.ClientDao._stub.ClientDao_stub;
import org.junit.BeforeClass;
import org.junit.Test;
import util.OrderType;
import util.RoomType;

public class ClientDao_driverTest {
    static ClientDao clientDao;
    @BeforeClass
    public static void before(){
        clientDao=new ClientDao_stub();
    }

    @Test
    public void addCommentTest(){
        CommentPO commentPO=new CommentPO("111111111111111111","root","root","2016-10-16","我是评论我是评论我是评论我是评论");
        assertEquals(true,clientDao.addComment(commentPO));
    }
    @Test
    public void getHotelListTest(){
        assertNotNull(clientDao.getHotelList("root","root","200","2","3"));
    }
    @Test
    public void addAnOrderTest(){
        OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

        assertEquals(true,clientDao.addAnOrder(orderInfoVO));
        assertEquals(false,clientDao.addAnOrder(null));
    }
}
