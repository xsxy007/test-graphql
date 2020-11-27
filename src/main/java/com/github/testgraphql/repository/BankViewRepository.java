package com.github.testgraphql.repository;

import com.github.testgraphql.entity.BankView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankViewRepository extends JpaRepository<BankView, String> {
}
