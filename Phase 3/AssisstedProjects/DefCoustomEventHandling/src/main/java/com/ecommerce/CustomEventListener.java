package com.ecommerce;

import org.springframework.context.ApplicationListener;

import com.ecommerce.beans.CustomEvent;

public abstract class CustomEventListener implements ApplicationListener<CustomEvent> {
        
   public void onApplicationEvent(CustomEvent event) {
      System.out.println(event.toString());
   }
}