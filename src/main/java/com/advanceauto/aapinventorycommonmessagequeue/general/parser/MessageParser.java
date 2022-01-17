package com.advanceauto.aapinventorycommonmessagequeue.general.parser;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MessageParser {



    public static <T> T parseMessage(String message, Class<T> clazz) throws JacksonException {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(message, clazz);
    }
}
