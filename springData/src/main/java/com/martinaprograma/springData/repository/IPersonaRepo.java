package com.martinaprograma.springData.repository;

import com.martinaprograma.springData.model.PersonaTabla;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo  extends JpaRepository<PersonaTabla,Integer> {
}
