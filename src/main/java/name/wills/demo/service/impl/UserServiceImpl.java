package name.wills.demo.service.impl;

import name.wills.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.wills.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int countAll() {

        return userMapper.countAll();
    }

}
