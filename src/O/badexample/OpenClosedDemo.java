package O.badexample;


import O.badexample.model.User;

public class OpenClosedDemo {
    public static void main(String[] args) {
        LoanHandler loanHandler = new LoanHandler();
        User user = new User();

        loanHandler.approvePersonalLoan(user);
        loanHandler.approveMortgage(user);
        // The problem is in the following:
        // when you will need to create new loan handler e.g. CarLoanHandler, it
        // would be not possible without modifying of existing unit (LoanHandler) -> not closed ...
        // another option is to create subclass, but it will be confusing,
        // since CarLoanHandler will also extend LoanHandler behavior(mortgage and personal approval)
    }
}
