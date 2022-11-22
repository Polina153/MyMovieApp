package ru.geekbrains.mymovieapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.geekbrains.mymovieapp.R
import ru.geekbrains.mymovieapp.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = MainActivityBinding.inflate(layoutInflater)
        binding.root.apply {
            setContentView(this)
        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}