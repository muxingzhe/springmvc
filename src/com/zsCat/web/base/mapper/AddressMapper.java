//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.base.mapper;

import com.github.abel533.mapper.Mapper;
import com.zsCat.web.base.model.Address;


/**
 * 
 * @author zsCat 2016-10-31 20:29:45
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	基础管理
 */
public interface AddressMapper extends Mapper<Address>{

	void updateByMemberId(Address address);

}
