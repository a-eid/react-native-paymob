package com.reactnativepaymob;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

 import com.paymob.acceptsdk.PayActivity;
 import com.paymob.acceptsdk.PayActivityIntentKeys;
 import com.paymob.acceptsdk.PayResponseKeys;
 import com.paymob.acceptsdk.SaveCardResponseKeys;
 import com.paymob.acceptsdk.ToastMaker;

@ReactModule(name = PaymobModule.NAME)
public class PaymobModule extends ReactContextBaseJavaModule {
    public static final String NAME = "Paymob";

    public PaymobModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }


    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @ReactMethod
    public void multiply(int a, int b, Promise promise) {
        promise.resolve(a * b);
    }

    public static native int nativeMultiply(int a, int b);
}
