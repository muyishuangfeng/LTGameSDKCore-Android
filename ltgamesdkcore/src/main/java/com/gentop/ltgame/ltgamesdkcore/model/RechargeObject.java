package com.gentop.ltgame.ltgamesdkcore.model;

import java.util.Map;

/**
 * 登录参数类
 */
public class RechargeObject {
    //乐推AppID
    private String LTAppID;
    //乐推AppKey
    private String LTAppKey;
    //包名
    private String mPackageID;
    //唯一标识
    private String mAdID;
    //baseUrl
    private String baseUrl;
    //请求码
    private int selfRequestCode;
    //商品
    private String sku;
    //自定义参数
    private Map<String, Object> params;
    //公钥
    private String publicKey;
    //是否是沙盒登录
    private int payTest;
    //商品ID
    private String goodsID;
    //商品类型
    private String mGoodsType;
    //payWall项目Key
    private String mProjectKey;
    //payWall项目密钥
    private String mSecretKey;
    //payWall项目金额
    private double amount;
    //payWall项目货币单位
    private String mCurrency;
    //payWall项目条目名称
    private String mItemName;
    //payWall项目条目ID
    private String mItemId;
    //payWall项目用户ID
    private String mUserId;
    //payWall项目回调地址
    private String mResultUrl;

    public String getLTAppID() {
        return LTAppID;
    }

    public void setLTAppID(String LTAppID) {
        this.LTAppID = LTAppID;
    }

    public String getLTAppKey() {
        return LTAppKey;
    }

    public void setLTAppKey(String LTAppKey) {
        this.LTAppKey = LTAppKey;
    }

    public String getmPackageID() {
        return mPackageID;
    }

    public void setmPackageID(String mPackageID) {
        this.mPackageID = mPackageID;
    }

    public String getmAdID() {
        return mAdID;
    }

    public void setmAdID(String mAdID) {
        this.mAdID = mAdID;
    }


    public int getSelfRequestCode() {
        return selfRequestCode;
    }

    public void setSelfRequestCode(int selfRequestCode) {
        this.selfRequestCode = selfRequestCode;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public int getPayTest() {
        return payTest;
    }

    public void setPayTest(int payTest) {
        this.payTest = payTest;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getmGoodsType() {
        return mGoodsType;
    }

    public void setmGoodsType(String mGoodsType) {
        this.mGoodsType = mGoodsType;
    }

    public String getmProjectKey() {
        return mProjectKey;
    }

    public void setmProjectKey(String mProjectKey) {
        this.mProjectKey = mProjectKey;
    }

    public String getmSecretKey() {
        return mSecretKey;
    }

    public void setmSecretKey(String mSecretKey) {
        this.mSecretKey = mSecretKey;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getmCurrency() {
        return mCurrency;
    }

    public void setmCurrency(String mCurrency) {
        this.mCurrency = mCurrency;
    }

    public String getmItemName() {
        return mItemName;
    }

    public void setmItemName(String mItemName) {
        this.mItemName = mItemName;
    }

    public String getmItemId() {
        return mItemId;
    }

    public void setmItemId(String mItemId) {
        this.mItemId = mItemId;
    }

    public String getmUserId() {
        return mUserId;
    }

    public void setmUserId(String mUserId) {
        this.mUserId = mUserId;
    }

    public String getmResultUrl() {
        return mResultUrl;
    }

    public void setmResultUrl(String mResultUrl) {
        this.mResultUrl = mResultUrl;
    }

    @Override
    public String toString() {
        return "RechargeObject{" +
                "LTAppID='" + LTAppID + '\'' +
                ", LTAppKey='" + LTAppKey + '\'' +
                ", mPackageID='" + mPackageID + '\'' +
                ", mAdID='" + mAdID + '\'' +
                ", baseUrl='" + baseUrl + '\'' +
                ", selfRequestCode=" + selfRequestCode +
                ", sku='" + sku + '\'' +
                ", params=" + params +
                ", publicKey='" + publicKey + '\'' +
                ", payTest=" + payTest +
                ", goodsID='" + goodsID + '\'' +
                ", mGoodsType='" + mGoodsType + '\'' +
                ", mProjectKey='" + mProjectKey + '\'' +
                ", mSecretKey='" + mSecretKey + '\'' +
                ", amount=" + amount +
                ", mCurrency='" + mCurrency + '\'' +
                ", mItemName='" + mItemName + '\'' +
                ", mItemId='" + mItemId + '\'' +
                ", mUserId='" + mUserId + '\'' +
                ", mResultUrl='" + mResultUrl + '\'' +
                '}';
    }
}
