package com.example.springbootmultipledatasource.repository.primary;


import com.example.springbootmultipledatasource.entity.primary.Martin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;


public interface MartinRepository extends JpaRepository<Martin, Long>, JpaSpecificationExecutor<Long> {
}