
var equiposArmados:MutableList<PC> = mutableListOf<PC>()

var catalogoCPU: Array<String> = arrayOf("Intel i7 8° Gen.", "Ryzen 5 2600X", "Intel i9 9900k")
var catalogoRAM: Array<String> =  arrayOf("8 GB 1266MHz", "16 GB 2666Mhz", "32GB 3200Mz")
var catalogoAlmacenamiento: Array<String> = arrayOf("500GB HDD 7200RPM", "240GB SSD SATA", "500GB SSD M.2")
var catalogoGPU: Array<String> = arrayOf("GTX 2080ti", "AMD RADEON RX590", "GTX 1650 4GB")

fun main() {
    var salir:Boolean = false
    var opcion:Int
    loop@ do{
        println("""¡Bienvenido a PC MAKER!
Seleccione una de las siguientes opciones
1.- Armar un nuevo equipo 
2.- Ver equipos armados 
3.- Salir 
""".trimIndent())
        opcion = readLine()?.toInt() as Int
        when(opcion){
            1 -> armarNuevoEquipo()
            2 -> verEquiposArmados()
            3 -> break@loop
        }
    }while(true)
    println("¡GRACIAS!")
}

fun armarNuevoEquipo(){
    var armando:Boolean = true
    var pc:PC = PC()
    var catalogoSeleccionado:Int
    var componenteSeleccionado:Int
    do{
        println("""
    Seleccione una opcion para ver el catalogo
    1.- CPU
    2.- RAM
    3.- Almacenamiento
    4.- GPU
    5.- Terminar
    """.trimIndent())
        catalogoSeleccionado = readLine()?.toInt() as Int
        if (!catalogoSeleccionado.equals(5)){
            mostrarCatalogo(catalogoSeleccionado)
            componenteSeleccionado = readLine()?.toInt() as Int
            when(catalogoSeleccionado){
                1 -> pc.procesador = catalogoCPU[componenteSeleccionado]
                2 -> pc.ram = catalogoRAM[componenteSeleccionado]
                3 -> pc.almacenamiento = catalogoAlmacenamiento[componenteSeleccionado]
                4 -> pc.grafica = catalogoGPU[componenteSeleccionado]
            }
        }else{
            if(pc.procesador.equals("") || pc.ram.equals("") || pc.almacenamiento.equals("") || pc.grafica.equals("")){
                println("Hay algunos campos vacios ¿Desea continuar armando su equipo?\n1.- Sí\n2.- No")
                var opcionarmar = readLine()?.toInt() as Int
                if (opcionarmar.equals(2)){
                    equiposArmados.add(pc)
                    armando = false
                }
            }else {
                equiposArmados.add(pc)
                armando = false
            }
        }
    }while(armando)
    println("Se agregó un nuevo equipo a la lista\n")
}

fun mostrarCatalogo(catalogo:Int){
    when(catalogo){
        1 -> for ((index, componente) in catalogoCPU.withIndex()) println("\t\t${index}.- ${componente}")
        2 -> for ((index, componente) in catalogoRAM.withIndex()) println("\t\t${index}.- ${componente}")
        3 -> for ((index, componente) in catalogoAlmacenamiento.withIndex()) println("\t\t${index}.- ${componente}")
        4 -> for ((index, componente) in catalogoGPU.withIndex()) println("\t\t${index}.- ${componente}")
    }
}

fun verEquiposArmados(){
    if(equiposArmados.isEmpty()){
        println("Aun no tiene equipos armados, seleccione la opcion 1 para armar uno nuevo.\n")
    }else{
        for((index, pc) in equiposArmados.withIndex())
            println(""" PC ${index}:
        Procesador: ${pc.procesador}
        Ram: ${pc.ram}
        Almacenamiento: ${pc.almacenamiento}
        GPU: ${pc.grafica}
        
        """.trimIndent())}
}

class PC{
    var procesador: String = ""
    var ram:String = ""
    var almacenamiento:String = ""
    var grafica:String = ""
}