package service;

import java.util.List;

public interface IConverteDados {
	<T> T obterDados(String json, Class<T> classe);//recebe um Json e converte em uma classe manipulavem
	
	
	<T> List<T> obterLista(String json, Class<T> classe);//cria uma lista
}
