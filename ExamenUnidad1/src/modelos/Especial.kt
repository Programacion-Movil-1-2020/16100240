package modelos

class Especial {
    var caracteristicaes:String = ""
    fun seleccionarCaracteristica(opc:Int) {
        when (opc) {
            1 -> caracteristicaes = "Faros de niebla"
            2 -> caracteristicaes = "Faros LED"
            3 -> caracteristicaes = "Asientos de piel"
            4 -> caracteristicaes = "Rines de 17 pulgadas"
            5 -> caracteristicaes = "Cargador inalambrico"
            6 -> caracteristicaes = "Camara de reversa"
            7 -> caracteristicaes = "Monitoreo punto ciego"
        }
    }
}