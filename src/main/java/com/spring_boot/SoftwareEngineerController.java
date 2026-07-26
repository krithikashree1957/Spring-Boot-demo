package com.spring_boot;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(1, "John Doe", "Java, Spring Boot, React"),
                new SoftwareEngineer(2, "Jane Smith", "Python, Django, Angular"),
                new SoftwareEngineer(3, "Alice Johnson", "JavaScript, Node.js, Vue.js")
        );
    }

}
