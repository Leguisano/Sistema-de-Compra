public class Compra {

    private String descricao;
    private float valor;
    private float limite;




    public float getLimite(){
        return this.limite;
    } public void setLimite(float limite){
        this.limite=limite;
    }


    public String getDescricao() {
        return descricao;
    }public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }public void setValor(float valor) {
        this.valor = valor;
    }

    public void pagar(){
        this.limite-=this.valor;
    }



    public String toString() {
        return("Produto comprado: "+this.descricao+"\nValor do Produto: "+this.valor+"\nCredito Restantes: "+this.limite);
    }
}
