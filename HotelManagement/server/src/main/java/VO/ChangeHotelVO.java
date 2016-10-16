package VO;

import java.io.Serializable;

import util.UserType;
/**
 * 
 * @author insomnia
 * @version Oct 15,2016
 */
public class ChangeHotelVO implements Serializable {
	
	public enum Type {type1,type2,type3,type4};//类型的个数有待修改，，，
	/**修改的客户名*/
	public String client;
	/**修改的类型*/
	UserType type;
	
	/**酒店用户名*/
	String hotelName;
	/**酒店介绍*/
	String intro ;
	/**酒店地址*/
	String address;
	/**酒店所属商圈*/
	String businessArea;
	/**酒店的设施服务*/
	String service;
	/**酒店的星级*/
	char star;
	/**酒店锁对应的酒店工作人员的用户名*/
	String staffName;
	/**酒店的评分*/
	double point;
	/**评分的总人数*/
	int pointNumber;
	/**所有的酒店合作企业*/
	String [] co_enterprises;
	
	public ChangeHotelVO( String client,
			        UserType type,
			        String hotelName,
					String intro ,
					String address,
					String businessArea,
					String service,
					char star,
					String staffName,
					double point,
					int pointNumber,
					String [] co_enterprises){
		this.client=client;
		this.type=type;
		this.hotelName=hotelName;
		this.intro=intro;
		this.address=address;
		this.businessArea=businessArea;
		this.service=service;
		this.star=star;
		this.staffName=staffName;
		this.point=point;
		this.pointNumber =pointNumber;
		this.co_enterprises=co_enterprises;
	}
	
	public ChangeHotelVO getChangeHotelVO(){
		return new ChangeHotelVO(client,type,hotelName,intro,address,businessArea,service,star,staffName,point,pointNumber,co_enterprises);
	}
	

}
