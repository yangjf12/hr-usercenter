package com.unicom.hrn.dao;

import com.unicom.hrn.entity.SysUserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserInfoDao {
    public List<String> getSiteCodeByUserCode(String userCode);
}