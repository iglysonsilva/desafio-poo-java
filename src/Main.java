import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso kotlin");
        curso2.setDescricao("descrição curso kotlin");
        curso2.setCargaHoraria(22);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

 //        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devIglyson  = new Dev();
        devIglyson.setNome("Iglyson");
        devIglyson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Iglyson" + devIglyson.getConteudosInscritos());
        devIglyson.progredir();
        devIglyson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Iglyson" + devIglyson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Iglyson" + devIglyson.getConteudosConcluidos());
        System.out.println("XP:" + devIglyson.calcularTotalXp());

        System.out.println("---------");

        Dev devEmmanuel = new Dev();
        devEmmanuel.setNome("Emmanuel");
        devEmmanuel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Emmanuel" + devEmmanuel.getConteudosInscritos());
        devEmmanuel.progredir();
        devEmmanuel.progredir();
        devEmmanuel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Emmanuel" + devEmmanuel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Emmanuel" + devEmmanuel.getConteudosConcluidos());
        System.out.println("XP:" + devEmmanuel.calcularTotalXp());

    }
}