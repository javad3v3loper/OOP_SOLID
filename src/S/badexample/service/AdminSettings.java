package S.badexample.service;

import S.model.Role;
import S.model.User;

public class AdminSettings {

    public void changePassword(User user, String newPassword) {
        if (hasAccess(user)){
            user.setPassword(newPassword);
        }
    }

    public boolean hasAccess(User user) {
        return user.getRole() == Role.ADMIN;
    }
}
