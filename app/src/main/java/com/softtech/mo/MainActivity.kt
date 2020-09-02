package com.softtech.mo

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() /*implements View.OnClickListener */ {
    var input1 = 0.0
    var input2 = 0.0
  /*  var btndot: Button? = null
    var btnplus: Button? = null
    var btnmin: Button? = null
    var btnx: Button? = null
    var btneq: Button? = null
    var btnc: Button? = null
    var btnnspa: Button? = null
    var btn3la: Button? = null*/
    var add = false
    var multi = false
    var min = false
    var div = false
    var nesp = false
    var decimal = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* btndot = findViewById(R.id.btn_dot)
        btnplus = findViewById(R.id.btn_plus)
        btnmin = findViewById(R.id.btn_min)
        btnx = findViewById(R.id.btn_x)
        btneq = findViewById(R.id.btnequal)
        btnc = findViewById(R.id.c)
        btnnspa = findViewById(R.id.btn_n)
        edit = findViewById(R.id.txtfady)
        btn3la = findViewById(R.id.btn_div)*/
        val comp = findViewById<View>(R.id.company) as TextView
        val mp = MediaPlayer.create(this, R.raw.click)
        val mp_2 = MediaPlayer.create(this, R.raw.c)
        val mp_3 = MediaPlayer.create(this, R.raw.score_beep)
        btn0.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "0"
            mp.start()
        })
        btn1.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "1"
            mp.start()
        })
        btn2.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "2"
            mp.start()
        })
        btn3.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "3"
            mp.start()
        })
        btn4.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "4"
            mp.start()
        })
        btn5.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "5"
            mp.start()
        })
        btn6.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "6"
            mp.start()
        })
        btn7.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "7"
            mp.start()
        })
        btn8.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "8"
            mp.start()
        })
        btn9.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "9"
            mp.start()
        })
      btn_dot.setOnClickListener(View.OnClickListener {
            txtfady.text = txtfady.text.toString() + "."
            mp.start()
        })
      btn_plus.setOnClickListener(View.OnClickListener {
            mp.start()
            // edit.setText(edit.getText()+"+");
            if (txtfady.text.length != 0) {
                input1 = (txtfady.text.toString() + "").toFloat().toDouble()
                add = true
                decimal = false
                txtfady.text = null
            }
        })
          btn_min.setOnClickListener(View.OnClickListener {
            mp.start()

            //  edit.setText(edit.getText()+"-");
            if (txtfady.text.length != 0) {
                input1 = (txtfady.text.toString() + "").toFloat().toDouble()
                min = true
                decimal = false
                txtfady.text = null
            }
        })
      btn_div.setOnClickListener(View.OnClickListener {
            mp.start()

            // edit.setText(edit.getText()+"/");
            if (txtfady.text.length != 0) {
                input1 = (txtfady.text.toString() + "").toFloat().toDouble()
                div = true
                decimal = false
                txtfady.text = null
            }
        })
      btn_x.setOnClickListener(View.OnClickListener {
            mp.start()

            // edit.setText(edit.getText()+"X");
            if (txtfady.text.length != 0) {
                input1 = (txtfady.text.toString() + "").toFloat().toDouble()
                multi = true
                decimal = false
                txtfady.text = null
            }
        })
      btn_n.setOnClickListener(View.OnClickListener {
            mp.start()
            // edit.setText(edit.getText()+"%");
            if (txtfady.text.length != 0) {
                input1 = (txtfady.text.toString() + "").toFloat().toDouble()
                nesp = true
                decimal = false
                txtfady.text = null
            }
        })
      btnequal.setOnClickListener(View.OnClickListener { // edit.setText(edit.getText()+"=");
            if (add || min || div || multi || nesp) {
                input2 = (txtfady.text.toString() + "").toFloat().toDouble()
                mp_3.start()
            }
            if (add) {
              //  txtfady.setText(input1 + input2 + "")
                txtfady.text= (input1+input2).toString()
                if ( (input1+input2).toString()== (1972001.0).toString()) {
                    company.text = "Abdalrhman Mostafa"
                }
                add = false
            }
            if (min) {
               // txtfady.setText(input1 - input2.toString() + "")
                txtfady.text= (input1-input2).toString()
                if ( (input1-input2).toString()== (1972001.0).toString()) {
                    company.text = "Abdalrhman Mostafa"
                }
                min = false
            }
            if (div) {
             //   txtfady.setText(input1 / input2.toString() + "")
                txtfady.text= (input1/input2).toString()
                if ( (input1/input2).toString()== (1972001.0).toString()) {
                    company.text = "Abdalrhman Mostafa"
                }
                div = false
            }
            if (multi) {
              //  txtfady.setText(input1 * input2.toString() + "")
                txtfady.text= (input1*input2).toString()
                if ( (input1*input2).toString()== (1972001.0).toString()) {
                    company.text = "Abdalrhman Mostafa"
                }
                multi = false
            }
            if (nesp) {
               // txtfady.setText(input1 % input2.toString() + "")
                txtfady.text= (input1%input2).toString()
                nesp = false
            }
        })
        c.setOnClickListener(View.OnClickListener {
            txtfady.text = ""
            mp_2.start()
        })
    /*    if ( txtfady.text== (2.0).toString()) {
            company.text = "Abdalrhman Mostafa"
        }*/
    }
}