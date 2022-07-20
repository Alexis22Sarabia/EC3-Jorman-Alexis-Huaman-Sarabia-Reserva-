package com.idat.EC1JormanHuaman.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC1JormanHuaman.dto.HospitalDTORequest;
import com.idat.EC1JormanHuaman.dto.HospitalDTOResponse;
import com.idat.EC1JormanHuaman.model.Hospital;
import com.idat.EC1JormanHuaman.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService{
	@Autowired
	private HospitalRepository repository;
	
	@Override
	public void guardarHospital(HospitalDTORequest hospital) {
		
		Hospital h = new Hospital();
		h.setNombre(hospital.getNombre());
		h.setDescripcion(h.getDescripcion());
		h.setDistrito(h.getDistrito());
		repository.save(h);
	}

	@Override
	public void actualizarHospital(HospitalDTORequest hospital) {
		// TODO Auto-generated method stub
		Hospital h = new Hospital();
		h.setIdHospital(hospital.getId());
		h.setNombre(hospital.getNombre());
		h.setDescripcion(h.getDescripcion());
		h.setDistrito(h.getDistrito());

		repository.saveAndFlush(h);
		
	}

	@Override
	public void eliminarHospital(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<HospitalDTOResponse> listarHospital() {
		// TODO Auto-generated method stub
List<HospitalDTOResponse> listar = new ArrayList<>();
		
HospitalDTOResponse dto = null;
		
		List<Hospital> h = repository.findAll();
		
		for (Hospital hospital : h) {
			
			dto = new HospitalDTOResponse();
			
			dto.setDescripcionHospital(hospital.getDescripcion());
			dto.setNombre(hospital.getNombre());
			dto.setDistritoHospital(hospital.getDistrito());
			dto.setId(hospital.getIdHospital());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public HospitalDTOResponse obtenerHospitalId(Integer id) {
		// TODO Auto-generated method stub
		Hospital hospital = repository.findById(id).orElse(null);
		HospitalDTOResponse dto = new HospitalDTOResponse();
		
		dto.setDescripcionHospital(hospital.getDescripcion());
		dto.setNombre(hospital.getNombre());
		dto.setDistritoHospital(hospital.getDistrito());
		dto.setId(hospital.getIdHospital());
		
		return dto;
	}

}
