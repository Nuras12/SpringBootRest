package nuras;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BlogController {

    @RequestMapping("/")
    public ResponseEntity<Student> index() {
        Student st = new Student();
        return ResponseEntity.ok(st);
    }

}