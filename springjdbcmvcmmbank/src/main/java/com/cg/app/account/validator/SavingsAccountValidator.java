package com.cg.app.account.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cg.app.account.SavingsAccount;

@Component
public class SavingsAccountValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		SavingsAccount account = (SavingsAccount) target;
		if(account.getBankAccount().getAccountHolderName().isEmpty()) {
			errors.rejectValue("accountHolderName", "accountHolderName.length","Employee name should not be empty");
		}
		if(account.getBankAccount().getAccountBalance()>0) {
			errors.rejectValue("accountBalance","accountBalance.minimum","Salary must be higher than 0");
		}
	}
}
