package com.pan.mapper;

import com.pan.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer phone);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer phone);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findUserByNameL(String username);

    User findUserByName(String username);

    String findIdByUsername(String username);

    void insertAddress(@Param("address_buyer") String address_buyer, @Param("username") String username);

    void updateUserPwd(@Param("username") String username, @Param("password") String password);


}