package com.burcuerdogan.alertdialogkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Context
        // Activity Context -> this
        // App Context -> applicationContext

        Toast.makeText(applicationContext,"This is a Toast Message",Toast.LENGTH_LONG).show()

        /*
        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity,"Test",Toast.LENGTH_LONG).show()
            }
        })
        */

    }

    fun save(view: View){

        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are You Sure?")
        alert.setPositiveButton("Yes") {dialog, which ->
            Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No") {dialog, which ->
            Toast.makeText(applicationContext,"Not Saved",Toast.LENGTH_LONG).show()
        }
        alert.show()

    }
}