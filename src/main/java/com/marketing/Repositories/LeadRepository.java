package com.marketing.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing.Entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
