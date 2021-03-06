package com.hunguigu.service;

import com.hunguigu.vo.Authority;
import com.hunguigu.vo.PageVo;
import com.hunguigu.vo.User;

import java.util.List;

public interface UserService {

    public PageVo<User> query(User user, int page, int rows);

    public User queryById(int id);

    public int insert(User user);

    public int delete(int id);

    public int update(User user);

    public List<User> queryAll();

}
