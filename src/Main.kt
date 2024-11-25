//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
/*
    {a + b [c] * (2x2)}}}}
    { [ a * ( c + d ) ] - 5 }
    { a * ( c + d ) ] - 5 }
    {a^4 + (((ax4)}
    { ] a * ( c + d ) + ( 2 - 3 )[ - 5 }
    {{{{{{(}}}}}}
    (a

 */

    println("Introduce una expresión: ")
    val expresion: String = readln()
    println("$expresion ¿está balanceada? ${estaBalanceada(expresion)}")
}

fun estaBalanceada(expresion: String): Boolean{

    val expresionDescompuesta = expresion.toCharArray()
    var delimitadoresApertura: MutableList<Char> = mutableListOf()
    var delimitadoresCierre: MutableList<Char> = mutableListOf()

    for (item in expresionDescompuesta){

        if (item == '(' || item == '{' || item == '[')
            delimitadoresApertura.add(item)
        else if (item == ')' || item == '}' || item == ']')
            delimitadoresCierre.add(item)

    }


    val delimitCierreReverso = delimitadoresCierre.reversed()

    if (delimitadoresCierre.size == delimitadoresApertura.size){
        var balanceado: Boolean = false
        var posicion: Int = 0
        while (posicion < delimitadoresCierre.size && !balanceado){
            println(delimitadoresApertura)
            println(delimitCierreReverso)
            if ((delimitadoresApertura[posicion] == '(' && delimitCierreReverso[posicion] == ')')
                || (delimitadoresApertura[posicion] == '{' && delimitCierreReverso[posicion] == '}')
                || (delimitadoresApertura[posicion] == '[' && delimitCierreReverso[posicion] == ']'))
                balanceado = true
            else balanceado = false
            posicion++
        }
        if (balanceado)
            return true
    }
    return false
}