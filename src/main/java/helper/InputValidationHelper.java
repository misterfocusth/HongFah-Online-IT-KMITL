package helper;

import java.util.ArrayList;
import java.util.HashMap;

public class InputValidationHelper {
    public static Boolean validateUserInput(HashMap<String, String> studentData) {
        ArrayList<String> emptyList = new ArrayList<>();

        studentData.forEach((k, v) -> {
            if (v.isEmpty()) {
                emptyList.add(k);
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
