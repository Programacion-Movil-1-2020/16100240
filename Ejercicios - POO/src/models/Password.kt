package models

import kotlin.random.Random

class Password {
    private var longitud:Int = 8
    private var contrasena:String = ""

    constructor(){
        this.longitud = 8
        this.contrasena = ""
    }

    constructor(longitud: Int){
        this.contrasena = generarPassword(this.longitud)
    }

    fun getLongitud():Int{
        return this.longitud
    }

    fun setLongitud(longitud:Int){
        this.longitud = longitud
    }

    fun getContrasena():String{
        return this.contrasena
    }

    fun esFuerte():Boolean{
        var mayusculas = 0
        var minusculas = 0
        var numeros = 0
        for (char in contrasena){
            if (char.isUpperCase())
                mayusculas++
            else if (char.isLowerCase())
                minusculas++
            else if (char.isDigit())
                numeros =0
        }
        return mayusculas > 2 && minusculas > 1 && numeros > 5
    }

    fun generarPassword(longitud: Int):String{
        var contra = ""
        var random:Random = Random
        for (i in 0..longitud - 1){
            if (i<4){
                contra += random.nextInt(10)
            }else
                contra += (random.nextInt(91) + 65).toString()
        }
        return contra
    }

}