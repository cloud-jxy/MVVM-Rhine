package com.qingmei2.sample.utils

import com.qingmei2.rhine.ext.toast
import com.qingmei2.sample.base.BaseApplication

inline fun toast(value: () -> String) =
        BaseApplication.INSTANCE.toast(value)