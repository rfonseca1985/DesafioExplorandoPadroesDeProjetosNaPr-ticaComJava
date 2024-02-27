package com.github.rfonseca985.terrormoviestreaming.service;


import com.github.rfonseca985.terrormoviestreaming.model.MovieRepository;
import com.github.rfonseca985.terrormoviestreaming.model.TerrorMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public interface MovieService {

    final MovieRepository movieRepository = new MovieRepository() {
        @Override
        public void flush() {

        }

        @Override
        public <S extends TerrorMovie> S saveAndFlush(S entity) {
            return null;
        }

        @Override
        public <S extends TerrorMovie> List<S> saveAllAndFlush(Iterable<S> entities) {
            return null;
        }

        @Override
        public void deleteAllInBatch(Iterable<TerrorMovie> entities) {

        }

        @Override
        public void deleteAllByIdInBatch(Iterable<Long> longs) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public TerrorMovie getOne(Long aLong) {
            return null;
        }

        @Override
        public TerrorMovie getById(Long aLong) {
            return null;
        }

        @Override
        public TerrorMovie getReferenceById(Long aLong) {
            return null;
        }

        @Override
        public <S extends TerrorMovie> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends TerrorMovie> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public <S extends TerrorMovie> List<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public List<TerrorMovie> findAll() {
            return null;
        }

        @Override
        public List<TerrorMovie> findAllById(Iterable<Long> longs) {
            return null;
        }

        @Override
        public <S extends TerrorMovie> S save(S entity) {
            return null;
        }

        @Override
        public Optional<TerrorMovie> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(TerrorMovie entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends Long> longs) {

        }

        @Override
        public void deleteAll(Iterable<? extends TerrorMovie> entities) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public List<TerrorMovie> findAll(Sort sort) {
            return null;
        }

        @Override
        public Page<TerrorMovie> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends TerrorMovie> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends TerrorMovie> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends TerrorMovie> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends TerrorMovie> boolean exists(Example<S> example) {
            return false;
        }

        @Override
        public <S extends TerrorMovie, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
            return null;
        }
    };

    Iterable<TerrorMovie> buscarTodos();

  TerrorMovie buscarPorId(Long id);

    public default void inserir(TerrorMovie movie){
        movieRepository.save(movie);
    }


    void atualizar(Long id, TerrorMovie movie);

    void deletar(Long id);
}
