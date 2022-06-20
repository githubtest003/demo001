package com.example.demo.dao;

import com.example.demo.bean.Users;
import org.apache.ibatis.annotations.Mapper;


/**
 * Created by Administrator on 2018/4/18.
 */
@Mapper
public interface UsersDao {
    public int addUsers(Users user);
    public Users checkLogin(Users user);
}
