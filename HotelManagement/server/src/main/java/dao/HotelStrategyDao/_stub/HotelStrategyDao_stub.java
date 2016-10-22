package dao.HotelStrategyDao._stub;

import PO.StrategyPO;
import dao.HotelStrategyDao.HotelStrategyDao;
import util.UserType;

public class HotelStrategyDao_stub implements HotelStrategyDao {
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
