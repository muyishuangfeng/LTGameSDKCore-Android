package com.gentop.ltgame.ltgamesdkcore.model;

import com.gentop.ltgame.ltgamesdkcore.base.BaseEntry;
import com.gentop.ltgame.ltgamesdkcore.exception.LTGameError;

/**
 * 结果
 */
public class Result {
    //开始
    public static final int STATE_START = 0;
    //成功
    public static final int STATE_SUCCESS = 2;
    //失败
    public static final int STATE_FAIL = 3;
    //取消
    public static final int STATE_CANCEL = 4;
    //完成
    public static final int STATE_COMPLETE = 5;
    //有效
    public static final int STATE_ACTIVE = 6;
    //支付开始
    public static final int STATE_RECHARGE_START = 11;
    //支付成功
    public static final int STATE_RECHARGE_SUCCESS = 7;
    //支付失败
    public static final int STATE_RECHARGE_FAILED = 8;
    //支付取消
    public static final int STATE_RECHARGE_CANCEL = 9;
    //支付完成
    public static final int STATE_RECHARGE_COMPLETE = 10;
    //支付结果
    public static final int STATE_RECHARGE_RESULT = 11;
    //状态
    public int state;
    //目标
    public int target;
    //错误信息
    public LTGameError error;
    OneStoreResult result;

    private BaseEntry<ResultModel> resultModel;
    private String errorMsg;

    public Result(int state, int target) {
        this.state = state;
        this.target = target;
    }

    public Result(int state, OneStoreResult result) {
        this.state = state;
        this.result = result;
    }

    public Result(int state) {
        this.state = state;
    }

    public Result(int state, BaseEntry<ResultModel> resultModel) {
        this.state = state;
        this.resultModel = resultModel;
    }

    public Result(int state, String resultModel) {
        this.state = state;
        this.errorMsg = resultModel;
    }
}
