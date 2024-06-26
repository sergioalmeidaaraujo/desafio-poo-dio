

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
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso Python");
        curso3.setDescricao("descrição curso python");
        curso3.setCargaHoraria(12);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoriaPython = new Mentoria();
        mentoriaPython.setTitulo("mentoria de python");
        mentoriaPython.setDescricao("descrição mentoria python");
        mentoriaPython.setData(LocalDate.now());

        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcampPython = new Bootcamp();
        bootcampPython.setNome("Bootcamp Python Developer");
        bootcampPython.setDescricao("Descrição Bootcamp Python Developer");
        bootcampPython.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoriaPython);
                
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        
        System.out.println("-------");

        Dev devSergio = new Dev();
        devSergio.setNome("Sergio");
        devSergio.inscreverBootcamp(bootcampPython);
        System.out.println("Conteúdos Inscritos Sergio:" + devSergio.getConteudosInscritos());
        devSergio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sergio:" + devSergio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Sergio:" + devSergio.getConteudosConcluidos());
        System.out.println("XP:" + devSergio.calcularTotalXp());

    }

}
