package com.codegym.blog.service;

import com.codegym.blog.model.Blog;

import java.util.List;

public interface IGeneralService<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
