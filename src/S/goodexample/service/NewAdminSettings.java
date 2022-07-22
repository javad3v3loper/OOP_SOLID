package S.goodexample.service;

import S.model.User;

public class NewAdminSettings {

    private final SecurityService securityService;

    {
        securityService = new SecurityService();
    }

    public void changePassword(User user, String newPassword) {
        if (securityService.hasAccess(user)){
            user.setPassword(newPassword);
        }
    }
}
