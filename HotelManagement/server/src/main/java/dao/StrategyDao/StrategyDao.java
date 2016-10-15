package dao.StrategyDao;


import PO.StrategyPO;
import util.UserType;


/**
 * Created by Dell on 2016/10/15.
 */
public interface StrategyDao {
    StrategyPO[] getStrategy(UserType type , String hotelname);

    boolean addNewStrategy(StrategyPO strategyPO);

    boolean removeStrategy(UserType type, StrategyPO strategy);

}
