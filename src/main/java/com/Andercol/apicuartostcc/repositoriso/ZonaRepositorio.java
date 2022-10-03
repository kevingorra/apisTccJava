package com.Andercol.apicuartostcc.repositoriso;

import com.Andercol.apicuartostcc.Entidades.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaRepositorio  extends JpaRepository <Zona,Integer> {
}
