package com.example.demo.biz;

import com.example.demo.bean.Users;
import com.example.demo.dao.UsersDao;
import javafx.beans.property.adapter.ReadOnlyJavaBeanDoubleProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/18.
 */
@Service
public class UsersBizImpl implements UsersBiz {
    @Resource
    private UsersDao udao;
    @Transactional(propagation= Propagation.REQUIRED,isolation =Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int register(Users user) {
        return udao.addUsers(user);
    }

    @Override
    @Transactional(readOnly=true)
    public Users login(Users user) {
        return udao.checkLogin(user);
    }
}
