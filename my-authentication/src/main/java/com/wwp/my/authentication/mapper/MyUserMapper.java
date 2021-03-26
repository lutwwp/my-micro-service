package com.wwp.my.authentication.mapper;

import com.wwp.my.authentication.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MyUserMapper {
    @Select("select * from user where username = #{username}")
    User getUserByUserName(@Param("username") String username);
}
