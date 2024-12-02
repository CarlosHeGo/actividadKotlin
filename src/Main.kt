class Contacto (val nombre: String ="", val telefono: Int = 0){
}

fun main() {

    var contacto1 = Contacto("Pedro",987654321)
    var contacto2 = Contacto("Paula",912345678)
    var contacto3 = Contacto("Sonia",987123456)
    var listadoContactos: MutableList<Contacto> = mutableListOf(contacto1,contacto2)
    var opcion: Int = 0

    while (opcion != 8){
        menuPrincipal()

        opcion = readln().toInt()

        when (opcion){
            1 -> { opcion1(listadoContactos) }
            2 -> { opcion2(listadoContactos) }
            3 -> { opcion3(listadoContactos) }
            4 -> { opcion4(listadoContactos) }
            5 -> { opcion5(listadoContactos) }
            6 -> { opcion6(listadoContactos) }
            7 -> { opcion7(listadoContactos) }
            8 -> {}
            else -> menuPrincipal()

        }
    }
}
fun menuPrincipal() {
    println("1. Añadir contacto")
    println("2. Listar contacto")
    println("3. Buscar contacto")
    println("4. Existe contacto")
    println("5. Eliminar contacto")
    println("6. Contactos disponibles")
    println("7. Agenda llena")
    println("8. Salir")
    println("Escribe una de las opciones")
}

fun opcion1 (listadoContactos: MutableList<Contacto>){
    var encontrado: Boolean = false
    println("Escribe un nombre")
    var nombre: String = readln()

    println("Escribe un telefono")
    var tlf: Int = readln().toInt()

    val nuevoContacto= Contacto(nombre,tlf)

    for (contactos in listadoContactos){
        if (contactos.nombre == nuevoContacto.nombre){
            println("El contacto con ese nombre ya existe")
            encontrado = true
        }
    }
    if (!encontrado){
        listadoContactos.add(nuevoContacto)
        println("Se ha añadido el contacto")
    }
}

fun opcion2 (listadoContactos: MutableList<Contacto>){
    if (listadoContactos.none()){
        println("No hay contactos que mostrar")
    } else {
        for (contacto in listadoContactos){
            println("Nombre = ${contacto.nombre}, Teléfono = ${contacto.telefono}")
        }
    }

}

fun opcion3 (listadoContactos: MutableList<Contacto>){
    var encontrado: Boolean = false

    println("Escribe un nombre")
    var nombre: String = readln()

    for (contacto in listadoContactos){
        if (contacto.nombre.equals(nombre)){
            println("Su telefono es ${contacto.telefono}")
            encontrado = true
        }

    }

    if (!encontrado){
        println("No se ha encontrado el contacto")
    }


}

fun opcion4 (listadoContactos: MutableList<Contacto>){
    var encontrado: Boolean = false
    println("Escribe un nombre")
    var nombre: String = readln()
    if (listadoContactos.isEmpty()){
        println("No existe contacto. Lista vacía")
    }
    for (contacto in listadoContactos){
        if (contacto.nombre == nombre){
            println("Existe contacto")
            encontrado = true
        }
    }
    if (!encontrado){
        println("No existe contacto")
    }
}

fun opcion5 (listadoContactos: MutableList<Contacto>){
    var encontrado: Boolean = false
    println("Escribe un nombre")
    var nombre: String = readln()
    for (contacto in listadoContactos){
        if (contacto.nombre == nombre){
            listadoContactos.remove(contacto)
            encontrado = true
            println("Se ha eliminado el contacto")
        }
    }

    if (!encontrado){
        println("No se ha eliminado el contacto")
    }
}

fun opcion6 (listadoContactos: MutableList<Contacto>){
    var numContactos = listadoContactos.size
    for (contactos in listadoContactos){
        numContactos--
    }
    if (numContactos>=0){
        println("Hay $numContactos contacto/s libre/s")
    }

}

fun opcion7 (listadoContactos: MutableList<Contacto>){
    if (listadoContactos.size==3){
        println("La agenda está llena")
    } else
        println("Aún se pueden meter contactos")
}