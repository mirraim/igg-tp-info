package ru.mirraim.igg_tp_info.service.search;

import java.util.List;

public interface SearchService<T> {
    T get(String name);
    List<T> findAll();
}
