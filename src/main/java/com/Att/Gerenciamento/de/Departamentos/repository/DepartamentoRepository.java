package com.Att.Gerenciamento.de.Departamentos.repository;

import com.Att.Gerenciamento.de.Departamentos.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
