package com.example.labo4.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.labo4.Repositories.Entities.MovieEntity;
import com.example.labo4.Repositories.Interfaces.MoviesRepository;
import com.example.labo4.Services.Models.MovieDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class MoviesService {
  @Autowired
  private MoviesRepository moviesRepository;
  @Autowired
  private ModelMapper modelMapper;

  public List<MovieDTO> getAll() {
    return moviesRepository.findAll().stream().map(x -> modelMapper.map(x, MovieDTO.class))
        .collect(Collectors.toList());
  }

  // tituloyaño a la vez
  public List<MovieDTO> findByTitleOrYear(String title, int year) {

    if (!title.equals("") && year != 0) {

      return moviesRepository.findByTitleOrYear(title, year).stream().map(x -> modelMapper.map(x, MovieDTO.class))
          .collect(Collectors.toList());
    } else if (title.equals("") && year != 0) {
      return moviesRepository.findByYear(year).stream().map(x -> modelMapper.map(x, MovieDTO.class))
          .collect(Collectors.toList());

    } else if (!title.equals("") && year == 0) {
      return moviesRepository.findByTitle(title).stream().map(x -> modelMapper.map(x, MovieDTO.class))
          .collect(Collectors.toList());
    }
    return moviesRepository.findAll().stream().map(x -> modelMapper.map(x, MovieDTO.class))
        .collect(Collectors.toList());
  }

  // por año o por id o por título
  // por id
  public Optional<MovieDTO> findById(Long id) {
    Optional<MovieEntity> entidad = moviesRepository.findById(id);
    if (entidad.isPresent())
      return Optional.of(modelMapper.map(entidad.get(), MovieDTO.class));
    else
      return Optional.empty();
  }

  // titulico
  public List<MovieDTO> findByTitle(String title) {
    return moviesRepository.findByTitle(title).stream().map(x -> modelMapper.map(x, MovieDTO.class))
        .collect(Collectors.toList());
  }

  // año
  public List<MovieDTO> findByYear(int year) {
    return moviesRepository.findByYear(year).stream().map(x -> modelMapper.map(x, MovieDTO.class))
        .collect(Collectors.toList());
  }

  // SE EMPLEAN DESDE EL CONTROLLER
  public MovieDTO movieAdd(MovieDTO post) {
    MovieEntity entityToInsert = modelMapper.map(post, MovieEntity.class);
    MovieEntity result = moviesRepository.save(entityToInsert);
    return modelMapper.map(result, MovieDTO.class);
  }

  public MovieDTO movieUpdate(Long ID, MovieDTO post) {
    MovieEntity entityToUpdate = modelMapper.map(post, MovieEntity.class);
    MovieEntity result = moviesRepository.save(entityToUpdate);
    return modelMapper.map(result, MovieDTO.class);
  }

  public void movieDelete(Long ID) {
    Optional<MovieEntity> entityToDelete = moviesRepository.findById(ID);
    if (entityToDelete.isPresent())
      moviesRepository.delete(entityToDelete.get());
  }

}