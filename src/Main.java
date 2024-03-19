import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Object[] options = {"ДА","НЕТ"};
        int choice = JOptionPane.showOptionDialog(null,
                "Предлагаю вам зарегистрироваться в нащей программе?","Регистрация",JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,null,options,options[1]);

        if (choice==JOptionPane.YES_OPTION) {
            String login = "";
            while (true) {
                login = JOptionPane.showInputDialog(null,
                        "Введите логин (Без пробелов,количество символов должно быть больше 5)",
                        "Вводим логин", JOptionPane.PLAIN_MESSAGE);
                if (login != null && login.length() > 5 && !login.contains(" ")) {

                    while (true) {
                        JPasswordField passwordField = new JPasswordField();
                        JOptionPane.showOptionDialog(null, passwordField,
                                "Введите пароль (Пароль должен быть больше 8 символов",
                                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

                        char[] password = passwordField.getPassword();
                        String enteredPassword = new String(password);



                        if (enteredPassword.length() > 8 && !enteredPassword.contains(" ")
                                && enteredPassword.matches(".*\\d.*")
                                && enteredPassword.matches(".*[a-zA-Zа-яА-Я].*"))
                        {
                            while (true) {
                                JPasswordField passwordField2 = new JPasswordField();
                                JOptionPane.showOptionDialog(null, passwordField2,
                                        "Повторите пароль",
                                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                                char[] password2 = passwordField.getPassword();
                                String enteredPassword2 = new String(password2);




                                if (enteredPassword2.equals(enteredPassword)){
                                    JOptionPane.showMessageDialog(null,"Красавчик ты зарегался!!!!");
                                    break;

                                }
                                JOptionPane.showMessageDialog(null, "Неверно введен пароль,повтори , плиз", "Шляпа",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                            break;

                        }
                        JOptionPane.showMessageDialog(null, "Неверно введен пароль,повтори , плиз", "Шляпа",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                }
                JOptionPane.showMessageDialog(null, "Неверно введен логин,повтори , плиз", "Шляпа",
                        JOptionPane.ERROR_MESSAGE);
            }


        }else if (choice==JOptionPane.NO_OPTION){
            System.exit(0);
        }

    }
}