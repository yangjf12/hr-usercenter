package com.unicom.hrn.service.impl;

import com.unicom.hrn.dao.SysUserInfoDao;
import com.unicom.hrn.service.SysUserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserInfoServiceImpl implements SysUserInfoService {

    @Autowired
    SysUserInfoDao sysUserInfoDao;

    private Logger logger = LoggerFactory.getLogger(SysUserInfoService.class);  //打印日志

    @Override
    public List<String> getSiteCodeByUserCode(String userCode) {
        return sysUserInfoDao.getSiteCodeByUserCode(userCode);
    }
}
