package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            var age = spinner.selectedItemPosition
            var gender = radioGroup.checkedRadioButtonId
            var result:Double = 0.0

            if(age == 0)//less than 17
            { result = 60.00}
            else if (age == 1)// 17-25
            {
                if(radioButton.isChecked) {
                    if(checkBox.isChecked)
                        result = 120.00
                    else
                        result = 220.00
                }
                else if(checkBox.isChecked)
                    result = 170.00
                else
                    result = 70.00
            }
            else if(age == 2)
            {
                result = 90.00 +
                        (if(radioButton.isChecked) 100.00 else 0.0)
                        (if(checkBox.isChecked) 150.00 else 0.0)
            }
            else if(age == 3)
            {
                result = 120.00 +
                        (if(radioButton.isChecked) 150.00 else 0.0)
                (if(checkBox.isChecked) 200.00 else 0.0)
            }
            else if(age == 4) {
                result = 150.00 +
                        (if (radioButton.isChecked) 200.00 else 0.0)
                (if (checkBox.isChecked) 250.00 else 0.0)
            }
            else if(age == 5)
            {
                result = 150.00 +
                        (if(radioButton.isChecked) 200.00 else 0.0)
                (if(checkBox.isChecked) 300.00 else 0.0)
            }
            textView5.text = "RM" + result.toString()
        }

        button2.setOnClickListener() {
            radioGroup.clearCheck()
            textView5.text = ""
            checkBox.isChecked = false
            spinner.setSelection(0)
        }
    }
}
