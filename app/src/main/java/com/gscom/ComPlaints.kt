package com.gscom

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gscom.Adapter.ServiceAdapter
import com.gscom.model.User

class ComPlaints : AppCompatActivity() {


    lateinit var recyclerview: RecyclerView
    lateinit var linearLayoutManager: LinearLayoutManager
    var List = arrayListOf<User>()
    lateinit var arrow: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_com_plaints)

        arrow = findViewById(R.id.arrow)

        arrow.setOnClickListener(View.OnClickListener {
            finish()
        })

        List.add(User("sarwan1", "85255", "Abc", "123", "124", "16-12-2023"))
        List.add(User("Raman1", "852550", "Abcs", "1232", "12422", "16-12-2024"))
        List.add(User("Ram", "852550", "Abcs", "1232", "12422", "16-12-2024"))
        List.add(User("Shayam", "852550", "Abcs", "1232", "12422", "16-12-2024"))
        List.add(User("Ramesh", "852550", "Abcs", "1232", "12422", "16-12-2024"))






        recyclerview = findViewById(R.id.recyclerview)

        linearLayoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = linearLayoutManager

        recyclerview.adapter = ServiceAdapter(this@ComPlaints, List)

    }
}