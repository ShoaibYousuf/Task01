package com.example.task01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    var sales : TextView? = null
    var commission : TextView? = null
    var total_salary : TextView? = null
    var calculate : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sales = findViewById(R.id.sales)
        commission = findViewById(R.id.commission)
        total_salary = findViewById(R.id.total_salary)
        calculate = findViewById(R.id.calculate)
        calculate!!.setOnClickListener {

            calculateSalary()

        }

    }
    fun calculateSalary() {
        val sale:Float = sales!!.text.toString().toFloat();

        if (sale >= 0) {
            val com = (sale/100)*(9)
            commission!!.text = com.toString()

            val salary = com+200
            total_salary!!.text = salary.toString()
        }

        else{
            Toast.makeText(this, "Invalid  Entry", Toast.LENGTH_LONG).show()

        }




    }
}


