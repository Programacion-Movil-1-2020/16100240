package modelos

class Caracteristica {
    var caracteristica:String = ""
    fun seleccionarCaracteristica(opc:Int) {
        when (opc) {
            1 -> caracteristica = "Transmision manual"
            2 -> caracteristica = "Transmision automatica"
            3 -> caracteristica = "Aire acondicionado"
            4 -> caracteristica = "Frenos ABS "
            5 -> caracteristica = "Bolsas de aire"
            6 -> caracteristica = "Pantalla tactil"
            7 -> caracteristica = "Controles Electricos"
        }
    }
}