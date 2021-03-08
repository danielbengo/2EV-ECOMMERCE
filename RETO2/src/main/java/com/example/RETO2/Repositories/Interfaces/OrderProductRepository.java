package com.example.RETO2.Repositories.Interfaces;

import java.util.Collection;

import com.example.RETO2.Repositories.Entities.OrderProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderProductRepository extends JpaRepository<OrderProductEntity, Long> {
    @Query(value = "SELECT p FROM Products p JOIN OrderProducts op ON op.idproduct = p.id WHERE op.idorder = :id")
    Collection<OrderProductEntity> orderProductsById(@Param("id") Long id);

}