//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.mapper;

import java.util.List;
import java.util.Map;

import com.github.abel533.mapper.Mapper;
import com.zsCat.web.goods.model.ShopType;


/**
 * 
 * @author zsCat 2016-10-31 16:32:55
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
public interface ShopTypeMapper extends Mapper<ShopType>{

	public List<ShopType> findPageInfo(Map<String, Object> params);
}
