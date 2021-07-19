package br.com.itb.tcclacake2021.data;

import br.com.itb.tcclacake2021.data.dao.LoggedInUserDao;
import br.com.itb.tcclacake2021.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser login = LoggedInUserDao.verificarUsuario(username, password);

            if (login == null){
                return  new Result.Error(new IOException("Usuário não encontrado ou" +"Senha errada!"));
            }

            /*LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");
            */
            return new Result.Success<>(login);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}