package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initButtonEvent()
    }

    fun initButtonEvent() {
        binding.btn.setOnClickListener {
            if (binding.etID.text.length >= 6) {
                if(binding.etPW.text.length<6 || binding.etPW.text.length>10){
                    Snackbar.make(this,binding.root,"비밀번호가 잘못 되었습니다.",Snackbar.LENGTH_LONG).show()
                }
                else
               Snackbar.make(this,binding.root,"로그인 되었습니다.",Snackbar.LENGTH_LONG).show()
            }
            else if(binding.etID.text.length < 6 || binding.etPW.text.length<6 || binding.etPW.text.length>10)
                Snackbar.make(this,binding.root,"ID가 잘못 되었습니다.",Snackbar.LENGTH_LONG).show()
            else
                Snackbar.make(this,binding.root,"ID가 잘못 되었습니다.",Snackbar.LENGTH_LONG).show()
        }

    }
}


