package O.goodexample;

import O.badexample.model.User;

public class MortgageLoanHandler implements LoanHandler{

    private final Validator validator;

    public MortgageLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        if(validator.isValid(user)){
            // procced...
        }
    }
}
