package lesson_4.Task_1;

import java.util.HashMap;
import java.util.Map;

public class PasswordLogin {
    private String login;
    private String password;
    private String confirmPassoword;

    static Map<String, String> loginMap = new HashMap<String, String>();

    /**
     * 
     * @param newKey принимает вводимое значение 
     * @return возвращает 0 если в ключах словаря уже есть такое значение
     */
    private static Boolean isLoginVacant(String newKey) {
        Boolean isLogin = true;
        for (String key : loginMap.keySet()) {
            if (key == newKey) {
                return false;
            }
        }
        return  isLogin;
    }
    private static Boolean isLogIn(String login, String password, String confirmPassoword) {
        Boolean isLogin = true;
        if (isLoginVacant(login) == false) {
            isLogin = false;
        }
        return  isLogin;
    }
}
