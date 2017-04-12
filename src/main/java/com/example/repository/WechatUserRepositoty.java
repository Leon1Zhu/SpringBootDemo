package com.example.repository;

import com.example.domain.WechatUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuliang on 2017/4/12.
 */
@Repository
public interface WechatUserRepositoty  extends JpaRepository<WechatUser,Long>{

    WechatUser   findWechatUserByWechatOpenidOrderByWechatOpenidAsc(String openid);

}
