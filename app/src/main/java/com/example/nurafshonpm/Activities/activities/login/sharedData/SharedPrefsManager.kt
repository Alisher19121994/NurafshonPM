package com.example.nurafshonpm.Activities.activities.login.sharedData

import android.content.Context
import android.content.SharedPreferences

class SharedPrefsManager (context: Context){

    private var prefs: SharedPreferences = context.getSharedPreferences("SaveToken", Context.MODE_PRIVATE)

    companion object {
        const val USER_TOKEN = "user_token"
    }


    fun saveAuthToken(token: String) {
        val editor = prefs.edit()
        editor.putString(USER_TOKEN, token)
        editor.apply()
    }
    fun fetchAuthToken(): String? {
        return prefs.getString(USER_TOKEN, null)
    }

}