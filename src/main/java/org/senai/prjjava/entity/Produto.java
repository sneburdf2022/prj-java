package org.senai.prjjava.entity;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String descricao;
    private float valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
/*
 * Objetivo: Desenvolver a api backend para incluir, listar, atualizar e apagar
 * produtos.
 * 
 * No projeto backend - pjr-java
 * Criar a classe Produto com os atributos: id, nome, descricao, valor e seu
 * respectivos métodos de acesso e retorno (gets e sets) e as outras definições
 * necessárias.
 * Criar a classe ProdutoRepository com a definições necessárias.
 * Criar a classe ProdutoController com a definições necessárias para fazer as
 * operações GET, POST, PUT, DELETE.
 * 
 * https://<nome-da-sua-aplicação>.herokuapp.com/api/produto/
 * 
 * Inserir esse poruduto de testa + 3 outros.
 * 
 * POST: body, json
 * {
 * "nome": "PlayStation 5",
 * "descricao": "Video Game da fabricante SONY",
 * "valor": 4900.90
 * }
 * 
 * PUT: body, json
 * {
 * "id":"1"
 * "nome": "PlayStation 5",
 * "descricao": "Video Game da fabricante SONY",
 * "valor": 4400.90
 * }
 * 
 * DELETE: https://<nome-da-sua-aplicação>.herokuapp.com/api/produto/:id
 * 
 * 
 * Itens de entrega link do código fonte no github e link do heroku para listar
 * todos os itens gravados.
 * 
 */