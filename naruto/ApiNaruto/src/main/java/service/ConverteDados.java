package service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class ConverteDados implements IConverteDados {
	private ObjectMapper mapper = new ObjectMapper();/*é usada principalmente para serializar objetos Java em formato JSON 
	(um processo conhecido como "marshalling" ou "serialization") e para desserializar objetos JSON de volta para objetos Java 
	correspondentes (um processo conhecido como "unmarshalling" ou "deserialization").*/

	@Override
	public <T> T obterDados(String json, Class<T> classe) {
		try {
			return mapper.readValue(json, classe);
		}catch(JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public <T> List<T> obterLista(String json, Class<T> classe) {
		CollectionType lista = mapper.getTypeFactory().constructCollectionType(List.class, classe);
		
		try {
			return mapper.readValue(json, lista);//desserializa o json para uma classe java manipulavel.
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

}