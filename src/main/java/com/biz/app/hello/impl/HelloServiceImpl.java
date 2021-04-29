package com.biz.app.hello.impl;

import com.biz.app.hello.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 엄승하
 */
@Slf4j
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void helloProcess(String name) {

        log.debug("debug level name:{}", name);
        log.info("info level name:{}", name);
        log.error("error level name:{}", name);

    }
}
