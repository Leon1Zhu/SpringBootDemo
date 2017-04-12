package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zhuliang on 2017/4/12.
 */
@Table(name = "wechat_user")
@Entity
public class WechatUser {
    @Id
    private  Long id;
    @Column(name = "wechat_unionid")
    private String wechatUnionid;

    @Column(name = "wechat_nickname")
    private String wechatNickname;

    @Column(name = "wechat_image")
    private String wechatImage;

    @Column(name = "wechat_area")
    private String wechatArea;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "wechat_appid")
    private String wechatAppid;

    @Column(name = "wechat_openid")
    private String wechatOpenid;

    @Column(name = "qr_info_id")
    private String qrInfoId;

    public String getWechatUnionid() {
        return wechatUnionid;
    }

    public void setWechatUnionid(String wechatUnionid) {
        this.wechatUnionid = wechatUnionid;
    }

    public String getWechatNickname() {
        return wechatNickname;
    }

    public void setWechatNickname(String wechatNickname) {
        this.wechatNickname = wechatNickname;
    }

    public String getWechatImage() {
        return wechatImage;
    }

    public void setWechatImage(String wechatImage) {
        this.wechatImage = wechatImage;
    }

    public String getWechatArea() {
        return wechatArea;
    }

    public void setWechatArea(String wechatArea) {
        this.wechatArea = wechatArea;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getWechatAppid() {
        return wechatAppid;
    }

    public void setWechatAppid(String wechatAppid) {
        this.wechatAppid = wechatAppid;
    }

    public String getWechatOpenid() {
        return wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
    }

    public String getQrInfoId() {
        return qrInfoId;
    }

    public void setQrInfoId(String qrInfoId) {
        this.qrInfoId = qrInfoId;
    }
}
