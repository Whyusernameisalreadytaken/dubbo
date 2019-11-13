package com.example.dubbo.provider.biz.id.impl;

import com.example.dubbo.provider.api.id.IdGenerator;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("idGenerator")
public class IdGeneratorImpl implements IdGenerator {


    @Override
    public String generateId() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-","");
    }

    @Override
    public String generateId(String algorithm) {
        return UUID.randomUUID().toString();
    }
}
