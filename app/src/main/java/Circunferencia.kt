import kotlin.math.PI

open class Circunferencia (var radio: Float = 0.0f) {
    var centroX : Float = 0.0f
    var centroY : Float = 0.0f
    var puntoAleatorioX : Float = 0.0f
    var puntoAleatorioY : Float = 0.0f
    var longi : Double = 0.0

    constructor(radio: Float, centroX : Float = 0.0f, centroY : Float = 0.0f, puntoAleatorioX : Float = 0.0f, puntoAleatorioY: Float = 0.0f) : this()

    fun longitud(){
        longi = 2 * PI * radio
    }

    override fun toString(): String {
        return "El radio de la circunferencia es: $radio, su centro en el eje X es: $centroX, su " +
                "centro en el eje Y es: $centroY. El punto aleatorio proporcionado es: $puntoAleatorioX" +
                "y en el eje Y $puntoAleatorioY"
    }
}