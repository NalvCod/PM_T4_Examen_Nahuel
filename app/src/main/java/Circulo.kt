import kotlin.math.PI

class Circulo (radio : Float, var color : String ) : Circunferencia () {
    constructor(centroX:Float, centroY:Float, puntoAleatorio: Float, puntorandomY: Float, color:String) : this(0.0f,"")

    var area:Double = 0.0

    fun area(){
        area = PI*(radio*radio)
    }


    override fun toString(): String {
        return "El circulo $color tiene un área de: $area, su centro en el eje X es: $centroX, su " +
                "centro en el eje Y es: $centroY. El punto aleatorio proporcionado es: $puntoAleatorioX" +
                "y en el eje Y $puntoAleatorioY y su radio es $radio"
    }

}