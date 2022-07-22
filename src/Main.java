import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Aprendendo JAVA");
        curso1.setCargaHoraria(8);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Dicas de Aprendizado JAVA");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);



    }
}
