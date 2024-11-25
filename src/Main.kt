fun main() {

    println("Introduce una palabra: ")
    val palabra1: String = readln()

    println("Introduce otra palabra: ")
    val palabra2: String = readln()

    println("¿Las palabras $palabra1 y $palabra2 son un anagrama? = ${anagrama(palabra1, palabra2)}")

}

fun anagrama(palabra1: String, palabra2: String): Boolean{

    if (palabra1.reversed() == palabra2)
        return true
    else
        return false

}
