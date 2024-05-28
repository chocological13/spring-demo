package com.nina.exerciseDay3.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  @GetMapping("/api/v3/ping")
  public String ping() {
    return "Idk, Pong I guess.";
  }
}
