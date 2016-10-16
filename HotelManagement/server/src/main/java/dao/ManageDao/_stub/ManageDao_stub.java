package dao.ManageDao._stub;

import PO.ClientPO;
import PO.HotelPO;
import PO.MemberInfoPO;
import PO.UserPO;
import util.UserType;

public class ManageDao_stub {
	

	/**
	 * 添加一个网站营销人员
	 * @param marketStaff
	 * @return 是否成功添加网站营销人员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean addMarketStaff(UserPO marketStaff){
		return true;
	}
	
	/**
	 * 添加一个酒店
	 * @param hotel
	 * @return 是否成功添加酒店
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean addHotel(HotelPO hotel){
		return true;
	}
	
	/**
	 * 得到酒店信息
	 * @param client,type
	 * @return 返回酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public HotelPO getHotelInfo(String hotel){
		return new HotelPO("如家酒店","南京最好的酒店","南京新街口","新街口","早餐供应",'3',"rujiaadmin",5.0,100);
	}
	
	/**
	 * 得到用户信息
	 * @param client
	 * @return 用户的信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public ClientPO getUserInfo(String client){
		return new ClientPO("github",UserType.CLIENT,"14843747477","1997.4.11",2,0,"南京大学");
	}
	
	/**
	 * 修改酒店信息
	 * @param client ,type, hotel
	 * @return 是否成功修改酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeHotelInfo(HotelPO hotel){
		return true;
	}
	   
	
	/**
	 * 修改用户信息
	 * @param client clientPO
	 * @return 是否成功修改用户信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeUserInfo(ClientPO clientPO){
		return true ;
	}
	
	/**
	 * 获得会员类型
	 * @param 
	 * @return 会员类型
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public MemberInfoPO getMemberType(){
		return new MemberInfoPO(2,300);
	}
	


}
