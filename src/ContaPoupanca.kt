class ContaPoupanca(var taxaDeJuros:Double,saldo:Double,cliente: Cliente):Conta(saldo,cliente) {

    fun recolherJuros():Double{

        return saldo*taxaDeJuros
    }
}