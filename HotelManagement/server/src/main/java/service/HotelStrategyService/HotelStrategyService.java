package service.HotelStrategyService;

import VO.StrategyVO;
import util.Message;
import util.UserType;

public interface HotelStrategyService {
	/**
    *
    * @param type 发起查询促销策略的人员类型
    * @param hotelid 若为酒店工作人员，此为酒店工作人员的id
    * @return 促销策略的VO对象
    * @aurhor mingzhizhe
    * @version 16/10/15
    */
   StrategyVO[] getStrategy(UserType type , String hotelid);

   /**
    * 增加新的促销策略
    * @param strategyVO 促销策略的VO对象
    * @return 增加促销策略后的信息
    * @author mingzhizhe
    * @version 16/10/15
    */
   Message addNewStrategy(StrategyVO strategyVO);

   /**
    * 移除原有的促销策略
    * @param strategyVO 促销策略的VO对象
    * @return 移除促销策略是否成功
    * @aurhor mingzhizhe
    * @version 16/10/15
    */
   boolean removeStrategy(StrategyVO strategyVO);
}
