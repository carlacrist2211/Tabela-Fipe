package br.com.alura.Tabela.Fipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)


public record Modelos(List<Dados> modelos) {


}