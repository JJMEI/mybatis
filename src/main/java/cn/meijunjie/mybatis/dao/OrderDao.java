package cn.meijunjie.mybatis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.meijunjie.mybatis.domain.OrdersCustom;

@Repository
public interface OrderDao {

	public List<OrdersCustom> findOrdersUser() throws Exception;
}
