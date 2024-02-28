fun main(args: Array<String>) {

 var filmes = HashSet<String>()
 println(filmes.size)

 filmes.add("Homem Aranha")
 filmes.add("Senhor dos Aneis")
 filmes.add("Super Mario World")

 println(filmes.size)
 println(filmes)

 filmes.add("Homem Aranha")

 println(filmes)

 filmes.add("Homem Aranha 2")

 println(filmes)

 println(filmes.contains("Super Mario World 2"))

 filmes.remove("Homem Aranha 2")

 var precos = setOf(4.9, 78.7, 54.9)
 println(precos)

 var produtos = HashMap<String, Double>()
 produtos.put("Mouse", 149.9)
 produtos.put("Teclado", 149.9)
 produtos.put("Monitor", 149.9)

 println(produtos)
 println(produtos.size)
 produtos.remove("Mouse")

 println(produtos)

 println(produtos.get("Teclado"))

}

