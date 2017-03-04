//Powered By if, Since 2014 - 2020

package com.zsCat.web.sys.mapper;


import com.github.abel533.mapper.Mapper;
import com.zsCat.web.sys.model.SysResource;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author 
 */

public interface SysResourceMapper extends Mapper<SysResource>{
	
	public int updateParentIds(SysResource sysResource);
	
	public int deleteIdsByRootId(Long id);
   
	public List<SysResource> findPageInfo(Map<String, Object> params);
	
	//删除前验证
	public int beforeDeleteResource(Long resourceId);
	
	//根据userId获得持有的权限
	public List<SysResource> findUserResourceByUserId(Long userId);
	public List<SysResource> findUserResourceByPid(Long parentId);
	//根据userId  pid获得持有的权限
	public List<SysResource> findUserResourceByUserIdAndPid(Long userId,Long parentId);

	public List<SysResource> selectTop(long parentId);
	
	
	
}
