package lesson_4.Task_1;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class PasswordLogin {
    private String login;
    private String password;
    private String confirmPassoword;

    public PasswordLogin(String login, String password, String confirmPassoword) {
        this.login = login;
        this.password = password;
        this.confirmPassoword = confirmPassoword;
    }

    static Map<String, String> loginMap = new HashMap<String, String>();

    /**
     * 
     * @param newKey принимает вводимое значение 
     * @return возвращает 0 если в ключах словаря уже есть такое значение
     */
    private static boolean isLoginVacant(String newKey) {
        boolean isLogin = true;
        for (String key : loginMap.keySet()) {
            if (key == newKey) {
                return false;
            }
        }
        return  isLogin;
    }
    public static boolean isLogIn(String login) {
        int loginLength = login.length();
        if (isLoginVacant(login) == false)
            throw new WrongLoginValueException(login);
        else if (loginLength >= 20)
            throw new WrongLoginException(loginLength);
        else
            return true;
    }
    public static boolean isPasswordLength(String password) {
        int passwordLength = password.length();
        if (passwordLength > 20)
            throw new WrongPasswordLenghtException(passwordLength);
            return true;
    }
    public static boolean isPasswordConfirm(String password, String confirmPassoword) {
        boolean isConfirm = password.equals(confirmPassoword);
        if (!isConfirm)
            throw new WrongPasswordConfirmException();
        return true;
    }
}
