import com.sun.org.apache.bcel.internal.generic.RETURN
import modelos.Auto
import modelos.Caracteristica
import modelos.Especial

var autos:MutableList<Auto> = mutableListOf()

fun main(){
    var opcion = 0
    loop@ do {
        println("¡Bienvenido al Examen de la Unidad #1! <3")
        println("1.- Ensamblar auto nuevo")
        println("2.- Ver Autos Ensamblados")
        println("3.- Salir")
        opcion = readLine()?.toInt() as Int
        when(opcion){
            1 -> ensamblarAuto()
            2 -> verAutos()
            3 -> break@loop
        }
    }while (true)
    println("¡GRACIAS!")
}

fun ensamblarAuto(){
    var a: Auto = Auto()
    println("MARCA:")
    val marca = readLine()?.toString() as String
    if (marca != null) {
        a.marca = marca
        println("MODELO: ")
        val modelo = readLine()?.toString() as String
        if (modelo != null) {
            a.modelo = modelo
            a.caracteristicas = seleccionarCaracteristicas()
            a.caracteristicasEspeciales = seleccionarCaracteristicasEspeciales()
            println("El Auto Fue Ensamblado Correctamente.")
            autos.add(a)
        }else{
            println("ERROR AL CAPTURAR")
        }
    }else{
        println("ERROR AL CAPTURAR")
    }
}

fun verAutos(){
    if(autos.isEmpty()){
        println("Aun No Cuenta Con Autos Ensamblados\n");
    }
    else{
        autos.forEachIndexed { index, auto ->  print("Auto ${index+1} .- \n Marca: ${auto.marca}\n Modelo: ${auto.modelo}\n Caracteristicas:\n")
            auto.caracteristicas.forEachIndexed{ index,car -> print("${index+1}.-"+car.caracteristica+"\n") }
            print("Caracteristicas Especiales: \n")
            auto.caracteristicasEspeciales.forEachIndexed{ index,care -> print("${index+1}.-"+care.caracteristicaes+"\n")
            }
        }
        print("Autos totales: ${autos.size} \n\n")
    }
}

fun seleccionarCaracteristicas(): MutableList<Caracteristica> {
    var carSeleccionadas: MutableList<Caracteristica> = mutableListOf()
    println("¿Desea Agregar Caracteristicas? 1.- Si  0.- No")
    var opc = readLine()?.toString() as String
    if (opc != null) {
        while (opc?.toInt() == 1) {
            println("1.- Transmision manual")
            println("2.- Transmision automatica")
            println("3.- Aire acondicionado")
            println("4.- Frenos ABS")
            println("5.- Bolsas de aire")
            println("6.- Pantalla tactil")
            println("7.- Controles Electricos")
            val car = readLine()?.toInt() as Int
            if (car != null) {
                var rn = 1..7
                if (rn.contains(car.toInt())) {
                    var carSeleccionada: Caracteristica = Caracteristica()
                    carSeleccionada.seleccionarCaracteristica(car.toInt())
                    carSeleccionadas.add(carSeleccionada)
                    println("¿Desea Otra Caracteristica? 1.- Sí  0.- No")
                    opc = readLine()?.toString() as String
                } else {
                    println("Opcion no valida intente de nuevo por favor")
                    readLine()
                }
            }
        }
        return carSeleccionadas
    } else {
        println("Error")
    }
    return mutableListOf()
}

fun seleccionarCaracteristicasEspeciales():MutableList<Especial> {
    var carSeleccionadas: MutableList<Especial> = mutableListOf()
    println("¿Desea Agregar Caracteristicas Especiales? 1.- Si  0.- No")
    var opc= readLine()
    if (opc != null) {
        while (opc?.toInt()==1)
        {
            println("1.- Faros de niebla")
            println("2.- Faros LED")
            println("3.- Asientos de piel")
            println("4.- Rines de 17 pulgadas")
            println("5.- Cargador inalambrico")
            println("6.- Camara de reversa")
            println("7.- Monitoreo punto ciego")
            val car = readLine()
            if (car != null) {
                var rn = 1..7
                if (rn.contains(car.toInt())) {
                    var carSeleccionada:Especial = Especial()
                    carSeleccionada.seleccionarCaracteristica(car.toInt())
                    carSeleccionadas.add(carSeleccionada)

                    println("¿Desea Otra Caracteristica Especial? 1.- Si 2.- No")
                    opc= readLine()
                } else {
                    println("Opcion no valida intente de nuevo por favor")
                }
            }
        }
        return carSeleccionadas
    }else{
        println("Error")
    }
    return mutableListOf()
}