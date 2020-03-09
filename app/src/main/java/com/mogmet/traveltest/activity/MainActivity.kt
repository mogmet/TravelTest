package com.mogmet.traveltest.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mogmet.traveltest.R
import com.mogmet.traveltest.fragment.TopFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, TopFragment.newInstance())
            .commit()
    }
}
