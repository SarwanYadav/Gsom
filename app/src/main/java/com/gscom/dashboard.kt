package com.gscom

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.constraintlayout.widget.ConstraintLayout

class dashboard : AppCompatActivity() {

    lateinit var arrow: ImageView
    lateinit var dots: ImageView
    lateinit var constraintLayout_01: ConstraintLayout
    lateinit var constraintLayout_02: ConstraintLayout
    lateinit var constraintLayout_03: ConstraintLayout
    lateinit var constraintLayout_04: ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        arrow = findViewById(R.id.arrow)
        dots = findViewById(R.id.dots)
        constraintLayout_01 = findViewById(R.id.constraintLayout_01)
        constraintLayout_02 = findViewById(R.id.constraintLayout_02)
        constraintLayout_03 = findViewById(R.id.constraintLayout_03)
        constraintLayout_04 = findViewById(R.id.constraintLayout04)

        arrow.setOnClickListener {
            // Navigate back to the previous screen
            finish()
        }

        dots.setOnClickListener {
            showPopup(dots)
        }

        constraintLayout_01.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, ComPlaints::class.java)
            startActivity(intent)
        })

        constraintLayout_02.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, ComPlaints::class.java)
            startActivity(intent)
        })

        constraintLayout_03.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, ComPlaints::class.java)
            startActivity(intent)
        })



        constraintLayout_04.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ComPlaints::class.java)
            startActivity(intent)
        })


    }

    private fun showPopup(view: View) {
        val popup = PopupMenu(this, view)
        popup.inflate(R.menu.menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item: MenuItem? ->

            when (item!!.itemId) {
                R.id.changePassword -> {
                    intent = Intent(this, ChangePassword::class.java)
                    startActivity(intent)
                }

                R.id.Logout -> {
                    intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }

//                R.id.logout -> {
//
//                }
            }
            true
        })
        popup.show()
    }


}