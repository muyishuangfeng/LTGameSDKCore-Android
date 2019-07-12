package com.gentop.ltgame.ltgamesdkcore.impl;

import android.app.Activity;

import com.gentop.ltgame.ltgamesdkcore.model.LoginResult;

public interface OnLoginStateListener {
    /**
     * 登录状态
     *
     * @param activity 上下文
     * @param result   登录结果
     */
    void onState(Activity activity, LoginResult result);
}
