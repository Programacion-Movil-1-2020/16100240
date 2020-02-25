package models

class Cuenta{

    private var titular:String
    private var cantidad: Double = 0.0

    constructor(titular: String){
        this.titular =  titular
    }

    constructor(titular: String, cantidad: Double){
        this.titular = titular
        this.cantidad = cantidad
    }


    fun getTitular():String{
        return this.titular
    }

    fun setTitutlar(titular: String){
        this.titular = titular;

    }

    fun getCantidad():Double{
        return this.cantidad
    }

    fun setCantidad(cantidad: Double){
        this.cantidad = cantidad
    }


    override fun toString(): String {
        return "Titular: ${titular} Saldo: ${cantidad}"
    }

    fun ingresar(cantidad: Double){
        if (cantidad > 0){
            this.cantidad += cantidad
        }
    }

    fun retirar(cantidad: Double){
        if((this.cantidad - cantidad) <= 0.0){
            this.cantidad = 0.0
        }else{
            this.cantidad -= cantidad
        }
    }

}