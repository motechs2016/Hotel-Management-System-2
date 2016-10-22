package service.UpdateRoomService;

import VO.OrderInfoVO;
import VO.RoomVO;
import VO.UpdateRoomVO;
import util.Message;

public interface UpdateRoomService {
	/**
     * 根据酒店工作人员的名称得到所在酒店的房间数目
     * @param hotelmanagerid 酒店管理员的ID
     * @return
     */
    RoomVO getRoomInfo(String hotelmanagerid);

    /**
     * 更新房间信息
     * @param updateRoomVO
     * @return
     */
    Message updateRoomInfo(UpdateRoomVO updateRoomVO);

    /**
     * 添加一个新的线下订单
     * @param order
     * @return
     */
    Message  addOfflineOrder(OrderInfoVO order);
}
