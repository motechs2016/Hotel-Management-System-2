package service.LoginService._stub;

import VO.LoginVO;
import VO.RegisterVO;
import service.LoginService.LoginService;
import util.Message;

/**
 * Created by Dell on 2016/10/16.
 */
public class LoginService_stub implements LoginService{
    public Message login(LoginVO loginVO) {
        LoginVO loginVO1=loginVO.getLoginVO();
        if(loginVO1.name!=null&&loginVO1.password!=null){
            return Message.SUCCESS;
        }else{
            return Message.NOT_COMPLETE;
        }
    }

    public Message register(RegisterVO registerVO) {
        if(registerVO.getRegisterVO()!=null){
            return Message.SUCCESS;
        }else{
            return Message.FAIL;
        }
    }
}
