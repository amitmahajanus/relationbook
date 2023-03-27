package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account,Long> {
    @Query("select u from com.example.demo.Account u where u.owner = ?1")
    Account findByOwner(String owner);
}
