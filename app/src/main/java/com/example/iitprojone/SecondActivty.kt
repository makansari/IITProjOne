package com.example.iitprojone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second_activty.*

class SecondActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activty)

      /* var s =  intent.extras!!.getString("key")

        textView2Result.setText(s)*/


        var countries =
                listOf<String>("India", "japan", "korea","nepal","bhutan","India", "japan", "korea","nepal","bhutan")

    //var arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,countries)
        var arrayAdapter = ArrayAdapter<String>(this, R.layout.item_layout,R.id.textViewitem,countries)

        mylistview.adapter = arrayAdapter

        mylistview.setOnItemClickListener { parent, view, position, id ->

           var item =  mylistview.getItemAtPosition(position) as String

            Toast.makeText(this, "you clicked $item at positon $position",Toast.LENGTH_SHORT).show()
        }

    }
}