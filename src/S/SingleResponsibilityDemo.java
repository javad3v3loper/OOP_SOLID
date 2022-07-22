package S;

import S.model.User;
import S.badexample.service.AdminSettings;
import S.goodexample.service.NewAdminSettings;
import S.goodexample.service.SecurityService;

/**
 *  Single responsibility means that class should have only one responsibility/purpose
 *  in a program.
 *  Otherwise it could break already existing logic in other places of the program...
 */
public class SingleResponsibilityDemo {
    public static void main(String[] args) {

        //======= WRONG WAY ========
        AdminSettings adminSettings = new AdminSettings();
        User user = new User();

        //Responsibility #1 is to update user email
        adminSettings.changePassword(user, "password");

        //Responsibility #2 is to check user have access to do some action.
        if (adminSettings.hasAccess(user)) {
            user.sendMoney(new User(), 9999);
        }
        // In case hasAccess method removed or changed in AdminSettigns class,
        // other classes that use this method will be affected.
        // Solution -> split functionality, and move hasAccess to another class
        // e.g. SecurityService


        //======= RIGHT WAY ========

        NewAdminSettings newAdminService = new NewAdminSettings();
        SecurityService securityService = new SecurityService();
        User anotherUser = new User();

        //Responsibility #1 is to update user email
        newAdminService.changePassword(anotherUser, "password");

        //Responsibility #1 is to check user have access to do some action.
        if (securityService.hasAccess(user)) {
            user.sendMoney(new User(), 9999);
        }
    }
}
