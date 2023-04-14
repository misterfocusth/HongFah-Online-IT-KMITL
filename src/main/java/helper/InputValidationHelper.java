package helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InputValidationHelper {
    public static Boolean validateUserInput(HashMap<String, String> data) {
        ArrayList<String> emptyList = new ArrayList<>();
        data.forEach((k, v) -> {
            if (v.isEmpty()) {
                emptyList.add(k);
            }
        });
        return emptyList.isEmpty();
    }

    public static Boolean validateUserInput(Map<String, Object> data) {
        ArrayList<String> emptyList = new ArrayList<>();
        data.forEach((k, v) -> {
            try {
                if (((String) data.get(k)).isEmpty()) {
                    emptyList.add(k);
                }
            } catch (ClassCastException ex) {
                ex.printStackTrace();
            }
        });
        return emptyList.isEmpty();
    }

    public static boolean validateUserPasswordChange(String oldPwd, String newPwd, String confirmNewPwd) {
        if (oldPwd.length() == 0) {
            return false;
        } else if (newPwd.length() == 0 && confirmNewPwd.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
