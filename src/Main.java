import java.time.LocalDate;
import java.util.Set;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso(80, "Teste Java", "Java Em Testes");
		Curso curso2 = new Curso(60, "Teste Python", "Python Em Testes");
		Curso curso3 = new Curso(30, "Teste React", "React Em Testes");
		
		Mentoria mentoria1 = new Mentoria(LocalDate.now(), "Mentorando Java", "Como é bom mentorar"); 
		Mentoria mentoria2 = new Mentoria(LocalDate.now(), "Mentorando Python", "Como é bom mentorar"); 

		BootCamp bootcampJava= new BootCamp("Java do Zero ao Pro", "Do básico ao avançado");
		bootcampJava.getConteudos().add(curso1);
		bootcampJava.getConteudos().add(curso3);
		bootcampJava.getConteudos().add(mentoria2);
		
		BootCamp bootcampPython= new BootCamp("Python do Zero ao Pro", "Do básico ao avançado");
		bootcampJava.getConteudos().add(curso2);
		bootcampJava.getConteudos().add(curso3);
		bootcampJava.getConteudos().add(mentoria2);
		
		Dev devJoao = new Dev("João Lubaw");
		devJoao.inscreverBootCamp(bootcampJava);
		
		Dev devPedro = new Dev("Pedro");
		devPedro.inscreverBootCamp(bootcampPython);
		
		devJoao.getInfos();

		System.out.println("---");
		devJoao.progredir();
		
		devJoao.getInfos();

	}
}
