fun main(args: Array<String>) {

    var a = 10
    var b = 20

    somar(a, b)
    somar(5,8)
    somar(98, 69)


    saudar()
    saudar()
    saudar()
    saudar()

    var x = subtrair(5,10)
    println(x)
}
fun saudar(){
    println("Olá galera da FIAP!")
}

fun somar(valor1: Int, valor2: Int){
    println("A soma é: ${valor1 + valor2 * 10}")
}

fun subtrair(valor1: Int, valor2: Int):Int {
    return valor1 - valor2
}