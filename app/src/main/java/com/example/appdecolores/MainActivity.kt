package com.example.appdecolores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tvtipo:TextView?=null
    var tvdescriv:TextView?=null
    var tvmensaje:TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvtipo = findViewById(R.id.txttipo)
        tvdescriv = findViewById(R.id.txtdescrip)
        tvmensaje = findViewById(R.id.txtmensaje)

        val coloresdata = intent.getStringExtra(  "com.example.appdecolores.ActivityMain2.colores")
        Toast.makeText( this,coloresdata, Toast.LENGTH_SHORT).show()





        val rojo = colores("color primario","Rojo" , "El rojo es la cura definitiva para la tristeza")
        val azul = colores("colo primario","Azul","Somos un planeta azul y un mundo oceánico")
        val amarillo = colores("color primario","Amarillo" , "El amarillo es el color percibido del sol. Se asocia con alegría ,felicidad, intelecto y energía")
        val verde = colores("color secundario","Verde","Es el color principal del mundo,  y del que surge su belleza")
        val cafe = colores("color secundario","cafe" ,"Tienes café en la mirada, eso explica por que me quitas el sueño" )
        val negro = colores("color secundario","Negro","Si no sabes que color tomar, toma negro")
        val morado = colores("color secundario","Morado","  Mas vale ponerse una vez colorado que diez morado" )




        if(coloresdata == "color : rojo"){
            tvtipo?.text =rojo.tipo
            tvdescriv?.text =rojo.descrip
            tvmensaje?.text =rojo.mensaje

        } else if(coloresdata == "color : azul"){
            tvtipo?.text =azul.tipo
            tvdescriv?.text =azul.descrip
            tvmensaje?.text =azul.mensaje

        } else if(coloresdata == "color : amarillo"){
            tvtipo?.text =amarillo.tipo
            tvdescriv?.text =amarillo.descrip
            tvmensaje?.text =amarillo.mensaje

        } else if(coloresdata == "color : verde"){
            tvtipo?.text =verde.tipo
            tvdescriv?.text =verde.descrip
            tvmensaje?.text =verde.mensaje

        } else if(coloresdata == "color : cafe"){
            tvtipo?.text =cafe.tipo
            tvdescriv?.text =cafe.descrip
            tvmensaje?.text =cafe.mensaje

        } else if(coloresdata == "color : negro"){
            tvtipo?.text =negro.tipo
            tvdescriv?.text =negro.descrip
            tvmensaje?.text =negro.mensaje

        } else if(coloresdata == "color : morado"){
            tvtipo?.text =morado.tipo
            tvdescriv?.text =morado.descrip
            tvmensaje?.text =morado.mensaje

        }







    }
}