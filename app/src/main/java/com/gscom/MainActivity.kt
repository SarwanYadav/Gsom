package com.gscom

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var editTextPhone: EditText
    lateinit var editTextPassword: EditText
    lateinit var textView3: TextView
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editTextPhone = findViewById(R.id.edEmailForgot)
        editTextPassword = findViewById(R.id.editTextPhone2)
        button = findViewById(R.id.button)
        textView3 = findViewById(R.id.forgotPassword)

        button.setOnClickListener {

            val phoneNumber = editTextPhone.text.toString()
            val paswword = editTextPassword.text.toString()
            val forgotPassword = textView3.text.toString()


            if (phoneNumber.isEmpty() || phoneNumber.length != 10) {
                editTextPhone.error = "Please enter a valid 10-digit mobile number"
                editTextPhone.requestFocus()
                return@setOnClickListener
            } else if (paswword.isEmpty() || paswword.length != 10) {

                editTextPassword.error = "Please enter a valid 10 digit password"
                editTextPassword.requestFocus()
                return@setOnClickListener

            } else {

                val intent = Intent(this, dashboard::class.java)
                startActivity(intent)

            }
        }


        textView3.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, forgotPassword::class.java)
            startActivity(intent)
        })


    }


}




