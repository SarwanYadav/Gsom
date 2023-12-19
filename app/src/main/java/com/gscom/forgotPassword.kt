package com.gscom

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class forgotPassword : AppCompatActivity() {


    lateinit var edEmailForgot: EditText
    lateinit var button: Button
    val emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        edEmailForgot = findViewById(R.id.edEmailForgot)
        button = findViewById(R.id.button)

        button.setOnClickListener(View.OnClickListener {


            val email = edEmailForgot.text.toString()


            if (email.isEmpty()) {
                edEmailForgot.error = "Please Enter Email"
                edEmailForgot.requestFocus()

            } else if (!email.matches(emailRegex.toRegex())) {
               edEmailForgot.error="Please Enter Vaild Email ID!"
                edEmailForgot.requestFocus()

            } else {
                val intent = Intent(this, OtpSubmitActivity::class.java)
                startActivity(intent)
            }


        })


    }
}