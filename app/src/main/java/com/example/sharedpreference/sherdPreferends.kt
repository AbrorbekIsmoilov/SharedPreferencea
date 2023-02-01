package com.example.sharedpreference

import android.content.Context
import android.content.SharedPreferences

object sherdPreferends {
    private const val NAME = "catch_file"
    private const val MODE = Context.MODE_PRIVATE

    private lateinit var preferences: SharedPreferences

    fun  init(context: Context){
        preferences = context.getSharedPreferences(NAME, MODE)


    }
    private inline fun SharedPreferences.edit(operation:(SharedPreferences.Editor)->Unit){
        val editor = edit()
        operation(editor)
        editor.apply()
    }
    var count:Int
    get() = preferences.getInt("count",0)
    set(value) = preferences.edit{
        if (value!=null){
            it.putInt("count",value)
        }
    }
   var myName:String
    get() = preferences.getString("key","malumot yoq")!!
    set(value) = preferences.edit {
        it.putString("key",value)
        it.commit()
    }
}