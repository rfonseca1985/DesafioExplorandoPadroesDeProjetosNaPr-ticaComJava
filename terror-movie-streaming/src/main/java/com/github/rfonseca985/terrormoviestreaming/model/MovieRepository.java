package com.github.rfonseca985.terrormoviestreaming.model;

import com.github.rfonseca985.terrormoviestreaming.model.TerrorMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository <TerrorMovie ,Long>  {

}
