package com.paratusSoftware.carTracker.documentation;

import com.paratusSoftware.carTracker.util.FileReader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/swagger")
public class SwaggerController {

    private static String swaggerJson = FileReader.contentFrom("./res/swagger/swagger.json");

    @RequestMapping(method = RequestMethod.GET, path = "/json")
    public String apiDocumentation(){
        return swaggerJson;
    }

}
