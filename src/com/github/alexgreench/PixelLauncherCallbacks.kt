/*
 * Copyright (C) 2018 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.alexgreench

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.os.Bundle
import com.android.launcher3.AppInfo
import com.android.launcher3.LauncherCallbacks
import java.io.FileDescriptor
import java.io.PrintWriter
import java.util.*

class PixelLauncherCallbacks : LauncherCallbacks, OnSharedPreferenceChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {}
    override fun onResume() {}
    override fun onStart() {}
    override fun onStop() {}
    override fun onPause() {}
    override fun onDestroy() {}
    override fun onSaveInstanceState(outState: Bundle?) {}
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {}
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>?,
        grantResults: IntArray?
    ) {
    }

    override fun onAttachedToWindow() {}
    override fun onDetachedFromWindow() {}
    override fun dump(prefix: String?, fd: FileDescriptor?, w: PrintWriter?, args: Array<String>?) {}
    override fun onHomeIntent(internalStateHandled: Boolean) {}
    override fun handleBackPressed(): Boolean {
        return false
    }

    override fun onTrimMemory(level: Int) {}
    override fun onLauncherProviderChange() {}
    override fun bindAllApplications(apps: ArrayList<AppInfo>?) {}
    override fun startSearch(
        initialQuery: String?,
        selectInitialQuery: Boolean,
        appSearchData: Bundle?
    ): Boolean {
        return false
    }

    override fun hasSettings(): Boolean {
        return false
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {}
}