package com.regina.springcloud.service;

import com.regina.springcloud.model.Book;
import com.regina.springcloud.mapper.BookMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*若该注解无法生效时，该考虑是否是mysql-mybatis-druid的jar*/
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;
    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }
}
