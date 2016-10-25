package VO;

import java.io.Serializable;

/**
 * 评论信息的VO包
 * @author mingzhizhe
 * @version 16/10/16
 */
public class CommentVO implements Serializable{


    private static final long serialVersionUID = 2284063223631392080L;
    /**
     * 评价信息的用户名字
     */
    String name;



    /**
     * 评价的酒店
     */
    String hotelName;
    /**
     * 评论内容
     */
    String comment;
    /**
     * 评分
     */
    int star;
    public CommentVO(String name, String hotelName, String comment, int star) {
        this.name = name;
        this.hotelName = hotelName;
        this.comment = comment;
        this.star = star;
    }
    public CommentVO getCommentVO(){
        return new CommentVO(name,hotelName,comment,star);
    }
}
