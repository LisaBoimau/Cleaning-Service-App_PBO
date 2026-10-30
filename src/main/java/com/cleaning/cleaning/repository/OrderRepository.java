package com.cleaning.cleaning.repository;

import com.cleaning.cleaning.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByPelangganId(Long pelangganId);
    List<Order> findByPekerjaId(Long pekerjaId);
    List<Order> findByStatus(String status);

    @Query("SELECT AVG(o.nilaiRating) FROM Order o WHERE o.pekerja.id = :pekerjaId AND o.nilaiRating > 0")
    Double getAverageRatingByPekerjaId(@Param("pekerjaId") Long pekerjaId);
}
