package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity,Integer> {

}
