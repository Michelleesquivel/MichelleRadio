// Michelle Esquivel
// 08.07.2018
// Radio, programa que indica la funcionabilidad de un radio y su clase

// Clase radio
package main

import java.lang.Integer.*

class Radio {
    val emision: String
    var volumen: Int = 0
    var encendido: Boolean
    var estacionam: Int = 1000
    var estacionfm: Int = 87
    var apagar: Boolean = false

    constructor(emision: String, volumen: Int = 0, encendido: Boolean = false, estacionam: Int = 1000, estacionfm: Int = 87, apagar: Boolean = false) {
        this.emision = emision
        this.volumen = volumen
        this.encendido = encendido
        this.estacionam = estacionam
        this.estacionfm = estacionfm
    }

    fun mensaje(){
        println("Ingreso un dato erroneo")
    }
    override fun toString(): String {
        return """
            Radio:
                Esta encendido: $encendido
                Emision: $emision
                Volumen: $volumen
                Numero de estacion am: $estacionam
                Numero de estacion fm: $estacionfm
        """.trimIndent()
    }

    fun menu() {
        println("Bienvenid@ a su radio\n")
        do {
            print("La radio esta encendida")

            print("Ingrese si desea Am o Fm: \n")
            val strEmision: String? = readLine()
            if (strEmision == "Am") {
                var valsoli = println("Ingrese la estacion que desea sintonizar: ")
                estacionam = parseInt(valsoli.toString())
                if ((estacionam >= 1000) && (estacionam <= 1400)){
                    var canvolumen = println("Ingrese la cantidad de volumen deseada: \n")
                    volumen = parseInt(canvolumen.toString())
                    if((volumen >= 0) && (volumen <= 100)){
                        print("Ingrese si, si desea apagar la radio o ingrese no, si no lo desea:\n")
                        val strApagar: String? = readLine()
                        if (strApagar == "si"){
                            print("Feliz dia el programa radio ha finalizado")
                            break
                        }else{
                            print("Continue disfrutando la radio")
                        }
                    } else{
                        mensaje()
                    }

                } else if ((estacionam < 1000) && (estacionam > 1400)) {
                    mensaje()
                }

            } else if(strEmision == "Fm"){
                var valsolim = print("Ingrese la estacion que desea sintonizar: ")
                estacionam = parseInt(valsolim.toString())
                if ((estacionfm >= 87) && (estacionfm <= 107)){
                    var canvolumen = println("Ingrese la cantidad de volumen deseada: \n")
                    volumen = parseInt(canvolumen.toString())
                    if((volumen >= 0) && (volumen <= 100)){
                        print("Ingrese si, si desea apagar la radio o ingrese no, si no lo desea:\n")
                        val strApagar: String? = readLine()
                        if (strApagar == "si"){
                            print("Feliz dia el programa radio ha finalizado")
                            break
                        }else{
                            print("Continue disfrutando la radio")
                        }
                    } else{
                        mensaje()
                    }

                } else if ((estacionam < 1000) && (estacionam > 1400)) {
                    mensaje()
                }

            }
        }while ( apagar == true )

     }

    }
