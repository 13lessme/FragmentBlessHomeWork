package com.example.fragmentbless

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Объявление адаптера
        val adapter = PageAdapter(supportFragmentManager)
        //Добавление фрагмента
        adapter.addFragment(BlankFragment(), "первый фрагмент")
        adapter.addFragment(BlankFragment2(), "второй фрагмент")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}
