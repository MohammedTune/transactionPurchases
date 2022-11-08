package com.shamaProject.demoApp.servises;

import com.shamaProject.demoApp.Getmapping;
import com.shamaProject.demoApp.model.suppliers;
import com.shamaProject.demoApp.repository.supRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
import java.util.Optional;

@Service
public class supservise {
    private static supRepo supRepo;
    @Autowired
    public supservise(supRepo supRepo){

        this.supRepo=supRepo;
    }

 @Getmapping
public suppliers getsuppliers(suppliers suppliers){
        return supRepo.save(suppliers);
}

    public suppliers addsupplies(suppliers suppliers) {
        suppliers.setSupplierCode(UUID.randomUUID().toString());
        return supRepo.save(suppliers);
    }


     public List<suppliers> findAllsuppliers(suppliers suppliers){

        return supRepo.findAll();
    }
    public suppliers updatesuppliers(suppliers suppliers){
        return supRepo.save(suppliers);
    }
    public Optional<suppliers> findsuppliersById(long id){
        return supRepo.findsupplierById(id);
    }
    public void deletesuppliers(long id){

        supRepo.deletesuppliersById(id);
    }
    }
