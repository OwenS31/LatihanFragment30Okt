package com.example.latihanfragment30okt

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val mFragmentManager = supportFragmentManager
        val mfSatu = fSatu()

        mFragmentManager.findFragmentByTag(fSatu::class.java.simpleName)
        mFragmentManager
            .beginTransaction()
            .add(R.id.frameContainer, mfSatu, fSatu::class.java.simpleName)
            .commit()

        val _btnHal1 = findViewById<Button>(R.id.button1)
        _btnHal1.setOnClickListener {
            replaceFragment(fSatu())
        }
        val _btnHal2 = findViewById<Button>(R.id.button2)
        _btnHal2.setOnClickListener {
            replaceFragment(fDua())
        }
        val _btnHal3 = findViewById<Button>(R.id.button3)
        _btnHal3.setOnClickListener {
            replaceFragment(fTiga())
        }


    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameContainer, fragment)
            .commit()
    }
}