package com.pruebag1.hector.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebag1.hector.models.Mueble;
import com.pruebag1.hector.repositories.MuebleRepository;

@Service
public class MuebleService {
    /**Lógica del negocio */
    @Autowired
    MuebleRepository mueblerepository;

    public void saveMueble(@Valid Mueble mueble){
        muebleRepository.save(mueble);

        public List<Mueble> findAll(); {
            return muebleRepository.findAll();
        }
    
        public void guardarMueble(@Valid Mueble mueble) {
        }
    
        //Para consultar por un dato en la database x su id
        public Mueble buscarId(Long id) {
            return muebleRepository.findById(id).get(); //.get() espeficica el tipo de dato.
        }
    }
}
