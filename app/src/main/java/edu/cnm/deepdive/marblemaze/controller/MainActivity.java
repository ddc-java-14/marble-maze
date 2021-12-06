<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
  xmlns:tools="http://schemas.android.com/tools"
  package="edu.cnm.deepdive.marblemaze">

  <application
    android:allowBackup="false"
    android:icon="@mipmap/ic_launcher"
    android:label="@string/app_name"
    android:name=".MarbleMazeApplication"
    android:roundIcon="@mipmap/ic_launcher_round"
    android:supportsRtl="true"
    android:theme="@style/AppTheme"
    tools:ignore="AllowBackup">
    <activity
      android:name=".controller.MainActivity"
      android:theme="@style/AppTheme.NoActionBar"/>
    <activity
      android:name=".controller.LoginActivity"
      android:exported="true">

      <intent-filter>

        <!-- This element declares that this activity is the default (main) activity. -->
        <action android:name="android.intent.action.MAIN"/>

        <category android:name="android.intent.category.LAUNCHER"/>
      </intent-filter>

    </activity>
  </application>

</manifest>