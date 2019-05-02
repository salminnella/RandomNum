package com.salmin.kotlingo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {


    companion object {
        const val TOTAL_COUNT_EXTRA = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showRandomNumber()
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT_EXTRA, 0)

        val random = Random()
        var randomInt = 0;

        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }

        textview_random.text = Integer.toString(randomInt)

        text_view_label.text = getString(R.string.random_heading, count)
    }
}
