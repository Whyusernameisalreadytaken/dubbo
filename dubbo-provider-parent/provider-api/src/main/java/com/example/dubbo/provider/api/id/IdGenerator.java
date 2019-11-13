package com.example.dubbo.provider.api.id;

public interface IdGenerator {

    /**
     * 生成线程id
     *
     * @return
     */
    String generateId();

    /**
     * 根据指定算法生成id
     *
     * @param algorithm
     * @return
     */
    String generateId(String algorithm);
}
