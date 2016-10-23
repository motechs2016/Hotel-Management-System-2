package service.HotelStrategyService._stub;

import VO.StrategyVO;
import service.HotelStrategyService.HotelStrategyService;
import util.Message;
import util.UserType;

public class HotelStrategyService_stub implements HotelStrategyService {

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
