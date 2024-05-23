package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> CarrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.CarrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        CarrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : CarrinhoDeCompras) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        CarrinhoDeCompras.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item item : CarrinhoDeCompras){
            total += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor total dos itens no carrinho: " + total);
        return  total;
    }

    public void exibirItens() {
        System.out.println(CarrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("camisa", 12,5);
        carrinhoDeCompras.adicionarItem("sapatos", 10,10);
        carrinhoDeCompras.adicionarItem("sapatos", 10,10);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.removerItem("camisa");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();


    }

}
