package com.advanceauto.aapinventorycommonmessagequeue.general.messages;

import com.advanceauto.aapinventorycommonmessagequeue.general.enumerations.MessageType;
import com.advanceauto.aapinventorycommonmessagequeue.general.interfaces.Message;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import java.util.HashMap;

@Data
public class CycleCountMessage implements Message {
    private MessageType messageType;
    private HashMap<String, String> params;
    private JsonNode content;
}
