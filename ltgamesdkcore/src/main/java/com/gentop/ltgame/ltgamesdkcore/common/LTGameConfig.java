package com.gentop.ltgame.ltgamesdkcore.common;

/**
 * 配置信息
 */
public class LTGameConfig {

    // 设置 token 有效期，有效期内不会重新获取 token
    // 默认一天，如下设置为 12 小时
    // 设置为0，将不会做持久化存储，每次获取最新的
    public int tokenExpireHour = -1;

    // 开启微信平台
    public boolean wxEnable = true;
    // 微信 appId
    public String wxAppId = "";
    // 微信 secret 登录使用
    public String wxAppSecret = "";
    public boolean wxOnlyAuthCode = false;
    // 开启 QQ 平台
    public boolean qqEnable = true;
    // qq appId
    public String qqAppId = "";

    // 开启 facebook 平台
    public boolean facebookEnable = false;
    // 开启 google 平台
    public boolean googleEnable = true;


    @Override
    public String toString() {
        return "SocialBuildConfig{" +
                ", wxEnable=" + wxEnable +
                ", wxAppId='" + wxAppId + '\'' +
                ", wxAppSecret='" + wxAppSecret + '\'' +
                ", qqEnable=" + qqEnable +
                ", qqAppId='" + qqAppId + '\'' +
                ", facebookEnable=" + facebookEnable +
                ", googleEnable='" + googleEnable + '\'' +
                ", tokenExpireHour=" + tokenExpireHour +
                '}';
    }
}

