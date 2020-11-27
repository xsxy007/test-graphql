package com.github.testgraphql.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.testgraphql.entity.Bank;
import com.github.testgraphql.entity.BankView;
import com.github.testgraphql.repository.BankRepository;
import com.github.testgraphql.repository.BankViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService implements GraphQLQueryResolver {

    @Autowired
    private BankRepository bankRepository;
    @Autowired
    private BankViewRepository bankViewRepository;


    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    public Bank getBank(String id) {
        Optional<Bank> bank = bankRepository.findById(id);
        return bank.orElseGet(null);
    }

    public List<BankView> getAllBankViews() {
        return bankViewRepository.findAll();
    }

    public BankView getBankView(String category) {
        Optional<BankView> bankView = bankViewRepository.findById(category);
        return bankView.orElseGet(null);
    }
}
