package Aula0208;

import java.time.Duration;
import java.time.Instant;

public class Datatimes {
	
	
	public static void main(String[] args) { // ou essa opção throws InterruptedException
		Instant inicio = Instant.now();
		
		
		
// essa opção ou		
		// thread.sleep(milesegundos) control + 1 		
		try {
			Thread.sleep(1000); // fazer o processamento esperar
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(inicio, fim);
		
		System.out.println("Duracao em nanos segundos" + duracao.toNanos());
		System.out.println("Duracao em minutos" + duracao.toMinutes());
		System.out.println("Duracao em horas" + duracao.toHours());
		System.out.println("Duracao em milisegundos" + duracao.toMillis());
		System.out.println("Duracao em dias" + duracao.toDays());

		
	}

}
