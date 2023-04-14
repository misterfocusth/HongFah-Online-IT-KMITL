package handlers.document;

import interfaces.UniqueAble;

import java.util.UUID;

public class DocumentHandler implements UniqueAble {
    @Override
    public String randomID() {
        String result = "DOC-";
        String allRandomizedChar = UUID.randomUUID().toString().replace("-", "");
        return result + allRandomizedChar.substring(0,7);
    }


}
