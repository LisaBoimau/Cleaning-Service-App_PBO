package com.cleaning.cleaning.repository;

import com.cleaning.cleaning.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByPelangganId(Long pelangganId);
    List<Order> findByPekerjaId(Long pekerjaId);
    List<Order> findByStatus(String status);

    // ⚡ Bolt: Offload aggregation to database instead of loading all objects in memory
    @Query("SELECT AVG(o.nilaiRating) FROM Order o WHERE o.pekerja.id = :pekerjaId AND o.nilaiRating > 0")
    Double getAverageRatingByPekerjaId(@Param("pekerjaId") Long pekerjaId);
}
