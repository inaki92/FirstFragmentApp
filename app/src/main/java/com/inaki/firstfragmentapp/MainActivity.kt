package com.inaki.firstfragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragment = BlankFragment.newInstance()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.my_container, mFragment)
            .commit()
    }
}