package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.SupplierAll;

@Repository
public interface SRepositoryi extends JpaRepository<SupplierAll, Integer> {

}
