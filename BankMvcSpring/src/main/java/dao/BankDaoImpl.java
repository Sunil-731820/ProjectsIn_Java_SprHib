package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import model.Bank;

public class BankDaoImpl implements BankDao {
	private JdbcTemplate jdbcTemplate;
	
	public BankDaoImpl(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	public int generateAccountNo()  {
		String sql = "select case when max(accountNo) is NULL THEN 1   "
				+ " else Max(AccountNO)+1 END accno from Bank";
		List<Object> listBank = jdbcTemplate.query(sql, new RowMapper<Object>() {
		    
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getInt("accno");
			}
	});
		int accno = (Integer)listBank.get(0);
			return accno;
	}
		
	
	@Override
	public void updateBank(Bank bank) {
		String cmd = "Update bank set firstName=?, lastName=?, city=?, state=?, "
				+ " amount=?,cheqFacil=?,accountType=?,status=?,dateOfOpen=? WHERE accountNo=?";
		 jdbcTemplate.update(cmd, bank.getFirstName(),bank.getLastName(),
				 bank.getCity(),bank.getState(),bank.getAmount(),bank.getCheqFacil(),
				 bank.getAccountType(),bank.getStatus(),bank.getDateOfOpen(),bank.getAccountNo());
		
	}
	
	
	@Override
	public Bank searchBank(int accountNo) {
		String sql = "select * from bank where accountNo=?";
	    return jdbcTemplate.query(sql,new Object[] {accountNo}, new ResultSetExtractor<Bank>() {
	        public Bank extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	            	Bank bank = new Bank();
	    			bank.setAccountNo(rs.getInt("AccountNo"));
	    			bank.setFirstName(rs.getString("FirstName"));
	    			bank.setLastName(rs.getString("LastName"));
	    			bank.setCity(rs.getString("City"));
	    			bank.setState(rs.getString("State"));
	    			bank.setAmount(rs.getInt("Amount"));
	    			bank.setCheqFacil(rs.getString("CheqFacil"));
	    			bank.setAccountType(rs.getString("AccountType"));
	    			bank.setStatus(rs.getString("Status"));
	    			bank.setDateOfOpen(rs.getDate("DateOfOpen"));
	    			return bank;
	            }
	 
	            return null;
	        }
	 
	    });
	}
	
	@Override
	public List<Bank> showBank(){
		String sql = "select *from bank";
		List<Bank> listBank = jdbcTemplate.query(sql, new RowMapper<Bank>() {
	    
		@Override
		public Bank mapRow(ResultSet rs, int rowNum) throws SQLException {
			Bank bank = new Bank();
			bank.setAccountNo(rs.getInt("AccountNo"));
			bank.setFirstName(rs.getString("FirstName"));
			bank.setLastName(rs.getString("LastName"));
			bank.setCity(rs.getString("City"));
			bank.setState(rs.getString("State"));
			bank.setAmount(rs.getInt("Amount"));
			bank.setCheqFacil(rs.getString("CheqFacil"));
			bank.setAccountType(rs.getString("AccountType"));
			bank.setStatus(rs.getString("Status"));
			bank.setDateOfOpen(rs.getDate("DateOfOpen"));
			return bank;
		}
		});
		return listBank;
	}

	@Override
	public void deleteBank(int accountNo) {
		String sql = "DELETE FROM bank WHERE accountNo=?";
	    jdbcTemplate.update(sql, accountNo);
		
	}

	@Override
	public void addBank(Bank bank) {
		String cmd = "insert into bank(accountNo,firstName,lastName,city,state,amount,cheqFacil,"
				+ "accountType,status,dateOfOpen) values(?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, bank.getAccountNo(),bank.getFirstName(),bank.getLastName(),
				bank.getCity(),bank.getState(),bank.getAmount(),bank.getCheqFacil(),
				bank.getAccountType(),bank.getStatus(),bank.getDateOfOpen());	
		
	}
	
	
}
