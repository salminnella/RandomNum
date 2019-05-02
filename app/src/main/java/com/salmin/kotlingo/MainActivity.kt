package com.salmin.kotlingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setClickListener(toast_button)
        setClickListener(count_button)
        setClickListener(random_button)


    }

    fun setClickListener(view: View) {

        view.setOnClickListener(View.OnClickListener {
            when (view.id) {
                R.id.toast_button -> toastMe()
                R.id.count_button -> countMe()
                R.id.random_button -> intentTo2ndActivity()
            }
        })

    }

    fun toastMe() {
        Toast.makeText(this, "Hi there", Toast.LENGTH_SHORT).show()
    }

    fun countMe() {
        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString()
    }

    fun intentTo2ndActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        val countString = textView.text.toString()
        val count = Integer.parseInt(countString)
        intent.putExtra(SecondActivity.TOTAL_COUNT_EXTRA, count)
        startActivity(intent)
    }
}
