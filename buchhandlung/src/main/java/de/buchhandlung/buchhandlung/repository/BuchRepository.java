package de.buchhandlung.buchhandlung.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.buchhandlung.buchhandlung.entity.Buch;


@Repository
public interface  BuchRepository extends JpaRepository<Buch, Integer> {
	
	

}
