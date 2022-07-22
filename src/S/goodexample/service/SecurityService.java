package S.goodexample.service;

import S.model.Role;
import S.model.User;

public class SecurityService {

    public boolean hasAccess(User user) {
        return user.getRole() == Role.ADMIN;
    }
}
