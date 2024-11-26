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

    var listaDelimitadores: MutableList<Char> = mutableListOf()
    var delimitadoresApertura: Array<Char> = arrayOf('(','{','[')
    var delimitadoresCierre: Array<Char> = arrayOf(')','}',']')
    var balanceada: Boolean = true


    for (item in expresion){

        if (item in delimitadoresApertura){
            listaDelimitadores.add(item)

        } else if (item in delimitadoresCierre){
            if (listaDelimitadores.size>0 &&   listaDelimitadores.last() == delimitadoresApertura[delimitadoresCierre.indexOf(item)]){
                listaDelimitadores.removeLast()
            } else
                balanceada = false
        }

    }
    if(balanceada && listaDelimitadores.size==0)
        return true
    else
        return false
}