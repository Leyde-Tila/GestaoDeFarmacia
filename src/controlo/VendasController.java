/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlo;

import DAO.GenericController;
import Model.Produto;
import Model.Venda;

/**
 *
 * @author Leide
 */
public class VendasController {

    public boolean vender(Venda venda) {
        Produto produtoActualizado = venda.getProduto();
        int novaQuantidade = venda.getProduto().getQuantidade() - venda.getQuantidade();
        if (novaQuantidade >= 0) {
            produtoActualizado.setQuantidade(novaQuantidade);
            new GenericController().atualizarPorIdBoolean(Produto.class, produtoActualizado.getId(), produtoActualizado);
            new GenericController().addBoolean(venda);
            return true;
        } else {
            return false;
        }

    }
}
