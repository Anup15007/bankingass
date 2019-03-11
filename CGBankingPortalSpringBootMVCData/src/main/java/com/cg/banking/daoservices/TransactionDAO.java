package com.cg.banking.daoservices;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cg.banking.beans.Transaction;
public interface TransactionDAO extends JpaRepository<Transaction, Long>{
	@Query(value="from Transaction t where t.account.accountNo = :accountNo")
	List<Transaction> getAllById(long accountNo);
}