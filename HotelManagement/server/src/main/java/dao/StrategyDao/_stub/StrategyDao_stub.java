package dao.StrategyDao._stub;

import PO.StrategyPO;
import VO.StrategyVO;
import dao.StrategyDao.StrategyDao;
import util.UserType;

/**
 * Created by Dell on 2016/10/16.
 */
public class StrategyDao_stub implements StrategyDao{
    public StrategyPO[] getStrategy(UserType type, String hotelid) {
        return new StrategyPO[0];
    }

    public boolean addNewStrategy(StrategyPO strategyPO) {
        if (strategyPO==null){
            return false;
        }else{
            return true;
        }
    }

    public boolean removeStrategy(StrategyPO strategyPO) {
        if (strategyPO==null){
            return false;
        }else{
            return true;
        }
    }
}
