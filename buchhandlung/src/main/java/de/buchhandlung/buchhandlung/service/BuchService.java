package de.buchhandlung.buchhandlung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.buchhandlung.buchhandlung.entity.Buch;
import de.buchhandlung.buchhandlung.repository.BuchRepository;

@Service
public class BuchService {
	
	
		
		@Autowired
		private BuchRepository bRepo;
		
		public void save(Buch b) {
			bRepo.save(b);
		
	}
		
		public List<Buch> getAllBuch(){
			return bRepo.findAll();
		}

}
