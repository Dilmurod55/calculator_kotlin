package com.example.myprojectlesson6

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_second.*

class SeconActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var button = Button(this)
        button.text = "PDP"

        container.addView(button)
//        var linerLayout = LinearLayout(this)
//        var linerlayoutparams = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.MATCH_PARENT,
//            LinearLayout.LayoutParams.MATCH_PARENT
//        )
//        var textView = TextView(this)
//        textView.text="Pdp online"
//        textView.setTextColor(resources.getColor(R.color.material_on_background_emphasis_medium))
//        linerLayout.addView(textView)
//        linerLayout.setBackgroundColor(Color.BLUE)
//        linerLayout.gravity = Gravity.CENTER
//        linerLayout.layoutParams = linerlayoutparams
//        setContentView(linerLayout,linerlayoutparams)
    }

}