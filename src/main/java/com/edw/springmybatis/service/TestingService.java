package com.edw.springmybatis.service;

import com.edw.springmybatis.bean.Testing;
import com.edw.springmybatis.mapper.TestingMapper;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author edwin < edwinkun at gmail dot com >
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class TestingService {

    @Autowired
    private TestingMapper testingMapper;

    public void insert() throws Exception {
        testingMapper.insert(new Testing("" + new Random().nextInt(), "" + new Random().nextInt()));
        testingMapper.insert(new Testing()); // this will throw an exception
    }
}
