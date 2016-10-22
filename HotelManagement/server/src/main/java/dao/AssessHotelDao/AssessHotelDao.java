package dao.AssessHotelDao;

import PO.CommentPO;

public interface AssessHotelDao {
	/**
	 * 增加评论
	 * @param commentPO 评价
	 * @return boolean 评价成功／评价失败
	 * @author lichen
	 * @version 2016年10月15日
	 */
	public boolean addComment(CommentPO commentPO);
}
