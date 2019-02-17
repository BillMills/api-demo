package tableofnuclides;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/demo")
@Api(value="demoapi", description="A demo API block")
public class tonController {

    @ApiOperation(value = "Fetch the element corresponding to an atomic number", response = Iterable.class)
    @RequestMapping(value = "/elt", method = RequestMethod.GET)
    public Element elt(@RequestParam(value="Z", defaultValue="1") int Z) {
        return new Element(Z);
    }

    @ApiOperation(value = "Fetch the price of a product by name", response = Iterable.class)
    @RequestMapping(value = "/price", method = RequestMethod.GET)
    public Dblookup price(@RequestParam(value="name", defaultValue="widget") String n) {
        return new Dblookup(n);
    }
}
