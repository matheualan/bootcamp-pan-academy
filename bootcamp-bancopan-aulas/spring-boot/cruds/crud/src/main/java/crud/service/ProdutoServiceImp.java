package crud.service;

import crud.service.model.Produto;
import crud.service.repository.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProdutoServiceImp implements ProdutoService {

    private static Map<String, Produto> produtoRepository = new HashMap<>();
    static {
//        mocka produto chocolate
        Produto chocolate = new Produto();
        chocolate.setId("1");
        chocolate.setNome("Chocolate");
        produtoRepository.put(chocolate.getId(), chocolate);
//        mocka produto trufa
        Produto trufa = new Produto();
        trufa.setId("2");
        trufa.setNome("Trufa");
        produtoRepository.put(trufa.getId(), trufa);
    }

    @Override
    public void createProduto(Produto produto) {
        produtoRepository.put(produto.getId(), produto);
    }

    @Override
    public void deleteProduto(String id) {
        produtoRepository.remove(id);
    }

    @Override
    public Collection<Produto> getProdutos() {
        return produtoRepository.values();
    }
}
