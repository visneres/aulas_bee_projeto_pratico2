package com.ambev.pratico2.MongoDB.service;

import java.util.List;

import com.ambev.pratico2.MongoDB.model.Produto;
import com.ambev.pratico2.MongoDB.repository.ProdutoRepository;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProdutoService {
    @Autowired
    private final ProdutoRepository produtoRepository;


    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }
    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto create(Produto student) {
        return this.produtoRepository.save(student);
    }

    public List<Produto> getAll() {
        return this.produtoRepository.findAll();
    }

    public Produto update(String id, Produto produto) {
        Produto updated = this.produtoRepository.findById(id).get();
        updated.setNome(produto.getNome());
        updated.setValor(produto.getValor());

        return this.produtoRepository.save(updated);
    }

    public Produto delete(String id) {
        Produto produto = this.produtoRepository.findById(id).get();
        if (produto != null)
            this.produtoRepository.deleteById(id);
        return produto;
    }

}
