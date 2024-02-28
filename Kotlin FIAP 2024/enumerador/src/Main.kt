fun main(args: Array<String>) {

    val tipoDaConta = TipoConta.CORRENTE
    val tipoDaConta2 = TipoConta.POUPANCA


    println(tipoDaConta.nomeConta)
    println(tipoDaConta2.nomeConta)
    println(tipoDaConta2.name)
}

enum class TipoConta(var nomeConta: String){
    CORRENTE("Corrente"),
    POUPANCA("Poupança"),
    SALARIO("Salário")
}