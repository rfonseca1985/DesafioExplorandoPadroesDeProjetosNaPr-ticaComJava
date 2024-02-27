package com.github.rfonseca985.terrormoviestreaming.controller;

import com.github.rfonseca985.terrormoviestreaming.model.TerrorMovie;
import com.github.rfonseca985.terrormoviestreaming.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<Iterable<TerrorMovie>> buscarTodos() {
        return ResponseEntity.ok(movieService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TerrorMovie> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<TerrorMovie> inserir(@RequestBody TerrorMovie movie) {
       movieService.inserir(movie);
        return ResponseEntity.ok(movie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TerrorMovie> atualizar(@PathVariable Long id, @RequestBody TerrorMovie movie) {
        movieService.atualizar(id, movie);
        return ResponseEntity.ok(movie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        movieService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
