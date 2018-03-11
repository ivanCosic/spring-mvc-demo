package rs.cetinari.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getGreeting() {
        return "Hello there!";
    }
}
