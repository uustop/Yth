package com.uustop.datasources;

import com.uustop.datasources.annotation.DataSource;
import com.uustop.modules.sys.entity.SysUserEntity;
import com.uustop.modules.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试
 * @author uustop
 * @email yth3412@163.com
 * @date 2017/9/16 23:10
 */
@Service
public class DataSourceTestService {
    @Autowired
    private SysUserService sysUserService;

    public SysUserEntity queryObject(Long userId){
        return sysUserService.queryObject(userId);
    }

    @DataSource(name = DataSourceNames.SECOND)
    public SysUserEntity queryObject2(Long userId){
        return sysUserService.queryObject(userId);
    }
}
