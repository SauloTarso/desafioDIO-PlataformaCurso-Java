package dio.poo;

import dio.poo.entities.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        System.out.print("Curso: ");
        String qualCurso = scan.next();
        System.out.print("Descrição do Curso: ");
        String descricaoCurso = scan.next();
        System.out.print("Carga horária do Curso: ");
        double cargaHoraria = scan.nextDouble();

        Curso curso = new Curso();
        curso.setTitulo(qualCurso);
        curso.setDescricao(descricaoCurso);
        curso.setCargaHoraria(cargaHoraria);

        Conteudo conteudo = new Curso();
        System.out.println("Qual é a Mentoria do curso?");
        String qualMentoria = scan.next();
        System.out.println("Descrição da mentoria:");
        String qualDescricao = scan.next();
        System.out.println();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(qualMentoria);
        mentoria.setDescricao(qualDescricao);
        mentoria.setDate(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        System.out.println("Qual o Bootcamp procurar?");
        String nomeBootcamp = scan.next();
        System.out.println("Descrição do Bootcamp:");
        String descricaoBootcamp = scan.next();

        bootcamp.setNome(nomeBootcamp);
        bootcamp.setDescricao(descricaoBootcamp);
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev desenvolvedor = new Dev();
        System.out.println("Nome do Dev: ");
        String nomeDev = scan.next();

        desenvolvedor.setNome(nomeDev);
        desenvolvedor.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos DEV" + desenvolvedor.getConteudosInscritos());
        desenvolvedor.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos DEV" + desenvolvedor.getConteudosInscritos());
        System.out.println("Conteudos concluidos DEV" + desenvolvedor.getConteudosConcluidos());
        System.out.println("XP: " + desenvolvedor.calcularTotalXp());

        System.out.println("-------------");
    }
}
