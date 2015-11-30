package LojaVirtual.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by andrei.andrade on 30/11/2015.
 */
public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<Item>();
    }
    public void adiciona(Item item) {
        this.itens.add(item);
    }
    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public double maiorValor() {
        if(itens.size() == 0) return 0;
        double maior = itens.get(0).getValorTotal();
        for(Item item : itens) {
            if(maior < item.getValorTotal()) {
                maior = item.getValorTotal();
            }
        }
        return maior;
    }
}
