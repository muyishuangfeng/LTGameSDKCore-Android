package com.gentop.ltgame.ltgamesdkcore.impl;

import android.app.Activity;

import com.gentop.ltgame.ltgamesdkcore.model.RechargeResult;

public interface OnRechargeListener {

    void onState(Activity activity, RechargeResult result);
}
