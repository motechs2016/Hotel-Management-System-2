package PO;

import java.io.Serializable;

/**
 * Created by Dell on 2016/10/15.
 */
public class RoomPO implements Serializable{
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

    public RoomPO(int strandRoom, int doubleRoom, int familyRoom) {
        this.strandRoom = strandRoom;
        this.doubleRoom = doubleRoom;
        this.familyRoom = familyRoom;
    }

    public int getStrandRoom() {
        return strandRoom;
    }

    public int getDoubleRoom() {
        return doubleRoom;
    }

    public int getFamilyRoom() {
        return familyRoom;
    }


}
