package com.paratusSoftware.carTracker;

import com.paratusSoftware.carTracker.documentation.SwaggerController;
import com.paratusSoftware.carTracker.util.FileReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwaggerControllerTest {

    @Test
    public void testGetsJsonFile() throws Exception{
        final SwaggerController swaggerController = new SwaggerController();
        final String swaggerJson = swaggerController.apiDocumentation();

        assertNotNull(swaggerJson);
        assertFalse(swaggerJson.isEmpty());
        assertNotEquals(FileReader.FILE_ERROR_MESSAGE, swaggerJson);
        assertEquals(FileReader.contentFrom("./res/swagger/swagger.json"), swaggerJson);
    }

}