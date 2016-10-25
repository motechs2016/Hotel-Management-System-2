package VO;

import java.io.Serializable;

/**
 * 登陆的时候的VO包
 * @author mingzhizhe
 * @version 16/10/16
 */
public class LoginVO implements Serializable {
    private static final long serialVersionUID = 3744902086568111967L;
    /**
     * 用户名的VO
     */
    public String name;



    /**
     * 用户名的password
     */
    public String password;
    public LoginVO(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public LoginVO getLoginVO(){
        return new LoginVO(name,password);
    }



}
