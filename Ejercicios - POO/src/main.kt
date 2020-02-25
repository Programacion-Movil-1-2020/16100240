import models.Persona

fun main() {
    println("Ingrese el nombre de una persona:")
    val nombre = readLine()?.toString() as String
    println("Ingrese la edad de la persona: ")
    val edad = readLine()?.toInt() as Int
    println("Ingrese el sexo de la persona: ")
    val sexo = readLine()?.toString() as String
    println("Ingrese el peso de la persona: ")
    val peso = readLine()?.toDouble() as Double
    println("Ingrese la altura de la person: ")
    val altura = readLine()?.toDouble() as Double

    var primerPersona:Persona =  Persona(nombre, edad, sexo, peso, altura)
    var segundaPersona:Persona = Persona(nombre, edad, sexo)
    var tercerPersona:Persona = Persona()
    tercerPersona.setNombre(nombre)
    tercerPersona.setEdad(edad)
    tercerPersona.setSexo(sexo)
    tercerPersona.setPeso(peso)
    tercerPersona.setAltura(altura)

    when(primerPersona.calcularIMC()){
        -1  -> println("La primer persona tiene un peso ideal")
        0   -> println("La primer persona esta por debajo de su peso ideal")
        1   -> println("La primer persona tiene sobre peso")
    }
    when(segundaPersona.calcularIMC()){
        -1  -> println("La segunda persona tiene un peso ideal")
        0   -> println("La segunda persona esta por debajo de su peso ideal")
        1   -> println("La segunda persona tiene sobre peso")
    }
    when(tercerPersona.calcularIMC()){
        -1  -> println("La tercer persona tiene un peso ideal")
        0   -> println("La tercer persona esta por debajo de su peso ideal")
        1   -> println("La tercer persona tiene sobre peso")
    }

    if (primerPersona.esMayorDeEdad())
        println("La primer persona es mayor de edad")
    else
        print("La primer persona es menor de edad")

    if (segundaPersona.esMayorDeEdad())
        println("La segunda persona es mayor de edad")
    else
        print("La segunda persona es menor de edad")

    if (tercerPersona.esMayorDeEdad())
        println("La tercer persona es mayor de edad")
    else
        print("La tercer persona es menor de edad")

    println("Primer persona: ${primerPersona} \nSegunda persona: ${segundaPersona} \nTercer persona: ${tercerPersona}")


}

