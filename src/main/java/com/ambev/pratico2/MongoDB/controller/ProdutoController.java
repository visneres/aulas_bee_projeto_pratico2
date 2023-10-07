package com.ambev.pratico2.MongoDB.controller;

import java.util.List;

import com.ambev.pratico2.MongoDB.model.Produto;
import com.ambev.pratico2.MongoDB.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> getAll() {
        return this.produtoService.getAll();
    }

    @PostMapping
    public Produto create(@RequestBody Produto student) {
        return this.produtoService.create(student);
    }

    @PutMapping(value = "/{id}")
    public Produto update(@PathVariable("id") String id, @RequestBody Produto student) {
        return this.produtoService.update(id, student);
    }

    @DeleteMapping(value = "/{id}")
    public Produto delete(@PathVariable("id") String id) {
        return this.produtoService.delete(id);
    }

}
