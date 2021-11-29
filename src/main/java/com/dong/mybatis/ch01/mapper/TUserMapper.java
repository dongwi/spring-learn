package com.dong.mybatis.ch01.mapper;

import com.dong.mybatis.ch01.entity.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserMapper {
    TUser selectUserByPrimaryKey(Integer id);
    void insert(TUser user);
    List<TUser> selectIfOper(@Param("user_name") String userName, @Param("note") String note);
    List<TUser> selectIfAndWhereOper(@Param("user_name") String userName, @Param("note") String note);
    List<TUser> selectForeach(String[] names);
    void insertForeach(List<TUser> users);
}
