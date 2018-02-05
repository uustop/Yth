package com.uustop.modules.oss.dao;

import com.uustop.modules.oss.entity.SysOssEntity;
import com.uustop.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 * 
 * @author uustop
 * @email yth3412@163.com
 * @date 2017-03-25 12:13:26
 */
@Mapper
public interface SysOssDao extends BaseDao<SysOssEntity> {
	
}
