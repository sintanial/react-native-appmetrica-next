/*
 * Version for React Native
 * © 2020 YANDEX
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://yandex.com/legal/appmetrica_sdk_agreement/
 */

package com.yandex.metrica.plugin.reactnative;

import com.facebook.react.bridge.Callback;
import com.yandex.metrica.DeferredDeeplinkParametersListener;

import java.util.Map;

public class ReactNativeAppMetricaDeferredDeeplinkParametersListener implements DeferredDeeplinkParametersListener {

    private final Callback listener;

    ReactNativeAppMetricaDeferredDeeplinkParametersListener(Callback listener) {
        this.listener = listener;
    }

    @Override
    public void onError(Error error, String s) {
        listener.invoke(null, error.getDescription(), s);
    }

    @Override
    public void onParametersLoaded(Map<String, String> map) {
        listener.invoke(map, null);
    }
}

