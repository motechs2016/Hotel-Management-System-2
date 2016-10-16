package service.StrategyService._stub;

import VO.StrategyVO;
import service.StrategyService.StrategyService;
import util.Message;
import util.UserType;

/**
 * Created by Dell on 2016/10/16.
 */
public class StrategyService_stub implements StrategyService{

    public StrategyVO[] getStrategy(UserType type, String hotelid) {
        if (type==UserType.HOTELSTAFF){
            return new StrategyVO[0];
        }else if(type==UserType.WEBSITEMARKERER){
            return new StrategyVO[0];
        }else{
            return null;
        }

    }

    public Message addNewStrategy(StrategyVO strategyVO) {
        StrategyVO newStrategyVO=strategyVO.getStrategyVO();
       if (newStrategyVO.content==null||newStrategyVO.discount<=0){
            return Message.NOT_COMPLETE;
        }else if(newStrategyVO.userType==UserType.HOTELSTAFF||newStrategyVO.userType==UserType.WEBSITEMARKERER){
            return Message.SUCCESS;
        }else{
            return Message.FAIL;
        }
    }

    public boolean removeStrategy(StrategyVO strategyVO) {
        if (strategyVO!=null){
            return true;
        }else{
            return false;
        }
    }
}
