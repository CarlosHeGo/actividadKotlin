fun main() {

    val accion1: Array<String> = arrayOf("correr", "saltar", "correr", "saltar", "correr")
    val accion2: Array<String> = arrayOf("correr", "correr", "correr", "saltar", "correr")
    val accion3: Array<String> = arrayOf("correr", "correr", "saltar", "saltar", "correr")
    val accion4: Array<String> = arrayOf("correr", "correr", "saltar", "saltar", "correr")
    val accion5: Array<String> = arrayOf("correr", "saltar", "correr", "saltar")
    val accion6: Array<String> = arrayOf("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr")
    val accion7: Array<String> = arrayOf("saltar", "saltar", "saltar", "saltar", "saltar")
    val accion8: Array<String> = arrayOf("saltar", "saltar", "saltar", "saltar", "saltar")

    val pista1: String = "_|_|_"
    val pista2: String = "_|_|_"
    val pista3: String = "_|_|_"
    val pista4: String = "_|_|_|_"
    val pista5: String = "_|_|_"
    val pista6: String = "_|_|_"
    val pista7: String = "|||||"
    val pista8: String = "||_||"

    println(carrera(accion1,pista1))
    println(carrera(accion2,pista2))
    println(carrera(accion3,pista3))
    carrera(accion4,pista4)
    carrera(accion5,pista5)
    println(carrera(accion6,pista6))
    println(carrera(accion7,pista7))
    println(carrera(accion8,pista8))

}

fun carrera(accion: Array<String>, pista: String ): Boolean{

    var posicion: Int = 0
    var superada: Boolean = true
    for (superficie in pista){
        if ((accion[posicion] == "correr" && superficie == '_') || (accion[posicion] == "saltar" && superficie == '|')){
            print(superficie)
        } else if (accion[posicion] == "saltar" && superficie == '_'){
            print('x')
            superada = false
        } else if (accion[posicion] == "correr" && superficie == '|'){
            print('/')
            superada = false
        } else {
            print('?')
            superada = false
        }
        posicion++
    }
    return superada
}