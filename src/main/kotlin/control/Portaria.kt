package control

import business.ConviteBusiness
class Portaria {

    private val conviteBusiness = ConviteBusiness()
    init {
        println("Bem-vindo(a) a portaria!")
        println(this.controle())
    }
    private fun controle(): String{
        val idade = Console.readInt("Qual sua idade? ")
        if (idade < 18){
            return "Negado. Menores de idade não são permitidos."
        }

        val tipoConvite = Console.readString("Qual é o tipo de convite?")
        if (!conviteBusiness.tipoValido(tipoConvite)) return  "Negado. Convite inválido."

        val codigoConvite = Console.readString("Qual é o código do convite?")
        if (!conviteBusiness.codigoValido(codigo, tipoConvite)) return  "Negado. Convite inválido."

        return "TODO"
    }
}


// Função portaria usada para consulta
/*
fun portaria() {
//    print("Qual sua idade? ")
//    val idade = readLine()
//    if (idade != null && idade != "") {
//        if (idade.toInt() < 18) {
//            println("Negado. Menores de idade não são permitidos.")
//            return
//        }
//    }
    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()
    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()
        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. entity.Convite inválido.")
            return
        }
        print("Qual o código do convite? ")
        var codigo = readLine()
        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()
            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. entity.Convite inválido")
            }
        }
    }
}
* */