package com.Andercol.apicuartostcc.repositoriso;

import com.Andercol.apicuartostcc.Entidades.Mercancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface MercanciaRepositorio extends JpaRepository <Mercancia,Integer> {



}
