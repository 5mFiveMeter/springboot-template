package cn.fm.demo.service;

import cn.fm.demo.dao.UserMapper;
import cn.fm.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findById(String id){
        return userMapper.selectByPrimaryKey(Integer.valueOf(id));
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }

}
