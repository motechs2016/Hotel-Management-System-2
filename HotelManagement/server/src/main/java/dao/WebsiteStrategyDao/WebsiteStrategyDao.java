package dao.WebsiteStrategyDao;

import PO.StrategyPO;
import util.UserType;

public interface WebsiteStrategyDao {
	/**
    *
    * @param type 发起查询促销策略的人员类型
    * @param hotelid 若为酒店工作人员，此为酒店工作人员的id
    * @return 促销策略的VO对象
    * @aurhor mingzhizhe
    * @version 16/10/15
    */
   StrategyPO[] getStrategy(UserType type , String hotelid);

   /**
    * 增加新的促销策略
    * @param strategyPO 促销策略的PO对象
    * @return 增加促销策略后的信息
    * @author mingzhizhe
    * @version 16/10/15
    */
   boolean addNewStrategy(StrategyPO strategyPO);

   /**
    * 移除原有的促销策略
    * @param strategyPO 促销策略的VO对象
    * @return 移除促销策略是否成功
    * @aurhor mingzhizhe
    * @version 16/10/15
    */
   boolean removeStrategy(StrategyPO strategyPO);

}
