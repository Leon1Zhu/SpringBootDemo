package com.example.service;

import com.example.domain.WechatUser;
import com.example.repository.WechatUserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhuliang on 2017/4/12.
 */
@Service
public class WechatUserService {
    @Autowired
    private WechatUserRepositoty wechatUserRepositoty;
    public List<WechatUser> finAll(){
        List<WechatUser> wechatUsers = wechatUserRepositoty.findAll();
        return wechatUsers;
    }
}
