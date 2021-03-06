package myweb_han.biz.front.order.dao;

import myweb_han.entity.Orders;

import java.util.List;

public interface OrderDao {
	//下订单
	public void saveOrder(Orders orders);//orders中一定要包含List<OrderLine>
	//根据用户id查询对应的订单
	public List<Orders> queryOrders(String userId);
}
