package com.example.pagoa.Api.Deserializer;

import com.example.pagoa.model.Usuario;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class UsuarioDeserializer implements JsonDeserializer {
    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray usuario = json.getAsJsonObject().get("usuarios").getAsJsonArray();
        Gson gson = new Gson();
        Usuario obj = gson.fromJson(usuario,Usuario.class);
        return obj;
    }
}
