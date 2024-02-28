package model

class funcionario: Pessoa() {

    var cargo: String = ""
    var salario: Double = 0.0


    override fun exibirDados(){
        println("Nome: $nome")
        println("Peso: $peso")
        println("Altura: $altura")
        println("Data Nasc: $dataDeNascimento")
        println("Idade: $idade")
        println("Cargo: $cargo")
        println("Salario: $salario")
        println("********************")
    }


}