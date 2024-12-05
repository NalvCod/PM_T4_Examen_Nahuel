fun main(){
    var listaJuegos = mutableListOf(
        Videojuego("Animal Crossing New Horizons", "Nintendo Switch", 2020),
        Videojuego("Hollow Knight", "Nintendo Switch", 2017),
        Videojuego("A Short Hike", "Nintendo Switch", 2020),
        Videojuego("Yoquese", "GameCube", 2000)
    )

    var listaEquipos = mutableListOf(
        EquipoFutbol("Furbo1", "España"),
        EquipoFutbol("Furbo2", "Rumanía"),
        EquipoFutbol("Furbo3", "Chile"),
        EquipoFutbol("Furbo4", "Italia"),
        EquipoFutbol("Furbo5", "Italia"),
        EquipoFutbol("Furbo6", "Colombia"),
        EquipoFutbol("Furbo7", "Alemania"),
        EquipoFutbol("Furbo8", "Francia"),
        EquipoFutbol("Furbo9", "Francia"),
        EquipoFutbol("Furbo10", "Francia"),
        EquipoFutbol("Furbo11", "Argentina"),
        EquipoFutbol("Furbo12", "Reino Unido"),
        EquipoFutbol("Furbo13", "Irlanda"),
        EquipoFutbol("Furbo14", "Irlanda"),
        EquipoFutbol("Furbo15", "Andorra"),
        EquipoFutbol("Furbo16", "Portugal"),
    )

    println(filtraJuegos(listaJuegos, 2020))
    println(plataformas(listaJuegos))
    championsLeague(listaEquipos)



}

fun championsLeague(equipos : MutableList<EquipoFutbol>){
    equipos.shuffle()
    var contador = 0
    for (equipo in equipos){
        if (contador %2 == 0){
            print("El "+equipo.toString())
        }else{
            print(" competirá contra el "+equipo.toString()+"\n")
        }
        contador++

    }

}

fun filtraJuegos (listaJuegos : MutableList<Videojuego>, anho : Int) : MutableList<Videojuego>{
    var listaJuegosFecha = mutableListOf<Videojuego>()

    for (juego in listaJuegos){
        if (juego.salida == anho){
            listaJuegosFecha.add(juego)
        }
    }
    return listaJuegosFecha
}

fun plataformas(listaJuegos : MutableList<Videojuego>) : MutableList<String>{
    var listaPlataformas = mutableListOf<String>()

    for (juego in listaJuegos){
        if (!(listaPlataformas.toString().contains(juego.plataforma))){
            listaPlataformas.add(juego.plataforma)
        }
    }
    return listaPlataformas
}

