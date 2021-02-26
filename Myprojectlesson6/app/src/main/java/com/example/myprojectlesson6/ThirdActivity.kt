package com.example.myprojectlesson6

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception
import java.lang.StringBuilder

//classga ViewOnclickLister qoyish kere
class ThirdActivity : AppCompatActivity(), View.OnClickListener {
    var numbertext1: String? = null
    var r: Double? = null
    var number1: Double? = null
    var number2: Double? = null
    var qoshish: Boolean = false
    var ayirish: Boolean = false
    var bolish: Boolean = false
    var onOf: Boolean = false
    var birinchimal:Boolean = true
    var ikkinchiamal:Boolean = false
    var kopaytirish: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        zero_btn.setOnClickListener(this)
        one_btn.setOnClickListener(this)
        two_btn.setOnClickListener(this)
        three_btn.setOnClickListener(this)
        four_btn.setOnClickListener(this)
        five_btn.setOnClickListener(this)
        six_btn.setOnClickListener(this)
        seven_btn.setOnClickListener(this)
        eight_btn.setOnClickListener(this)
        nine_btn.setOnClickListener(this)
        plus_btn.setOnClickListener(this)
        minus_btn.setOnClickListener(this)
        deletecashe_btn.setOnClickListener(this)
        back.setOnClickListener(this)
        equal_btn.setOnClickListener(this)
        multiply_btn.setOnClickListener(this)
        bolish_btn.setOnClickListener(this)
        putminus_btn.setOnClickListener(this)
        dot_btn.setOnClickListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var menuinfllater = MenuInflater(this)
        menuinfllater.inflate(R.menu.my_menu_second, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemid = item.itemId
        when (itemid) {
            R.id.editbackgruund -> {
                if (onOf) {
                    deletecashe_btn.setBackgroundColor(Color.parseColor("#FF8F00"))
                    putminus_btn.setBackgroundColor(Color.parseColor("#FF8F00"))
                    back.setBackgroundColor(Color.parseColor("#FF8F00"))
                    multiply_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    minus_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    plus_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    equal_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    bolish_btn.setBackgroundColor(Color.parseColor("#FF8F00"))
                    seven_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    eight_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    nine_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    four_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    three_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    five_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    six_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    two_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    one_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    zero_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))
                    dot_btn.setBackgroundColor(Color.parseColor("#BCBCBC"))

                    onOf = false
                } else {
                    deletecashe_btn.setBackgroundColor(Color.BLUE)
                    putminus_btn.setBackgroundColor(Color.BLUE)
                    back.setBackgroundColor(Color.BLUE)
                    multiply_btn.setBackgroundColor(Color.BLUE)
                    minus_btn.setBackgroundColor(Color.BLUE)
                    plus_btn.setBackgroundColor(Color.BLUE)
                    equal_btn.setBackgroundColor(Color.BLUE)
                    bolish_btn.setBackgroundColor(Color.BLUE)
                    seven_btn.setBackgroundColor(Color.MAGENTA)
                    eight_btn.setBackgroundColor(Color.MAGENTA)
                    nine_btn.setBackgroundColor(Color.MAGENTA)
                    four_btn.setBackgroundColor(Color.MAGENTA)
                    three_btn.setBackgroundColor(Color.MAGENTA)
                    five_btn.setBackgroundColor(Color.MAGENTA)
                    six_btn.setBackgroundColor(Color.MAGENTA)
                    two_btn.setBackgroundColor(Color.MAGENTA)
                    one_btn.setBackgroundColor(Color.MAGENTA)
                    zero_btn.setBackgroundColor(Color.MAGENTA)
                    dot_btn.setBackgroundColor(Color.MAGENTA)
                    onOf = true
                }


            }
            R.id.myself -> {
                Toast.makeText(
                    this,
                    "My instagram username is -> dilmurod_kuldashev",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v: View?) {
        var id = v?.id
        if (edit.text.toString() == "0") {
            numbertext1 = ""
        }

        when (id) {
            R.id.deletecashe_btn -> {
                numbertext1 = ""
                edit.setText(numbertext1)
                result.setText("")

            }
            R.id.zero_btn -> {
                if (numbertext1.toString()?.contains(".")!!){

                    numbertext1 += "0"
//                    number1 = numbertext1?.toDouble()
                    edit.setText(numbertext1)
                }else{
                    numbertext1 += "0"
                    edit.setText(numbertext1)
                }

            }

            R.id.one_btn -> {
                if (numbertext1.toString()?.contains(".")!!){

                    numbertext1 += "1"
//                    number1 = numbertext1?.toDouble()
                    edit.setText(numbertext1)
                }else{
                    numbertext1 += "1"
                    edit.setText(numbertext1)
                }
            }
            R.id.two_btn -> {
                if (numbertext1.toString()?.contains(".")!!){

                    numbertext1 += "2"
//                    number1 = numbertext1?.toDouble()
                    edit.setText(numbertext1)
                }else{
                    numbertext1 += "2"
                    edit.setText(numbertext1)
                }
            }
            R.id.three_btn -> {
                if (numbertext1.toString()?.contains(".")!!){

                    numbertext1 += "3"
//                    number1 = numbertext1?.toDouble()
                    edit.setText(numbertext1)
                }else{
                    numbertext1 += "3"
                    edit.setText(numbertext1)
                }
            }
            R.id.four_btn -> {
                if (numbertext1.toString()?.contains(".")!!){

                    numbertext1 += "4"
//                    number1 = numbertext1?.toDouble()
                    edit.setText(numbertext1)
                }else{
                    numbertext1 += "4"
                    edit.setText(numbertext1)
                }
            }
            R.id.five_btn -> {
                if (numbertext1.toString()?.contains(".")!!){

                    numbertext1 += "5"
//                    number1 = numbertext1?.toDouble()
                    edit.setText(numbertext1)
                }else{
                    numbertext1 += "5"
                    edit.setText(numbertext1)
                }
            }
            R.id.six_btn -> {
                if (numbertext1?.contains(".")!!){

                    numbertext1 += "6"
//                    number1 = numbertext1?.toDouble()
                    edit.setText(numbertext1)
                }else{
                    numbertext1 += "6"
                    edit.setText(numbertext1)
                }
            }
            R.id.seven_btn -> {
                if (numbertext1.toString()?.contains(".")!!){

                    numbertext1 += "7"
//                    number1 = numbertext1?.toDouble()
                    edit.setText(numbertext1)
                }else{
                    numbertext1 += "7"
                    edit.setText(numbertext1)
                }
            }
            R.id.eight_btn -> {
                if (numbertext1.toString()?.contains(".")!!){
                    numbertext1 += "8"
//                    number1 = numbertext1?.toDouble()
                    edit.setText(numbertext1)
                }else{
                    numbertext1 += "8"
                    edit.setText(numbertext1)
                }
            }
            R.id.nine_btn -> {
                if (numbertext1.toString()?.contains(".")!!){

                    numbertext1 += "9"
//                    number1 = numbertext1?.toDouble()
                    edit.setText(numbertext1)
                }else{
                    numbertext1 += "9"
                    edit.setText(numbertext1)
                }
            }
            R.id.dot_btn -> {
                if (result.text.isEmpty()) {
                    if (numbertext1?.isNotEmpty()!!) {
                        if(birinchimal){
                            if (numbertext1?.contains(".")!!) {
                                number1 = numbertext1?.toDouble()
                                edit.setText(numbertext1)
                                birinchimal = false
                            } else {
                                numbertext1 = "$numbertext1."
                                number1 = numbertext1?.toDouble()
                                edit.setText(numbertext1)
                                birinchimal =false
                            }
                        }
                        if (ikkinchiamal){
                            if (numbertext1?.contains(".")!!) {
                                number2 = numbertext1?.toDouble()
                                edit.setText(numbertext1)
                                ikkinchiamal = false
                            } else {
                                numbertext1 = "$numbertext1."
                                number2 = numbertext1?.toDouble()
                                edit.setText(numbertext1)
                                ikkinchiamal =false
                            }
                        }
                    }
                }
//                else {
//                    if (numbertext1?.isNotEmpty()!!) {
//                        if (birinchimal){
//                            if (numbertext1?.contains(".")!!) {
//                                number1 = numbertext1?.toDouble()
//                                edit.setText(numbertext1)
//                            } else {
//                                numbertext1 = "$numbertext1."
//                                number1 = numbertext1?.toDouble()
//                                edit.setText(numbertext1)
//                            }
//                        }
//                        if (ikkinchiamal){
//                            if (numbertext1?.contains(".")!!) {
//                                number2 = numbertext1?.toDouble()
//                                edit.setText(numbertext1)
//                            } else {
//                                numbertext1 = "$numbertext1."
//                                number2 = numbertext1?.toDouble()
//                                edit.setText(numbertext1)
//                            }
//                        }
//
//                    }
//                }
            }
            R.id.plus_btn -> {
                if (result.text.isEmpty()) {
                    edit.setText(r.toString())
                    if (numbertext1?.isNotEmpty()!!) {
                        number1 = numbertext1?.toDouble()
                        numbertext1 = ""
                        edit.setText("+")
                        qoshish = true
                        ikkinchiamal = true
                    }
                } else {
                    if (numbertext1?.isNotEmpty()!!) {
                        number2 = numbertext1?.toDouble()
                        numbertext1 = ""
                        edit.setText("+")
                        qoshish = true
                        ikkinchiamal = true
                    } else {
                        numbertext1 = ""
                        edit.setText("+")
                        qoshish = true
                        ikkinchiamal = true
                    }
                }

            }
            R.id.back -> {
                if (numbertext1?.isNotEmpty()!!) {
                    if (numbertext1?.length!! > 1) {
                        edit.setText(numbertext1)
                        var s = numbertext1?.substring(0, numbertext1?.length!! - 1)
                        numbertext1 = s
                        number1 = numbertext1?.toDouble()
                        edit.setText(numbertext1)
                    } else {
                        numbertext1 = "0"
                        edit.setText(numbertext1)
                        number1 = numbertext1?.toDouble()
                    }
                }
            }
            R.id.putminus_btn -> {
                if (numbertext1?.isNotEmpty()!!) {
                    if (numbertext1?.toInt()!! < 0) {
                        var s = "$numbertext1"
                        number1 = s.toDouble()
                        edit.setText(s)
                    } else {
                        var s = "-$numbertext1"
                        number1 = s.toDouble()
                        edit.setText(s)
                    }
                }
            }
            R.id.minus_btn -> {
                if (result.text.isEmpty()) {
                    edit.setText(r.toString())
                    if (numbertext1?.isNotEmpty()!!) {
                        number1 = numbertext1?.toDouble()
                        numbertext1 = ""
                        edit.setText("-")
                        ayirish = true
                        ikkinchiamal = true
                    }
                } else {
                    if (numbertext1?.isNotEmpty()!!) {
                        number2 = numbertext1?.toDouble()
                        numbertext1 = ""
                        edit.setText("-")
                        ayirish = true
                        ikkinchiamal = true
                    } else {
                        numbertext1 = ""
                        edit.setText("-")
                        ayirish = true
                        ikkinchiamal = true
                    }
                }

            }
            R.id.multiply_btn -> {
                if (result.text.isEmpty()) {
                    edit.setText(r.toString())
                    if (numbertext1?.isNotEmpty()!!) {
                        number1 = numbertext1?.toDouble()
                        numbertext1 = ""
                        edit.setText("*")
                        kopaytirish = true
                        ikkinchiamal = true
                    }
                } else {
                    if (numbertext1?.isNotEmpty()!!) {
                        number2 = numbertext1?.toDouble()
                        numbertext1 = ""
                        edit.setText("*")
                        kopaytirish = true
                        ikkinchiamal = true
                    } else {
                        numbertext1 = ""
                        edit.setText("*")
                        kopaytirish = true
                        ikkinchiamal = true
                    }
                }

            }
            R.id.bolish_btn -> {
                if (result.text.isEmpty()) {
                    edit.setText(r.toString())
                    if (numbertext1?.isNotEmpty()!!) {
                        number1 = numbertext1?.toDouble()
                        numbertext1 = ""
                        edit.setText("/")
                        bolish = true
                    }
                } else {
                    if (numbertext1?.isNotEmpty()!!) {
                        number2 = numbertext1?.toDouble()
                        numbertext1 = ""
                        edit.setText("/")
                        bolish = true
                    } else {
                        numbertext1 = ""
                        edit.setText("/")
                        bolish = true
                    }
                }

            }
            R.id.equal_btn -> {
                if (qoshish) {
                    if (result.text.isNotEmpty()) {
                        number2 = numbertext1?.toDouble()
                        r = r!! + number2!!
                        if (r.toString().contains(".0")) {
                            result.setText(r!!.toInt().toString())
                            qoshish = false
                            edit.setText(r!!.toInt().toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        } else {
                            result.setText(r.toString())
                            qoshish = false
                            edit.setText(r.toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        }

                    } else {
                        number2 = numbertext1?.toDouble()
                        r = number1!! + number2!!
                        if (r.toString().contains(".0")) {
                            result.setText(r!!.toInt().toString())
                            qoshish = false
                            edit.setText(r!!.toInt().toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        } else {
                            result.setText(r.toString())
                            qoshish = false
                            edit.setText(r.toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        }

                    }


                } else if (ayirish) {
                    if (result.text.isNotEmpty()) {
                        number2 = numbertext1?.toDouble()
                        r = r!! - number2!!
                        if (r.toString().contains(".0")) {
                            result.setText(r!!.toInt().toString())
                            ayirish = false
                            edit.setText(r!!.toInt().toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        } else {
                            result.setText(r.toString())
                            ayirish = false
                            edit.setText(r.toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        }

                    } else {
                        number2 = numbertext1?.toDouble()
                        r = number1!! - number2!!
                        if (r.toString().contains(".0")) {
                            result.setText(r!!.toInt().toString())
                            ayirish = false
                            edit.setText(r!!.toInt().toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        } else {
                            result.setText(r.toString())
                            ayirish = false
                            edit.setText(r.toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        }

                    }

                } else if (kopaytirish) {
                    if (result.text.isNotEmpty()) {
                        number2 = numbertext1?.toDouble()
                        r = r!! * number2!!
                        if (r.toString().contains(".0")) {
                            result.setText(r!!.toInt().toString())
                            kopaytirish = false
                            edit.setText(r!!.toInt().toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        } else {
                            result.setText(r.toString())
                            kopaytirish = false
                            edit.setText(r.toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        }

                    } else {
                        number2 = numbertext1?.toDouble()
                        r = number1!! * number2!!
                        if (r.toString().contains(".0")) {
                            result.setText(r!!.toInt().toString())
                            kopaytirish = false
                            edit.setText(r!!.toInt().toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        } else {
                            result.setText(r.toString())
                            kopaytirish = false
                            edit.setText(r.toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        }

                    }

                } else if (bolish) {
                    if (result.text.isNotEmpty()) {
                        number2 = numbertext1?.toDouble()
                        r = r!! / number2!!
                        if (r.toString().contains(".0")) {
                            result.setText(r!!.toInt().toString())
                            bolish = false
                            edit.setText(r!!.toInt().toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        } else {
                            result.setText(r.toString())
                            bolish = false
                            edit.setText(r.toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        }

                    } else {
                        number2 = numbertext1?.toDouble()
                        r = number1!! / number2!!
                        if (r.toString().contains(".0")) {
                            result.setText(r!!.toInt().toString())
                            bolish = false
                            edit.setText(r!!.toInt().toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false

                        } else {
                            result.setText(r.toString())
                            bolish = false
                            edit.setText(r.toString())
                            numbertext1 = ""
                            birinchimal = true
                            ikkinchiamal = false
                        }

                    }

                }

            }
        }
    }
}