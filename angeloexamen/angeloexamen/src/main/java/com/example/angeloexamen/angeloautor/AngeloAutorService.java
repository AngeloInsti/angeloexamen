package com.example.angeloexamen.angeloautor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AngeloAutorService {
    @Autowired
    private AngeloAutorRepository angeloAutorRepository;

    //create
    public AngeloAutor save(AngeloAutor entity)
    {
        return angeloAutorRepository.save(entity);
    }


    //findbyid
    public AngeloAutor findById(Long id)
    {
        return angeloAutorRepository.findById(id).orElse(null);
    }

    //delete

    public void deleteById( long id)
    {
        angeloAutorRepository.deleteById(id);
        {
            angeloAutorRepository.deleteById(id);
        }
    }

    //delete

    public void deleteByNombre( String nombre)
    {
        angeloAutorRepository.deleteByNombre(nombre);
        {
            angeloAutorRepository.deleteByNombre(nombre);
        }
    }

    //select all
    public List<AngeloAutor> findAll()
    {
        return angeloAutorRepository.findAll();
    }
}
