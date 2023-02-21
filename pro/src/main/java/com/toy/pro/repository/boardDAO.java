package com.toy.pro.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface boardDAO {
    //dao

    public int selectTest(String name);

}
