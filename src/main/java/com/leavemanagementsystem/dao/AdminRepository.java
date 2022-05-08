package com.leavemanagementsystem.dao;

import com.leavemanagementsystem.model.Admin;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	Optional<Admin> findByEmailAndPassword(String email, String password);
}