package org.senai.prjjava.controller;

import java.util.Optional;

import org.senai.prjjava.entity.Produto;
import org.senai.prjjava.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping(path = "/api/produto")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    ProdutoRepository pRepository;

    @PostMapping("/")
    public @ResponseBody Integer addProduto(@RequestBody Produto produto) {

        pRepository.save(produto);
        return produto.getId();
    }

    @GetMapping("/")
    public @ResponseBody Iterable<Produto> buscarProdutos() {
        return pRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Produto> buscarUsuario(@PathVariable Integer id) {
        return pRepository.findById(id);
    }

    @PutMapping("/")
    public @ResponseBody Produto atualizar(@RequestBody Produto produto) {
        pRepository.save(produto);
        return produto;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integer> apagar(@PathVariable Integer id) {

        pRepository.deleteById(id);
        /*
         * if (!isRemoved) {
         * return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         * }
         */
        return new ResponseEntity<>(id, HttpStatus.OK);

    }

}
