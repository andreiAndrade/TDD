package LojaVirtual.code;

/**
 * Created by andrei.andrade on 30/11/2015.
 */
public class Item {
    private String descricao;
    private int quantidade;
    private double valorUnitario;

    public Item(String descricao, int quantidade, double valorUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
    public double getValorTotal() {
        return this.valorUnitario * this.quantidade;
    }
// getters para os atributos
}
