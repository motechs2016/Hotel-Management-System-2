package VO;

import java.io.Serializable;

/**
 * Created by Dell on 2016/10/15.
 */
public class RoomVO implements Serializable{
    /**
     * 标间的数目
     */
    public int strandRoom;
    /**
     * 双人间的数目
     */
    public int doubleRoom;
    /**
     * 家庭房的数目
     */
    public int familyRoom;

    /**
     * 每个房间类型的数量信息
     * @param strandRoom
     * @param doubleRoom
     * @param familyRoom
     */
    public RoomVO(int strandRoom,int doubleRoom,int familyRoom){
        this.doubleRoom=doubleRoom;
        this.familyRoom=familyRoom;
        this.strandRoom=strandRoom;
    }
}
