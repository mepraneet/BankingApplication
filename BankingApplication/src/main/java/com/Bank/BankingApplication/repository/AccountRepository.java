package com.Bank.BankingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bank.BankingApplication.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
