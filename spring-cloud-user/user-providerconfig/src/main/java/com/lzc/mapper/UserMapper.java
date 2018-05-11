package com.lzc.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.lzc.bean.User;

@Mapper
public interface UserMapper {

	public User selectById(int id);

}
