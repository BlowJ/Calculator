package com.example.caculator


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
    ): View?
    {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_caculator, container, false)


//        btn_n0.setOnClickListener {tv_result.append("0")}
//        view.btn_n1.setOnClickListener {view.tv_result.append("1")}
//        view.btn_n2.setOnClickListener {view.tv_result.append("2")}
//        view.btn_n3.setOnClickListener {view.tv_result.append("3")}
//        view.btn_n4.setOnClickListener {view.tv_result.append("4")}
//        view.btn_n5.setOnClickListener {view.tv_result.append("5")}
//        view.btn_n6.setOnClickListener {view.tv_result.append("6")}
//        view.btn_n7.setOnClickListener {view.tv_result.append("7")}
//        view.btn_n8.setOnClickListener {view.tv_result.append("8")}
//        view.btn_n9.setOnClickListener {view.tv_result.append("9")}
//
//        view.btn_cong.setOnClickListener {view.tv_result.append("+")}
//        view.btn_tru.setOnClickListener {view.tv_result.append("-")}
//        view.btn_x.setOnClickListener {view.tv_result.append("x")}
//        view.btn_chia.setOnClickListener {view.tv_result.append("/")}
//
//        view.btn_ac.setOnClickListener {view.tv_result.text="0"}
//        view.btn_result.setOnClickListener {}

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        btn_n0.setOnClickListener {tv_result.append("0")}
        btn_n1.setOnClickListener {tv_result.append("1")}
        btn_n2.setOnClickListener {tv_result.append("2")}
        btn_n3.setOnClickListener {tv_result.append("3")}
        btn_n4.setOnClickListener {tv_result.append("4")}
        btn_n5.setOnClickListener {tv_result.append("5")}
        btn_n6.setOnClickListener {tv_result.append("6")}
        btn_n7.setOnClickListener {tv_result.append("7")}
        btn_n8.setOnClickListener {tv_result.append("8")}
        btn_n9.setOnClickListener {tv_result.append("9")}
        btn_dot.setOnClickListener {tv_result.append(".")}





        btn_add.setOnClickListener {
            add = true

            input1 = tv_result.text.toString().toDouble()
            tv_result.text = "0"

        }
        btn_sub.setOnClickListener {
            sub = true

            input1 = tv_result.text.toString().toDouble()
            tv_result.text = "0"
        }
        btn_mul.setOnClickListener {
            mul = true
            input1 = tv_result.text.toString().toDouble()
            tv_result.text = "0"
        }
        btn_div.setOnClickListener {
            div = true
            input1 = tv_result.text.toString().toDouble()
            tv_result.text = "0"
        }

        btn_ac.setOnClickListener {
            val ac = 0
            tv_result.text = ac.toString()
        }

        btn_c.setOnClickListener {
            var number = tv_result.text.toString().length

            var delete = tv_result.text.toString().substring(0, number -1)
            tv_result.text = delete
        }
        btn_per.setOnClickListener {
            per = true
            input1 = tv_result.text.toString().toDouble()
            tv_result.text = "0"
        }
        btn_result.setOnClickListener {

            if (add == true){
                input2 = tv_result.text.toString().toDouble()
                tv_result.text = (input1 + input2).toString()
                add = false

            }
            else if (sub == true){
                input2 = tv_result.text.toString().toDouble()
                tv_result.text = (input1 - input2).toString()
                sub = false
            }
            else if (mul == true){
                input2 = tv_result.text.toString().toDouble()
                tv_result.text = (input1 * input2).toString()
                mul = false
            }
            else if (div == true){
                input2 = tv_result.text.toString().toDouble()
                tv_result.text = (input1 / input2).toString()
                div = false
            }
            else if (per == true){
                input2 = tv_result.text.toString().toDouble()
                tv_result.text = (input1 * input2 /100).toString()
                per = false
            }
        }





    }





}




