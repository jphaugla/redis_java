package com.jphaugla;

import redis.clients.jedis.Jedis;

import java.util.Arrays;
import java.util.List;

public class demo {

  public static void main(String[] args) throws Exception {
    Jedis jedis = new Jedis("127.0.0.1", 6379);
//    jedis.auth("password")
    System.out.println("Connected to Redis");
    for (int i = 1; i < 101; i++) {
      String nextInteger = Integer.toString(i);
      jedis.lpush("numberList", nextInteger);
    }
    System.out.println("Wrote to Redis");
    //  read from Redis in reverse order and print out

      List<String> numberList = jedis.lrange("numberList", -100, -1);
      System.out.println(Arrays.toString(numberList.toArray()));
  }
}
