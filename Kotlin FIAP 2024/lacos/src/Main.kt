fun main(args: Array<String>) {

     var numeros = listOf(1, 2, 3, 4, 5, 6, 7, 15, 58, 47, 12)

    for (i in 0 .. numeros.size - 1) {
       if (numeros[i] % 2 != 0){
    println("O numero ${numeros[i]} é IMPAR!")
    }
}