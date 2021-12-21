package crud.service.repository;

import crud.service.model.Produto;

import java.util.Collection;

public interface ProdutoService {

    public void createProduto(Produto produto);
    public void deleteProduto(String id);
    public Collection<Produto> getProdutos();
}
