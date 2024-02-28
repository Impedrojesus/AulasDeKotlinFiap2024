import model.Pessoa
import model.funcionario
import java.time.LocalDate

fun main(args: Array<String>) {

    var pessoa = Pessoa()
    pessoa.nome = "Maria"
    pessoa.peso = 80

    var funcionario = funcionario()
    funcionario.nome = "Pedro"
    funcionario.peso = 65
    funcionario.altura = 1.80
    funcionario.cargo = "Desenvolvedor Android"
    funcionario.salario = 150000.0

    funcionario.exibirDados()
    pessoa.exibirDados()



}
