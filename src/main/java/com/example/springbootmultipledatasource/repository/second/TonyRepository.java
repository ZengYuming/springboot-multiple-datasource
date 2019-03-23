package com.example.springbootmultipledatasource.repository.second;

import com.example.springbootmultipledatasource.entity.second.Tony;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author leroy
 * @date 2018/12/14 12:54
 */
public interface TonyRepository extends JpaRepository<Tony, Long>, JpaSpecificationExecutor<Long> {
}
