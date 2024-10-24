package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();

		curso1.setTitulo("curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();

		curso2.setTitulo("curso Python");
		curso2.setDescricao("Descrição curso Python");
		curso2.setCargaHoraria(8);
		
		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de Java");
		mentoria1.setDescricao("descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Camila: "+ devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de Camila: "+ devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de Camila: "+ devCamila.getConteudosConcluidos());
		devCamila.progredir();
		System.out.println("XP: "+ devCamila.calcularXp());
		
		System.out.println("#--------#---------#");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de João: "+ devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de João: "+ devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de João: "+ devJoao.getConteudosConcluidos());
		System.out.println("XP: "+ devJoao.calcularXp());
	}

}
