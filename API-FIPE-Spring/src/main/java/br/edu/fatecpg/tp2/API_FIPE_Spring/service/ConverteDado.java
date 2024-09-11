package br.edu.fatecpg.tp2.API_FIPE_Spring.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDado implements IConverteDado{
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDado(String json, Class<T> classe) throws JsonProcessingException {
        return mapper.readValue(json,classe);
    }
}