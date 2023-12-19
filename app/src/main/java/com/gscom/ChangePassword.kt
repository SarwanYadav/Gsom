package com.gscom

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class ChangePassword : AppCompatActivity() {


    lateinit var current_password: EditText
    lateinit var New_Password: EditText
    lateinit var Confirm_Password: EditText
    lateinit var button: Button
    lateinit var progressBar: ProgressBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        current_password = findViewById(R.id.current_password)
        New_Password = findViewById(R.id.New_Password)
        Confirm_Password = findViewById(R.id.Confirm_Password)
        button = findViewById(R.id.button)
        progressBar = findViewById(R.id.progressBar)



        button.setOnClickListener(View.OnClickListener {

            val cPassword = current_password.text.toString()
            val newPassword = New_Password.text.toString()
            val conPassword = Confirm_Password.text.toString()
            val sent = button.text.toString()


            if (cPassword.isEmpty()) {
                current_password.error = "Please Enter Current"
                current_password.requestFocus()
            } else if (newPassword.isEmpty()) {
                New_Password.error = "Please Enter New Password"
                New_Password.requestFocus()

            } else if (conPassword.isEmpty()) {
                Confirm_Password.error = "Please Enter Confirm Password"
                Confirm_Password.requestFocus()
            } else if (newPassword != conPassword) {
                Confirm_Password.error = "Passwords don't match!"
                Confirm_Password.requestFocus()

            } else {

                progressBar.visibility = View.VISIBLE

                val handler = android.os.Handler()
                handler.postDelayed({

                    progressBar.visibility = View.INVISIBLE


                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }, 5000)

            }


        })


    }
}


