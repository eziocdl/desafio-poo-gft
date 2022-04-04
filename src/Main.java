import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());



      /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEzio = new Dev();
        devEzio.setNome("Ezio");
        devEzio.setNome("bootcamp");
        System.out.println(" Conteúdos Inscritos Ezio" + devEzio.getConteudoInscritos());

        devEzio.progredir();

        System.out.println(" Conteúdos Inscritos Ezio" + devEzio.getConteudoInscritos());
        System.out.println(" Conteúdos Inscritos Ezio" + devEzio.getConteudoConcluidos());
        System.out.println("XP: " + devEzio.calcularTotalXp());

        System.out.println("-");

        Dev Lucas = new Dev();
        Lucas.setNome(" Lucas");
        Lucas.setNome("bootcamp");
        System.out.println("Conteúdos Inscritos Lucas" + Lucas.getConteudoInscritos());
        Lucas.progredir();

        System.out.println("-");

        System.out.println("Conteúdos Inscritos Lucas" + Lucas.getConteudoInscritos());
        System.out.println("Conteúdos Inscritos Lucas" + Lucas.getConteudoConcluidos());

        System.out.println("XP: " + Lucas.calcularTotalXp());









    }
}
