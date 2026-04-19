package ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MyComponent {

    public String CallMyComponent() {
        return "This is my component";
    }
}
