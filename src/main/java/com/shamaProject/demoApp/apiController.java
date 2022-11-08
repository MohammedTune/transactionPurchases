package com.shamaProject.demoApp;

import com.shamaProject.demoApp.model.suppliers;
import com.shamaProject.demoApp.servises.supservise;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class apiController {
    private supservise supservise;
    private long suppliers;

    public apiController(supservise supservise) {
        this.supservise = supservise;
    }

                     @PostMapping("/add")

    public ResponseEntity<suppliers> addsuppliers(@RequestBody suppliers supplier){
        suppliers newsuppliers=supservise.addsupplies(supplier);
        return new ResponseEntity<>(newsuppliers,HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<suppliers> updatesuppliers(@RequestBody suppliers supplier){
        suppliers updatesuppliers=supservise.updatesuppliers(supplier);
        return new ResponseEntity<>(updatesuppliers,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletesuppliers(@PathVariable("id") long id){
       supservise.deletesuppliers(suppliers);
        return new ResponseEntity<>(deletesuppliers(suppliers),HttpStatus.CREATED);
    }
     }


