package com.gentop.ltgame.ltgamesdkcore.common;

import android.util.Log;
import android.util.SparseArray;

import com.gentop.ltgame.ltgamesdkcore.exception.LTGameError;
import com.gentop.ltgame.ltgamesdkcore.platform.PlatformFactory;
import com.gentop.ltgame.ltgamesdkcore.util.LTGameUtil;

public class LTGameSdk {
    public static final String TAG = LTGameSdk.class.getSimpleName();

    // 配置项
    private static LTGameOptions mOptions;
    // platform factory
    private static SparseArray<PlatformFactory> mPlatformFactories;

    /**
     * 初始化
     */
    public static void init(LTGameOptions options) {
        mOptions = options;
        mPlatformFactories = new SparseArray<>();
        // Google平台
        if (mOptions.isGoogleEnable()) {
            addPlatform(Target.PLATFORM_GOOGLE, "com.gentop.ltgame.ltgamegoogle.GooglePlatform$Factory");
        }
        // Facebook平台
        if (mOptions.isFacebookEnable()) {
            addPlatform(Target.PLATFORM_FACEBOOK, "com.gentop.ltgame.ltgamefacebook.FacebookPlatform$Factory");
        }
        // GooglePlay平台
        if (mOptions.isGooglePlayEnable()) {
            addPlatform(Target.PLATFORM_GOOGLE_PLAY, "com.gentop.ltgame.ltgamegoogleplay.GooglePlayPlatform$Factory");
        }
        // oneStore平台
        if (mOptions.isOneStoreEnable()) {
            addPlatform(Target.PLATFORM_ONE_STORE, "com.gentop.ltgame.ltgameonestore.OneStorePlatform$Factory");
        }
        // 手机平台
        if (mOptions.isPhoneEnable()) {
            addPlatform(Target.PLATFORM_PHONE, "com.yk.slience.ltgamephone.PhonePlatform$Factory");
        }
    }

    /**
     * 获取配置项
     */
    public static LTGameOptions options() {
        if (mOptions == null) {
            throw LTGameError.make(LTGameError.CODE_SDK_INIT_ERROR);
        }
        return mOptions;
    }

    /**
     * 获取构建工厂
     */
    public static SparseArray<PlatformFactory> getPlatformFactories() {
        Log.e(TAG, mPlatformFactories.toString() + "===" + mPlatformFactories.size());
        return mPlatformFactories;
    }


    /**
     * 添加 platform
     *
     * @param factory 平台工厂
     */
    public static void addPlatform(PlatformFactory factory) {
        mPlatformFactories.append(factory.getPlatformTarget(), factory);
    }

    /**
     * 添加平台
     *
     * @param target       目标平台
     * @param factoryClazz
     */
    private static void addPlatform(int target, String factoryClazz) {
        try {
            Object instance = Class.forName(factoryClazz).newInstance();
            if (instance instanceof PlatformFactory) {
                addPlatform((PlatformFactory) instance);
                LTGameUtil.e(TAG, "注册平台 " + target + " ," + instance.getClass().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
