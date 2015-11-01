package com.greyfocus.andamento.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Spring Boot application entry point.
 * 
 * @author Cristian Vasilache
 *
 */
@SpringBootApplication
public class Application {

  private static final Logger LOG = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Application.class, args);

    LOG.info("Loaded the application context composed of " + ctx.getBeanDefinitionCount() + " beans.");
  }
}