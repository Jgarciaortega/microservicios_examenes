package com.formacionbdi.microservicios.app.usuarios.models.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.microservicios.app.usuarios.models.entity.Alumno;
import com.formacionbdi.microservicios.app.usuarios.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository repo;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Alumno> findById(Long id) {		
		return repo.findById(id);
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		return repo.save(alumno);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repo.deleteById(id);
	}

}
