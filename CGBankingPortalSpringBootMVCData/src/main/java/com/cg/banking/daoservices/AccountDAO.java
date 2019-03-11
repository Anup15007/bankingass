package com.cg.banking.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.banking.beans.Account;

public interface AccountDAO extends JpaRepository<Account, Long>{}
