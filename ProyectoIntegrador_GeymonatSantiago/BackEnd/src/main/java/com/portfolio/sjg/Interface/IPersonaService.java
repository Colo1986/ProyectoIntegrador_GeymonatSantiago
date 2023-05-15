package com.portfolio.sjg.Interface;

import com.portfolio.sjg.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas//
    public List<Persona> getPersona ();
    
    //Guardar un objeto de tipo Persona//
    public void savePersona (Persona persona);
    
    //Eliminar un objeto pero lo buscamos por Id//
    public void deletePersona (Long id);
    
    //Buscar una persona por Id//
    public Persona findPersona (Long id);
}
