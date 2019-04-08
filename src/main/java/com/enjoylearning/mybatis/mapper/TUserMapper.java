package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.TUser;

import java.util.List;

public interface TUserMapper {


    TUser selectByPrimaryKey(Integer id);

    List<TUser> selectAll();


}