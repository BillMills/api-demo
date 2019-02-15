package tableofnuclides;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tonController {

    @RequestMapping("/elt")
    public Element z(@RequestParam(value="Z", defaultValue="1") int Z) {
        return new Element(Z);
    }

    @RequestMapping("/price")
    public Dblookup z(@RequestParam(value="name", defaultValue="widget") String n) {
        return new Dblookup(n);
    }
}
