package com.example.caculator


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_caculator.*

/**
 * A simple [Fragment] subclass.
 */
class Caculator : Fragment() {

    var input1 = 0.0
    var input2 = 0.0

    var add = false
    var sub = false
    var mul = false
    var div = false
    var per = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_caculator, container, false)

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        Handle events when click numberButtons.
        button_0.setOnClickListener { text_result.append("0") }
        button_1.setOnClickListener { text_result.append("1") }
        button_2.setOnClickListener { text_result.append("2") }
        button_3.setOnClickListener { text_result.append("3") }
        button_4.setOnClickListener { text_result.append("4") }
        button_5.setOnClickListener { text_result.append("5") }
        button_6.setOnClickListener { text_result.append("6") }
        button_7.setOnClickListener { text_result.append("7") }
        button_8.setOnClickListener { text_result.append("8") }
        button_9.setOnClickListener { text_result.append("9") }
        button_dot.setOnClickListener { text_result.append(".") }


//          Handle events when click OperatorButtons: +, -, * /, %.
        button_add.setOnClickListener {
            add = true
            input1 = text_result.text.toString().toDouble()
            text_result.text = "0"
        }

        button_sub.setOnClickListener {
            sub = true

            input1 = text_result.text.toString().toDouble()
            text_result.text = "0"
        }

        button_mul.setOnClickListener {
            mul = true
            input1 = text_result.text.toString().toDouble()
            text_result.text = "0"
        }

        button_div.setOnClickListener {
            div = true
            input1 = text_result.text.toString().toDouble()
            text_result.text = "0"
        }

        button_per.setOnClickListener {
            per = true
            input1 = text_result.text.toString().toDouble()
            text_result.text = "0"
        }

//        Handle events when click acButton: AC.
        button_ac.setOnClickListener {
            val ac = 0
            text_result.text = ac.toString()
        }

//        Handle events when click cButton: C.
        button_c.setOnClickListener {
            var number = text_result.text.toString().length

            var delete = text_result.text.toString().substring(0, number - 1)
            text_result.text = delete
        }

//        Handles events when click equalButton: =.
        button_result.setOnClickListener {
            //         when click button: + .
            if (add == true) {
                input2 = text_result.text.toString().toDouble()
                text_result.text = (input1 + input2).toString()
                add = false
//         when click button: - .
            } else if (sub == true) {
                input2 = text_result.text.toString().toDouble()
                text_result.text = (input1 - input2).toString()
                sub = false
//         when click button: X .
            } else if (mul == true) {
                input2 = text_result.text.toString().toDouble()
                text_result.text = (input1 * input2).toString()
                mul = false
//         when click button: / .
            } else if (div == true) {
                input2 = text_result.text.toString().toDouble()
                text_result.text = (input1 / input2).toString()
                div = false
//         when click button: % .
            } else if (per == true) {
                input2 = text_result.text.toString().toDouble()
                text_result.text = (input1 * input2 / 100).toString()
                per = false
            }
        }

    }

}




