package O.goodexample;

import O.badexample.model.User;

public class PersonalLoanHandler implements LoanHandler{

    private final Validator validator;

    public PersonalLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        if (validator.isValid(user)){
            // proceed with approval...
        }
    }
}
