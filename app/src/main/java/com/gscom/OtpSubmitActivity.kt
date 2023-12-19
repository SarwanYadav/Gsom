package com.gscom

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OtpSubmitActivity : AppCompatActivity() {


    lateinit var otp: EditText
    lateinit var submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_submit)


        otp=findViewById(R.id.OTP)
        submit=findViewById(R.id.Submit)

        submit.setOnClickListener(View.OnClickListener {

            val otp=otp.text.toString()


            if (otp.length !=4 ){
                Toast.makeText(this, "Please Entr OPT Only 4 Digit!", Toast.LENGTH_SHORT).show()

            }else if (otp.isEmpty()){
                Toast.makeText(this, "Please Enter OTP", Toast.LENGTH_SHORT).show()

            }else {

                val intent =Intent(this, MainActivity::class.java)
                startActivity(intent)


            }


        })


    }
}