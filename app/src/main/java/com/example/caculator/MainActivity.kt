package com.example.caculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fragment = Caculator()
        var transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_caculator, fragment)
        transaction.commit()

    }



}


