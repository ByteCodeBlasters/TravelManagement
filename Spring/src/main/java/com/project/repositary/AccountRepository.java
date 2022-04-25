package com.project.repositary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.impClasses.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
	Account findByEmail(String email);
}
