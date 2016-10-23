package dao.WebsiteStrategyDao._stub;

import PO.StrategyPO;
import dao.WebsiteStrategyDao.WebsiteStrategyDao;
import util.UserType;

public class WebsiteStrategyDao_stub implements WebsiteStrategyDao {
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
