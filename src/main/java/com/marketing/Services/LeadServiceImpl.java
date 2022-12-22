 package com.marketing.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.Entities.Lead;
import com.marketing.Repositories.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveLeadInfo(Lead lead) {
		leadRepo.save(lead);
		
	}


	

	

}
