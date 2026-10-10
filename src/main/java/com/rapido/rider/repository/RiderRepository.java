package com.rapido.rider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rapido.rider.entity.Rider;
@Repository
public interface RiderRepository extends JpaRepository<Rider, Integer> {
	

}
