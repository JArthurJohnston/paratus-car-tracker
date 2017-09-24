package com.paratusSoftware.carTracker;


import com.paratusSoftware.carTracker.documentation.SwaggerController;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static junit.framework.TestCase.assertEquals;

public class SwaggerControllerTest {

    @Test
    public void testGetsJsonFile() throws Exception{
        final SwaggerController swaggerController = new SwaggerController();
        final String expectedContent = new String(Files.readAllBytes(Paths.get("./res/swagger/swagger.json")));

        final String swaggerJson = swaggerController.apiDocumentation();

        assertEquals(expectedContent, swaggerJson);
    }

}