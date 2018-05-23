package com.mall.service;

import com.mall.pojo.TbItem;

public interface ItemService {
	// 根据id获取商品信息
	TbItem getItemById(long id);
}
