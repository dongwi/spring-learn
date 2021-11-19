package com.dong.mybatis.ch01.mapper;

import com.dong.mybatis.ch01.entity.TUser;

public interface TUserMapper {
    TUser selectUserByPrimaryKey(Integer id);
}
