package com.xpanxion.restproject.repository;

import com.xpanxion.restproject.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}
