package com.pruebag1.hector.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pruebag1.hector.models.Mueble;

@Repository
// JPA Repository nos permite trabajar con metodos definidos 
// <Objeto, tipo de dato de la primary key>
public interface MuebleRepository extends JpaRepository<Mueble, Long> {
    // Las interfaces sólo definen los métodos //
    // Aqui definimos la logica de negocio o validaciones del sistema
    // Querys y usar metodo que se conecta a la base de datos 
    
}
