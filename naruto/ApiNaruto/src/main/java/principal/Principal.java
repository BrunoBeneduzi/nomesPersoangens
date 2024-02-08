package principal;

import java.util.Scanner;

import modelos.Personagem;
import service.ConsumoApi;
import service.ConverteDados;

public class Principal {
	private final String URL= "https://dattebayo-api.onrender.com/characters"; 
	private ConsumoApi api = new ConsumoApi();
	private ConverteDados converte = new ConverteDados();
	private Scanner sc = new Scanner(System.in);
	
	public void iniciar() {
		var json = api.obterDados(URL);
		var x = converte.obterDados(json, Personagem.class);
		
		
		System.out.println("Selecione um dos nomes abaixo para ter acesso a todas as informações");
		for(int i = 1; i < x.characters().size(); i++) {
			System.out.println(i+" - "+x.characters().get(i).name());
		}
		System.out.print("-> ");
		int escolha = sc.nextInt();
		
		System.out.println("Seu nome é "+x.characters().get(escolha).name()
				+"| Pai: "+x.characters().get(escolha).family().father()
				+"| Mãe: "+x.characters().get(escolha).family().mother()
				+"| Filho: "+x.characters().get(escolha).family().son()
				+"| Filha: "+x.characters().get(escolha).family().daughter()
				+"| Esposa: "+x.characters().get(escolha).family().wife());
	}
}