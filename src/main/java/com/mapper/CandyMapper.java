package com.mapper;

import com.pojo.Candy;

import java.util.List;

/**
 * Created by mengbw on 2019/6/25.
 */
public interface CandyMapper {
    List<Candy> findAll();
}
