package org.senai.prjjava.controller;

import javax.websocket.server.PathParam;

import org.senai.prjjava.entity.Produto;
import org.senai.prjjava.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/produto")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    ProdutoRepository pRepository;

    @PostMapping("/")
    public @ResponseBody Integer addProduto(@RequestBody Produto objP) {

        pRepository.save(objP);
        return objP.getId();
    }

    @GetMapping("/")
    public @ResponseBody Iterable<Produto> buscarUsuarios() {
        return pRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Iterable<Produto> buscarUsuario(@PathVariable Integer id) {
        return pRepository.findAll();
    }

}
