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
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);

	}

}
