package com.ewolff.microservice.order.logic;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "order", path = "api")
interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
