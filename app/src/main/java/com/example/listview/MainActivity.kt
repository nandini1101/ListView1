package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listview)
        //making all tasks as arrays/list of string type

        val taskList = arrayListOf<String>()
        taskList.add("Attend Exam")
        taskList.add("Do App work")
        taskList.add("Read 5th unit of Ade")
        taskList.add("Read the possible chapters of Ade")
        taskList.add("Do the App work again")

        // Adapter is used to save data to listview ,here direct inbuilt adapter is used
        //Array adapter is used here
        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listview.adapter = adapterForMyListView

        listview.setOnItemClickListener{parent , view , position , id ->
            // view as textview -> it is typecasting
            val text = "Clicked on item: " + (view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()

        }

    }
}