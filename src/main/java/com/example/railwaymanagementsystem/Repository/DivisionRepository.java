package com.example.railwaymanagementsystem.Repository;

import com.example.railwaymanagementsystem.Model.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends JpaRepository<Division,Long> {
}
