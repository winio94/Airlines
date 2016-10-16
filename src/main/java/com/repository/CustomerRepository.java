package com.repository;

import com.domain.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Michał on 2016-10-02.
 */
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Customer findByLastName(@Param("name") String name);
}