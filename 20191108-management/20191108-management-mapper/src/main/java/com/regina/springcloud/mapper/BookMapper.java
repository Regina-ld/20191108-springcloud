package com.regina.springcloud.mapper;


import com.regina.springcloud.model.Book;

import java.util.List;

public interface BookMapper {
    List<Book> selectAll();
}
