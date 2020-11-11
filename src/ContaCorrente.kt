class ContaCorrente(var limiteChequeEspecial:Double,saldo:Double,cliente: Cliente):Conta(saldo,cliente) {

    override fun sacarDinheiro(valor: Double): Double {


            saldo -= valor
        if (saldo < 0) {
            limiteChequeEspecial += saldo

            if (limiteChequeEspecial < 0)
                println("Limite de cheque especial foi execedido, não é possível realizar o saque")
            else {
                println("Limite cheque especial:" + limiteChequeEspecial)
                return limiteChequeEspecial
            }}
            return 0.0
        }

    fun depositarCheque(cheque: Cheque):Double{

        saldo+=cheque.valor
        return saldo
    }

    }

