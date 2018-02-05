package com.uustop.modules.job.dao;

import com.uustop.modules.job.entity.ScheduleJobLogEntity;
import com.uustop.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 * 
 * @author uustop
 * @email yth3412@163.com
 * @date 2016年12月1日 下午10:30:02
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
