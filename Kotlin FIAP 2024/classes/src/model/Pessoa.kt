package model

import java.time.LocalDate
import java.time.Period

open class Pessoa {

    // Propriedades/campo/atributo do objeto
    var nome: String = ""
    var dataDeNascimento: LocalDate = LocalDate.of(2002, 6, 24)
    var peso: Int = 0
    var altura: Double = 0.0


    // propriedade computada
    val idade: Int
        get() {
           return Period.between(dataDeNascimento, LocalDate.now()).years
        }

    // métodos / comportamnetos
   open fun exibirDados(){
        println("Nome: $nome")
        println("Peso: $peso")
        println("Altura: $altura")
        println("Data Nasc: $dataDeNascimento")
        println("Idade: $idade")
        println("********************")
    }

//    fun calcularIdade(): Int{
//        var idade = Period.between(dataDeNascimento, LocalDate.now()).years
//        return  idade
//    }


}