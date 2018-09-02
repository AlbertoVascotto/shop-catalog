package com.example.catalog.repository;

import java.util.List;

//Perchè interface? Cosa fa di speciale?

import org.springframework.data.repository.CrudRepository;

import com.example.catalog.domain.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
	public List<Product> findByCategory(String category) ;
}

// CrudRepository per usare MySQL 
// findByCategory metodo implementato da Spring. Non è dichiarato da nessuna parte, basta mettere il find e by e lui capisce automaticamente.