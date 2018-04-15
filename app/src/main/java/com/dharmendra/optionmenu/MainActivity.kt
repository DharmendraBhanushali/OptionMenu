package com.dharmendra.optionmenu

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.RelativeLayout
import android.widget.TextView


 class MainActivity : AppCompatActivity() {

    //Define Objecct Of RelativeLayout
     lateinit var backgroud:RelativeLayout
    lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Find View By Id For TextView because We change the Color of text
        textView=findViewById<TextView>(R.id.textView) as TextView

        //Find View By Id For Main Layout because we chnage the Color of Backgroud
        backgroud=findViewById<RelativeLayout>(R.id.relative) as RelativeLayout
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        //Inflate menu
        menuInflater.inflate(R.menu.option_menu,menu)
        return true
    }

    //Method to Handle Option Item Click

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val selectedItem= item!!.itemId

        when(selectedItem){

            R.id.magenta->{
                //Change Text Color
                textView.setTextColor(Color.MAGENTA)
            }

            R.id.yellow->{
                //Change Text Color
                textView.setTextColor(Color.YELLOW)
            }

            R.id.red->{
                //Change Background Color
               backgroud.setBackgroundColor(Color.RED)
            }
            R.id.green->{
                //Change Background Color
                backgroud.setBackgroundColor(Color.GREEN)
            }
            R.id.blue->{
                //Change Background Color
                backgroud.setBackgroundColor(Color.BLUE)
            }
        }


        return super.onOptionsItemSelected(item)
    }
}
