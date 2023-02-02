package de.buchhandlung.buchhandlung.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.buchhandlung.buchhandlung.entity.Buch;
import de.buchhandlung.buchhandlung.entity.MeineBuecher;


@Repository
public interface  MeineBuecherRepository extends JpaRepository<MeineBuecher, Integer> {
	
	

}
