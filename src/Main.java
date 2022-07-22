import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Aprendendo JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO");
        curso2.setDescricao("Aprendendo Sobre Programação Orientada a Objeto");
        curso2.setCargaHoraria(5);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Dicas de Aprendizado JAVA");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Você aprenderá os primeiros passos para se tornar um Developer JAVA");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndrea = new Dev();
        devAndrea.setNome("Andrea Persan");
        devAndrea.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andrea: " + devAndrea.getConteudosInscritos());
        devAndrea.progredir();
        devAndrea.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Andrea: " + devAndrea.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Andrea: " + devAndrea.getConteudosConcluidos());
        System.out.println("XP: " + devAndrea.calcularTotalXp());

        System.out.println("------");

        Dev devCarlos = new Dev ();
        devCarlos.setNome("Carlos Santos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carlos: " + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());



    }
}
