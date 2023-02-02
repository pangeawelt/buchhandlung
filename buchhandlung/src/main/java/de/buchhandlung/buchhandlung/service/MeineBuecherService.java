package de.buchhandlung.buchhandlung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.buchhandlung.buchhandlung.entity.Buch;
import de.buchhandlung.buchhandlung.entity.MeineBuecher;
import de.buchhandlung.buchhandlung.repository.BuchRepository;
import de.buchhandlung.buchhandlung.repository.MeineBuecherRepository;

@Service
public class MeineBuecherService {
	
	
		
		@Autowired
		private MeineBuecherRepository meinbuch;
		
		public void saveMeinBuch(MeineBuecher buch) {
			meinbuch.save(buch);
		
	}
		

}
