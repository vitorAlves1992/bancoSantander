open class Conta (var saldo: Double, cliente: Cliente) {

    fun depositarDinheiro(valor:Double):Double{

        saldo+=valor

        return saldo
    }

    open fun sacarDinheiro(valor: Double):Double{

        if(valor<=saldo) {
            saldo -= valor
            return saldo
        }
        else
            println("Saldo insuficiente")

        return  0.0
    }

    fun consultarSaldo():Double{

        return saldo
    }
}