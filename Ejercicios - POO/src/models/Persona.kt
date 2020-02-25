package models

class Persona{
    private var nombre:String = ""
    private var edad:Int = 0
    private var dni:String? = null
    private val sexoPorDefecto:String = "M"
    private var sexo:String = sexoPorDefecto
    private var peso:Double = 0.0
    private var altura:Double = 0.0

    constructor(){
        this.nombre = ""
        this.edad = 0
        this.dni = generaDNI()
        this.sexo = sexoPorDefecto
        this.peso = 0.0
        this.altura = 0.0
    }

    constructor(nombre:String, edad:Int, sexo:String){
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
    }

    constructor(nombre: String, edad: Int, sexo: String, peso:Double, altura:Double, dni:String = ""){
        this.nombre = nombre
        this.edad = edad
        this.dni = dni
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }

    fun setNombre(nombre: String){
        this.nombre = nombre
    }

    fun  setEdad(edad: Int){
        this.edad = edad
    }

    fun setSexo(sexo: String){
        this.sexo = sexo
    }

    fun setPeso(peso: Double){
        this.peso = peso
    }

    fun setAltura(altura: Double){
        this.altura = altura
    }

    fun calcularIMC():Int{
        val pesoIdeal:Double = peso / Math.pow(altura, 2.0)
        if (pesoIdeal < 20)
            return -1
        else if ((20.0..25.0).contains(pesoIdeal))
            return 0
        else
            return 1

    }

    fun esMayorDeEdad():Boolean{
        return edad > 18
    }

    fun comporbarSexo(sexo:String):String{
        if (this.sexo == sexo)
            return sexo
        else
            return "H"
    }

    private fun generaDNI(): String {
        return Math.random().toString()
    }


    override fun toString(): String {
        return "${this.nombre} ${this.edad} ${this.sexo} ${this.altura} ${this.peso} ${this.dni}"
    }



}