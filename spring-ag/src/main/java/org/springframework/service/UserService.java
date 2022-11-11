package org.springframework.service;


import org.springframework.WindowsCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(WindowsCondition.class)
public class UserService {
}
