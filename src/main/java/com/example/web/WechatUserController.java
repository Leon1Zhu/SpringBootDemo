package com.example.web;

import com.example.domain.WechatUser;
import com.example.service.WechatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhuliang on 2017/4/12.
 */
@RestController
@RequestMapping("/api")
public class WechatUserController {
    @Autowired
    private WechatUserService wechatUserService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ResponseEntity  getAll(){
        List<WechatUser> wechatUsers= wechatUserService.finAll();
        return ResponseEntity.ok().body(wechatUsers);

    }

}
