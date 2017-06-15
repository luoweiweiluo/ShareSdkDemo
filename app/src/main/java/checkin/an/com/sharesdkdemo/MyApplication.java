package checkin.an.com.sharesdkdemo;

import android.app.Application;

import com.mob.MobSDK;

/**
 * Created by Administrator on 2017/6/15.
 */

public class MyApplication extends Application{

    public MyApplication(){

    }

    protected String a() {
        return null;
    }

    protected String b() {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MobSDK.init(this, this.a(), this.b());
    }
}
