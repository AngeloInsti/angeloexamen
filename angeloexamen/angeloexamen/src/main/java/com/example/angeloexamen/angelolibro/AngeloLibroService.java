package com.example.angeloexamen.angelolibro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AngeloLibroService {
    @Autowired
    private AngeloLibroRepository angeloLibroRepository;

    //create
    public AngeloLibro save(AngeloLibro entity)
    {
        return angeloLibroRepository.save(entity);
    }


    //findbyid
    public AngeloLibro findById(Long id)
    {
        return angeloLibroRepository.findById(id).orElse(null);
    }

    //delete

    public void deleteById( long id)
    {
        angeloLibroRepository.deleteById(id);
        {
            angeloLibroRepository.deleteById(id);
        }
    }

    public void deleteBytitulo( String titulo)
    {
        angeloLibroRepository.deleteBytitulo(titulo);
        {
            angeloLibroRepository.deleteBytitulo(titulo);
        }
    }

    //select all
    public List<AngeloLibro> findAll()
    {
        return angeloLibroRepository.findAll();
    }
}
