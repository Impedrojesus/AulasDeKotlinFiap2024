fun main(args: Array<String>) {

    var cidades = arrayOf<String>("São Paulo","Rio de Janeiro","Curitiba")

    println(cidades[1])
    println(cidades[2])

    cidades[2] = "Taboão da Serra"

    println(cidades[2])

    //cidades[3] = "Curitiba"

    var temCidade = cidades.isEmpty()
    println(temCidade)

    var valores = arrayOf<Int>()

    var temValor = valores.isEmpty()
    println(temValor)

    println(cidades.size)
    println(valores.size)


    var frutas = ArrayList<String>()
    println("Frutas: " + frutas.size)
    frutas.add("Banana")
    frutas.add("Melao")
    frutas.add("Morango")
    frutas.add("Manga")
    frutas.add("Melancia")

    println("Frutas: " + frutas.size)

    println(frutas.contains("Uva"))
    println(frutas.contains("Manga"))

    // vizualizar todos os intens da lista
    println("Minhas frutas: " + frutas)

    frutas.remove(element =  "Banana")

    println(frutas)


    
}

