package com.example.notifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.notifications.databinding.ActivityGeriSayimSayaciBinding

class GeriSayimSayaci : AppCompatActivity() {
    private  lateinit var binding: ActivityGeriSayimSayaciBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGeriSayimSayaciBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener {
            val sayici=object :CountDownTimer(30000,1000){
                override fun onTick(i: Long) {
                    binding.textViewCikti.text="kalan süre:${i/1000} sn"
                }

                override fun onFinish() {//bittiğinde
                    binding.textViewCikti.text="bitti"
                }
            }
            sayici.start()
        }
    }
}