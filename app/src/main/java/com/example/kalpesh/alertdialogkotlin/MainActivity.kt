package com.example.kalpesh.alertdialogkotlin

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun doit(view: View)
    {
        var alert = AlertDialog.Builder(this)
        alert.setTitle("!!!!!!!!!Alert!!!!!!!") ;
        alert.setMessage("Do you want to do it?") ;
        alert.setPositiveButton("Yes") {
            dialogInterface: DialogInterface?, i: Int ->  Toast.makeText(this,"Under processing",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No") {dialogInterface: DialogInterface?, i: Int -> Toast.makeText(applicationContext,"Cancelled ",Toast.LENGTH_LONG).show()  }

    alert.show() ;
    }

}
