package dao.LoginDao._stub;

import PO.ClientPO;
import dao.LoginDao.LoginDao;

/**
 * Created by Dell on 2016/10/16.
 */
public class LoginDao_stub implements LoginDao{
    public boolean login(String name, String password) {
        return true;
    }

    public boolean register(ClientPO clientPO) {
        return true;
    }
}
