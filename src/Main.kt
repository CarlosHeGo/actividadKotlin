import kotlin.Array
import kotlin.collections.indices

fun main() {

    var juego1: Array<Array<String>> = arrayOf(arrayOf("X","O","X"),arrayOf("O", "X", "O"),arrayOf("O", "O", "X"))
    var juego2: Array<Array<String>> = arrayOf(arrayOf("","O","X"),arrayOf("", "X", "O"),arrayOf("", "O", "X"))
    var juego3: Array<Array<String>> = arrayOf(arrayOf("O","O","O"),arrayOf("O", "X", "X"),arrayOf("O", "X", "X"))
    var juego4: Array<Array<String>> = arrayOf(arrayOf("X","O","X"),arrayOf("X", "X", "O"),arrayOf("X", "X", "X"))

    println(tresEnRaya(juego1))
    println(tresEnRaya(juego2))
    println(tresEnRaya(juego3))
    println(tresEnRaya(juego4))
}

fun tresEnRaya(juego: Array<Array<String>>): String{

    var resultado: String = ""
    var contadorX: Int = 0
    var contadorO: Int = 0
    var numX: Int = 0
    var numO: Int = 0

    for (fila in juego){

        for (fila in juego.indices){
            for (columna in juego[fila].indices){
                if(juego[fila][columna] == "X"){
                    
                }
            }
        }

        for(posicion in fila){

            if(posicion.equals("X"))
                contadorX++

            if(posicion.equals("O"))
                contadorO++

            if(posicion.equals(""))
                resultado = "EMPATE"

        }
    }

    if(contadorX+contadorO == 9){
        if(contadorO == contadorX+1 || contadorX == contadorO+1){
            for (fila in juego) {
                while(fila.equals("X")){
                    numX++
                    if(numX==3){
                        println("gana¿")
                    }

                }
            }
        }
        else
            resultado = "NULL"
    }
    return resultado
}
