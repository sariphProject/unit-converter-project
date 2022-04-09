package com.ventera.science.converter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.ventera.science.converter.model.StudentInputRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class Application {
 /* @PostMapping("/volume")
  @ResponseBody
  public long convertVolume(@RequestBody final StudentInputRequest studentInputRequest) {
    return volumeService.retrieveVolume(studentInputRequest);
  }*/

  @GetMapping(value = "/{path:[^\\.]*}")
  public String redirect() {
    return "forward:/";
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}

/*
@Component
@ConfigurationProperties("demo")
class Properties {
  private String value;

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}
}*/
