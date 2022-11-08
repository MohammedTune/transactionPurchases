package com.shamaProject.demoApp.repository;

import com.shamaProject.demoApp.model.suppliers;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;
public interface supRepo extends JpaRepository<suppliers, Long> {
    void deletesuppliersById(long id);

    Optional<suppliers> findsupplierById(long id);

       Optional<suppliers> findById(Long aLong);

    @Override
    List<suppliers> findAll();
}
