package com.xml_config.constructor_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config-constructor-injection.xml");
        MemberShip memberShip = context.getBean("memberShipObj", MemberShip.class);
        memberShip.setCustomer(new Customer());
        memberShip.getCustomer().setCustName("Joe");
        System.out.println(memberShip.getCustomer().toString());
    }
}
