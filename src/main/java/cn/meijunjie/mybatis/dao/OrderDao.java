package cn.meijunjie.mybatis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.meijunjie.mybatis.domain.Orders;
import cn.meijunjie.mybatis.domain.OrdersCustom;

@Repository
public interface OrderDao {

	public List<OrdersCustom> findOrdersUser() throws Exception;
	
	public List<OrdersCustom> findOrdersUserResultMap() throws Exception;
	
	
	public List<Orders> findOrdersUserAndOrderDetailResultMap() throws Exception;
}
