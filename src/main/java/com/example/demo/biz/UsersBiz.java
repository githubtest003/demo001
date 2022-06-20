package com.example.demo.biz;

import com.example.demo.bean.Users;

/**
 * Created by Administrator on 2018/4/18.
 */
public interface UsersBiz {

    public int register(Users user);
    public Users login(Users user);
}
