package VO;

import util.UserType;

import java.io.Serializable;

/**
 * 促销策略的VO对象的总内容
 * @author mingzhizhe
 * @version 16/10/15
 */
public class StrategyVO implements Serializable {
    /**
     * 促销策略的所有者类型
     */
    public UserType userType;
    /**
     * 促销策略的名称
     */
    public String content;
    /**
     * 促销策略打折数
     */
    public double discount;

    public StrategyVO(UserType userType,String content,double discount){
        this.content=content;
        this.discount=discount;
        this.userType=userType;
    }
}
