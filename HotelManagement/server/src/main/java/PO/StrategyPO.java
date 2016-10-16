package PO;

import util.UserType;

/**
 *
 */
public class StrategyPO {
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

    public StrategyPO(UserType userType, String content, double discount) {
        this.userType = userType;
        this.content = content;
        this.discount = discount;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getContent() {
        return content;
    }

    public double getDiscount() {
        return discount;
    }

}
