//Powered By if, Since 2014 - 2020

package com.zsCat.web.sys.mapper;

import com.github.abel533.mapper.Mapper;
import com.zsCat.web.sys.model.SysLog;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author 
 */

public interface SysLogMapper extends Mapper<SysLog> {


	public List<SysLog> findSysLogList(Map<String, Object> params);
   

}
