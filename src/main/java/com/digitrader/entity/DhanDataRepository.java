package com.digitrader.entity;

import com.digitrader.dao.DhanDataDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DhanDataRepository extends JpaRepository<DhanDataDAO, Long> {
    Optional<DhanDataDAO> findBySym(String sym);
    DhanDataDAO deleteBySym(String sym);
    List<DhanDataDAO> findAllByOrderByMcapDesc();
    List<DhanDataDAO> findByStatusOrderByMcapDesc(String status);
}
