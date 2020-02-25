import models.Password

fun main() {
    println("Cantidad de passwords:")
    val passCant = readLine()?.toInt() as Int

    var array:MutableList<Int> = mutableListOf()
    var arrayPass:MutableList<Password> = mutableListOf()

    var long:Int = 0
    for (i in 1..passCant){
        println("Ingrese la longituda de la contraseña ${i}:")
        long = readLine()?.toInt() as Int
        array.add(long)
    }

    for (j in array){
        val pass:Password = Password(j)
        arrayPass.add(pass)
    }

    var arrayBool:MutableList<Boolean> = mutableListOf()
    for (k in arrayPass){
        arrayBool.add(k.esFuerte())
        println("${k.getContrasena()} valor_booleano ${k.esFuerte()} ")
    }


}