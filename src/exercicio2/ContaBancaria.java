package exercicio2;

/**
 * @author RafaelRodrigues1
 */
public class ContaBancaria {
    
    private Integer numConta;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public ContaBancaria() {
    }

    public ContaBancaria(Integer numConta, String titular, Double saldo, Double limiteSaque) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }
    
    public void saque(Double valor) throws ContaBancariaException{
        if(valor>getLimiteSaque()){
            throw new ContaBancariaException("Valor ultrapassa limite.\nLimite de saque: R$" + getLimiteSaque());
        }else if(valor>getSaldo()){
            throw new ContaBancariaException("Não há valor em saldo para valor de saque desejado.");
        }else{
            this.saldo -= valor;
        }       
    }
    
    public void depositar(Double valor){
        this.saldo = getSaldo()+valor;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    
    
}
