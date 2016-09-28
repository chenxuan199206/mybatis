package net.chinaedu.mybatis.dao;

import net.chinaedu.mybatis.model.User;

/**
 * Created by chenxuan on 2016/9/28.
 */
public interface UserMapper {

    public void insertUser(User user);

    public void removeUser(Integer id);

    public void updateUser(User user);

    public User getUser(Integer id);


}
