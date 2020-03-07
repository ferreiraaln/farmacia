package com.farmacia.farmacia.repository;

import com.farmacia.farmacia.dominios.OrdemCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemCompraRepository extends JpaRepository<OrdemCompra,Long> {


}
