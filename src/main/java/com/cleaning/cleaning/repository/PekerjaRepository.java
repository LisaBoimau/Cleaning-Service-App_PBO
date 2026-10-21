package com.cleaning.cleaning.repository;

import com.cleaning.cleaning.model.Pekerja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface PekerjaRepository extends JpaRepository<Pekerja, Long> {
    List<Pekerja> findByStatus(String status);
    Optional<Pekerja> findByEmail(String email);
    Optional<Pekerja> findFirstByStatusOrderByRatingDesc(String status);
}
