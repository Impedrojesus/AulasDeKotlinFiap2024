fun main(args: Array<String>) {

    var numeros = listOf(1, 2, 3, 4, 5)

    var pares = numeros.filter {
        it % 2 == 0
    }

    println(pares)


    var frutas = listOf("uva", "manga", "abacaxi", "morango", "laranja")
    println(frutas)

    var frutasM = frutas.filter {
        it.startsWith("m")
    }

    println(frutasM)

    println("******** utilizando o map *****")


    var frutasMaiusculas = frutas.map {
        it.uppercase()
    }

    println(frutasMaiusculas)

    var soma = numeros.reduce { atual, prox ->
        atual + prox
    }

    println(soma)

}
