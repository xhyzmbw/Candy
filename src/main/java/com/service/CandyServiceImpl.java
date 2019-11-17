package com.service;

import com.mapper.CandyMapper;
import com.pojo.Candy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mengbw on 2019/6/25.
 */
@Service
public class CandyServiceImpl implements CandyService {
    @Autowired
    CandyMapper candyMapper;

    @Override
    public List<Candy> findAll() {
        return candyMapper.findAll();
    }
}
