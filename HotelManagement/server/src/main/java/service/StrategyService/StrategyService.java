package service.StrategyService;

import VO.StrategyVO;
import util.Message;
import util.UserType;

/**
 * Created by Dell on 2016/10/15.
 */
public interface StrategyService {
    StrategyVO[] getStrategy(UserType type , String hotelname);

    Message addNewStrategy(StrategyVO strategyVO);

    boolean removeStrategy(StrategyVO strategyVO);
}
