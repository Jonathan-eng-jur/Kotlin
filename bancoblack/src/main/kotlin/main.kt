fun main() {

    //criando a variável contaJonathan
    val contaJonathan = Conta(titular = "Jonathan", 4008)
    contaJonathan.deposita(1000.0);

    //criando a variável contaVo
    val contaVo = Conta("Maria", numero = 1000)
    contaVo.deposita(100.0);

    println("Titular: ${contaJonathan.titular}");
    println("Número conta: ${contaJonathan.numero}");
    println("Saldo: R$ ${contaJonathan.saldo}");
    println("\n");
    println("Titular: ${contaVo.titular}");
    println("Número conta: ${contaVo.numero}");
    println("Saldo: R$ ${contaVo.saldo}");

    println("\n");
    println("Depositando R$ 100,00, na conta de Jonthan");
    contaJonathan.deposita(100.0);
    println("Saldo atualizado: R$ ${contaJonathan.saldo}");

    println("\n");
    println("Depositando R$ 50,00, na conta da Vovó");
    contaVo.deposita(50.0);
    println("Saldo atualizado: R$ ${contaVo.saldo}");

    println("\n");
    println("Sacando R$ 33,33, na conta de Jonthan");
    contaJonathan.sacar(33.33);

    println("\n");
    println("Transferindo R$ 133,33, na conta da Vovó. \n");
    contaJonathan.transferir(133.33, contaVo);

}

//criando a Classe Conta com o seu construtor, para tornar obrigatório os dados titular e nymero
class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        private set

    // Criando a Função Depósito
    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun sacar(valor: Double) {
        if (saldo > valor) {
            saldo -= valor

            println("Seu saque de R$ $valor está tudo ok! \nSaldo atualizado de R$ $saldo")

        } else {
            println("Saldo insuficiente.")
        }
    }

    fun transferir(valor: Double, destino: Conta) {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            println("Sua transferencia de R$ $valor para o titular: ${destino.titular}, está tudo OK!\nSeu saldo atualizado é de R$ $saldo \n")
            println("Saldo do(a) Titular: ${destino.titular}, é de R$ ${destino.saldo}")
        } else {
            println("Valor insuficiente para transferência.")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//    }


}

//Funta para testar condições
fun testeCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Sua conta é Positiva")
    } else if (saldo == 0.0) {
        println("Conta sem saldo")
    } else {
        println("Sua conta é negativa")
    }

}

//Função para testar o laço While
fun testeWhile() {
    var i = 0;
    while (i < 5) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo = i + 10.0;

        println("titular $titular");
        println("número da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
        i++;
    }
    //cria 5 contas na ordem decrescente
    //  for (i in 5 downTo 1) {
    //      println(i)
    // }

/*cria 20 contas de 2 em 2, para na conta 15
    for (i in 1..20 step 2) {
        saldo=i +0.1
        println("Número de Conta: $numeroConta+$i")
        println("Saldo: $saldo")

        if(i==15){
            break
            //continue = vai pular a conta 15
        }
    }*/
}