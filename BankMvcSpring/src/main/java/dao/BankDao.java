package dao;

import java.sql.SQLException;
import java.util.List;

import model.Bank;

public interface BankDao {
	List<Bank> showBank();
	Bank searchBank(int accountNo);
	void updateBank(Bank bank);
	void deleteBank(int accountNo);
	void addBank(Bank bank);


}
