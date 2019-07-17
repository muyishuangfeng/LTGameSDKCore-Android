package com.gentop.ltgame.ltgamesdkcore.platform;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.gentop.ltgame.ltgamesdkcore.impl.OnLoginStateListener;
import com.gentop.ltgame.ltgamesdkcore.model.LoginObject;
import com.gentop.ltgame.ltgamesdkcore.uikit.BaseActionActivity;

import java.util.Map;

public abstract class AbsPlatform implements IPlatform {


    protected String mAppId;
    protected String mAppName;
    protected int mTarget;
    protected String mAppKey;
    protected String mClientID;
    protected String mBaseUrl;
    protected String mAdID;
    protected String mPackageID;
    protected int mSelfRequestCode;
    protected int mPayTest;
    protected String mSku;
    protected Map<String, Object> mParams;
    protected String mPublicKey;
    protected String mProductID;
    protected String mPayType;
    protected String mPhone;
    protected String mPassword;
    protected String mLoginCode;


    public AbsPlatform(Context context, String appId, String appName, String appKey, int target) {
        mAppId = appId;
        mAppName = appName;
        mAppKey = appKey;
        mTarget = target;
    }

    public AbsPlatform(Context context, String appId, String appKey, int payTest, String publicKey,
                       int selfRequestCode, String sku, String productID, Map<String, Object> params,
                       String payType, int target) {
        mAppId = appId;
        mAppKey = appKey;
        mPayTest = payTest;
        mPublicKey = publicKey;
        mProductID = productID;
        mPayType = payType;
        mSelfRequestCode = selfRequestCode;
        mSku = sku;
        mParams = params;
        mTarget = target;
    }

    public AbsPlatform(Context context, String appId, String appKey, int payTest, String publicKey,
                       int selfRequestCode, String sku, String productID, Map<String, Object> params,
                       int target) {
        mAppId = appId;
        mAppKey = appKey;
        mPayTest = payTest;
        mPublicKey = publicKey;
        mProductID = productID;
        mSelfRequestCode = selfRequestCode;
        mSku = sku;
        mParams = params;
        mTarget = target;
    }

    public AbsPlatform(Context context, String appId, String appKey, String baseUrl, String phone,
                       String password, String loginCode, int target) {
        mAppId = appId;
        mAppKey = appKey;
        mBaseUrl = baseUrl;
        mLoginCode = loginCode;
        mPhone = phone;
        mPassword = password;
        mTarget = target;
    }

    public AbsPlatform(Context context, String baseUrl, String appId, String appKey, String clientID,
                       String adID, String packageID, int selfRequestCode, int target) {
        mBaseUrl = baseUrl;
        mAppId = appId;
        mAppKey = appKey;
        mClientID = clientID;
        mAdID = adID;
        mPackageID = packageID;
        mSelfRequestCode = selfRequestCode;
        mTarget = target;
    }

    public AbsPlatform(Context context, String baseUrl, String appId, String appKey, String adID,
                       String packageID, int target) {
        mBaseUrl = baseUrl;
        mAppId = appId;
        mAppKey = appKey;
        mAdID = adID;
        mPackageID = packageID;
        mTarget = target;
    }


    @Override
    public Class getUIKitClazz() {
        return null;
    }

    @Override
    public void handIntent(Activity intent) {

    }

    @Override
    public void onResponse(Object response) {

    }

    @Override
    public boolean isInstall(Context context) {
        return false;
    }

    @Override
    public void login(Activity activity, int target, LoginObject object, OnLoginStateListener listener) {
        throw new UnsupportedOperationException("该平台不支持登录操作～");
    }

    @Override
    public void onActivityResult(BaseActionActivity activity, int requestCode, int resultCode, Intent data) {

    }

    @Override
    public void recycle() {

    }


}
