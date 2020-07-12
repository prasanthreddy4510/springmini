package com.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.BookEntity;

public interface BookDetailsRepo extends JpaRepository<BookEntity,Serializable>{

}
