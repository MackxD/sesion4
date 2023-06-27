package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity1 : AppCompatActivity() {
    private lateinit var n1: EditText
    private lateinit var n2: EditText
    private lateinit var Boton1: Button
    private lateinit var Boton2: Button
    private lateinit var Resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_text)
        // Llamar a los elementos
        Boton1 = findViewById(R.id.Boton1)
        Boton2 = findViewById(R.id.Boton2)
        Resultado = findViewById(R.id.Resultado)
        n1 = findViewById(R.id.n1)
        n2 = findViewById(R.id.n2)


        Boton1.setOnClickListener() {
            val a = n1.text.toString().toInt()
            val b = n2.text.toString().toInt()

            val c = a + b

            Resultado.text = c.toString()
        }
        Boton2.setOnClickListener() {
            val a = n1.text.toString().toInt()
            val b = n2.text.toString().toInt()
            val c = a - b

            Resultado.text = c.toString()

        }

        val checkBox = findViewById<CheckBox>(R.id.checkbox)
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                Boton2.isEnabled = true

            } else {
                Boton2.isEnabled = false

            }

        }

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val opcion1 = findViewById<RadioButton>(R.id.Opcion1)
        val opcion2 = findViewById<RadioButton>(R.id.Opcion2)
        val opcion3 = findViewById<RadioButton>(R.id.Opcion3)

        radioGroup.setOnCheckedChangeListener{ _,checkedId ->
            when(checkedId){
                R.id.Opcion1->{
                    opcion1.isEnabled = true
                }
                R.id.Opcion2->{
                    opcion2.isEnabled=false
                }
                R.id.Opcion3->{
                    opcion3.isEnabled=false
                }
            }
        }





    }
}