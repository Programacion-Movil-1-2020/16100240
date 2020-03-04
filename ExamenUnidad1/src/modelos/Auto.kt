package modelos

class Auto {
    var marca : String = ""
    var modelo : String = ""
    var caracteristicas: MutableList<Caracteristica> = mutableListOf()
    var caracteristicasEspeciales: MutableList<Especial> = mutableListOf()
}