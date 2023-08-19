package kap.newbie.functional_programming.lection.test6;

/**
 * @author Alexandr Korovkin
 */
public class User {
    private final String login;
    private final String password;

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return getCryptoPass();
    }

    private String getCryptoPass(){
        StringBuilder cryptoPass = new StringBuilder();
        for (char c : password.toCharArray()){
            cryptoPass.append(c >>> 3).append(c << 5).append(Character.hashCode(c));
        }
        return cryptoPass.toString();
    }

    public String toString(){
        return String.format("login: %s\nencryption password:%s", login, getPassword());
    }
}
