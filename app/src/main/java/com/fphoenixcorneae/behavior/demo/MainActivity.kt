package com.fphoenixcorneae.behavior.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fphoenixcorneae.behavior.AbstractEasyBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isShow = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floating.setOnClickListener {
            if (isShow) {
                AbstractEasyBehavior.from(toolbar).hide()
                AbstractEasyBehavior.from(bottomBar).hide()
            } else {
                AbstractEasyBehavior.from(toolbar).show()
                AbstractEasyBehavior.from(bottomBar).show()
            }
            isShow = !isShow
        }
    }
}
