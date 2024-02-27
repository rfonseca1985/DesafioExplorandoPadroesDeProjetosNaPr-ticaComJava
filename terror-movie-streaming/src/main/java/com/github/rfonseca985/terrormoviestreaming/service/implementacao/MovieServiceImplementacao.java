package com.github.rfonseca985.terrormoviestreaming.service.implementacao;

import com.github.rfonseca985.terrormoviestreaming.model.MovieRepository;
import com.github.rfonseca985.terrormoviestreaming.model.TerrorMovie;
import com.github.rfonseca985.terrormoviestreaming.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceImplementacao implements MovieService {
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private MovieRepository movieRepository;



    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<TerrorMovie> buscarTodos() {
        // Buscar todos os Clientes.
        return movieRepository.findAll();
    }

    @Override
    public TerrorMovie buscarPorId(Long id) {

        Optional<TerrorMovie> movie = movieRepository.findById(id);
        return movie.get();
    }

    @Override
    public void inserir(TerrorMovie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void atualizar(Long id, TerrorMovie movie) {
        // Buscar Cliente por ID, caso exista:
        Optional<TerrorMovie> movieBd = movieRepository.findById(id);
        if (movieBd.isPresent()) {
            inserir(movie);
        }
    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente por ID.
        movieRepository.deleteById(id);
    }
}
