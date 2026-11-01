package com.cleaning.cleaning.repository;

import com.cleaning.cleaning.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByPelangganId(Long pelangganId);
    List<Order> findByPekerjaId(Long pekerjaId);
    List<Order> findByStatus(String status);

    // Performance optimization: Calculate average rating directly in DB instead of memory
    @org.springframework.data.jpa.repository.Query("SELECT COALESCE(AVG(o.nilaiRating), 0.0) FROM Order o WHERE o.pekerja.id = :pekerjaId AND o.nilaiRating > 0")
    Double getAverageRatingByPekerjaId(@org.springframework.data.repository.query.Param("pekerjaId") Long pekerjaId);
}
