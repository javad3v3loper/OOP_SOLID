package O.goodexample;

import O.badexample.model.User;

public interface LoanHandler {
    // No specific approval type, so now it can be easily extended
    // any time you need new loan handler you can just create new implementation for this interface
    // without breaking logic in another, already existing classes...

    void approveLoan(User user);

}
