package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
    private Object conteudosConcluidos;
    private ArrayList<Conteudo> conteudosInscritos;

    public Dev(Object conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public Dev() {

    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }



    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else System.err.println("Você não está matriculado em nenhum conteudo!");
    }



    public double calcularTotalXp() {
        return this.conteudoConcluidos.stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
    }
}
