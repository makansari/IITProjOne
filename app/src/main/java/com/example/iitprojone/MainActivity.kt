package com.example.iitprojone

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var sp : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sp = getSharedPreferences("myfile", Context.MODE_PRIVATE)

        editTextUsername.setText(sp.getString("un",""))

        buttonSubmit.setOnClickListener {
        /*   var username =  editTextUsername.text.toString()
            Toast.makeText(this, "username Entered is : $username",Toast.LENGTH_LONG).show()
            textViewResult.setText(username)

            var i = Intent(this, SecondActivty::class.java)
            i.putExtra("key",username)
            startActivity(i)*/

            var username =  editTextUsername.text.toString()

            var ed : SharedPreferences.Editor = sp.edit()
            ed.putString("un",username)
            ed.commit()


            editTextUsername.setText("")

        }
    }
}