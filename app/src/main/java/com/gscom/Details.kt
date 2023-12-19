package com.gscom

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Details : AppCompatActivity() {

    lateinit var spnstatus: Spinner
    lateinit var NAME: TextView
    lateinit var ACC_ID: TextView
    lateinit var arrow: ImageView
    lateinit var RRNO: TextView
    lateinit var Category: TextView
    lateinit var Place: TextView
    lateinit var DATE: TextView


    var List = arrayListOf<String>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)




        // find view id

        spnstatus = findViewById(R.id.spnstatus)
        arrow = findViewById(R.id.arrow)
        NAME = findViewById(R.id.NAME)
        ACC_ID = findViewById(R.id.ACC_ID)
        RRNO = findViewById(R.id.RRNO)
        Category = findViewById(R.id.Category)
        Place = findViewById(R.id.Place)
        DATE = findViewById(R.id.DATE)

        arrow.setOnClickListener(View.OnClickListener {
            finish()
        })


        // categroy

        List.add("close")
        List.add("open")
        List.add("Reopen")
        List.add("Pending Case")



        if (spnstatus != null) {
            val adapter = ArrayAdapter(
                this, android.R.layout.simple_spinner_item, List
            )
            spnstatus.adapter = adapter

            spnstatus.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>, view: View, position: Int, id: Long
                ) {
                    Toast.makeText(this@Details, "hh " + position, Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }


        val intent = intent
        val sarwanValue = intent.getStringExtra("name")
        NAME.setText("Name: " + sarwanValue)


        val sarwanAcc = intent.getStringExtra("AC ID")
        ACC_ID.setText("AC ID :" + sarwanAcc)


        val subcate = intent.getStringExtra("Subcategory")
        Category.setText("category : " + subcate)

        val sarwanRRno = intent.getStringExtra("rrno")
        Place.setText("RR no :"+ sarwanRRno)

        val sarwanDate=intent.getStringExtra("date")
        DATE.setText("Date :"+ sarwanDate)



    }


}