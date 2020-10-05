package com.example.appdecolores

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    val tag= "com.example.appdecolores.ActivityMain2.colores"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnrojo = findViewById<Button>(R.id.btnrojo)
        val btnazul = findViewById<Button>(R.id.btnazul)
        val btnamarillo = findViewById<Button>(R.id.btnamarillo)
        val btnverde = findViewById<Button>(R.id.btnverde)
        val btncafe = findViewById<Button>(R.id.btncafe)
        val btnnegro = findViewById<Button>(R.id.btnnegro)
        val btnmorado = findViewById<Button>(R.id.btnmorado)




        btnrojo.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"color: rojo",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(tag,"Color : rojo ")
            startActivity(intent)

        })
        btnazul.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"color: azul",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(tag,"Color : azul ")
            startActivity(intent)

        })
        btnamarillo.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"color: amarillo",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(tag,"Color : amarillo ")
            startActivity(intent)

        })
        btnverde.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"color: verde",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(tag,"Color : verde ")
            startActivity(intent)

        })
        btncafe.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"color: cafe",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(tag,"Color : cafe ")
            startActivity(intent)

        })
        btnnegro.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"color: negro",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(tag,"Color : negro ")
            startActivity(intent)

        })
        btnmorado.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"color: morado",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(tag,"Color : morado ")
            startActivity(intent)

        })

    }
}