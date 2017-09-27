package com.paratusSoftware.carTracker.documentation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/swagger")
public class SwaggerController {

    @RequestMapping(method = RequestMethod.GET, path = "/json")
    public String apiDocumentation(){
        return swaggerJson();
    }

    private String swaggerJson(){
        return "{\n" +
                "  \"swagger\": \"2.0\",\n" +
                "  \"info\": {\n" +
                "    \"description\": \"a logger an aggregator for my car's data\",\n" +
                "    \"version\": \"0.0.1\",\n" +
                "    \"title\": \"Paratus Car Tracker\",\n" +
                "    \"termsOfService\": \"https://google.com\",\n" +
                "    \"contact\": {\n" +
                "      \"name\": \"N/A\"\n" +
                "    },\n" +
                "    \"license\": {\n" +
                "      \"name\": \"N/A\",\n" +
                "      \"url\": \"https://google.com\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"host\": \"mileage-tracker.cfapps.io\",\n" +
                "  \"basePath\": \"/\",\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"name\": \"mileage-controller\",\n" +
                "      \"description\": \"Mileage Controller\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"paths\": {\n" +
                "    \"/mileage/add\": {\n" +
                "      \"post\": {\n" +
                "        \"tags\": [\n" +
                "          \"mileage-controller\"\n" +
                "        ],\n" +
                "        \"summary\": \"addMileage\",\n" +
                "        \"operationId\": \"addMileageUsingPOST\",\n" +
                "        \"consumes\": [\n" +
                "          \"application/json\"\n" +
                "        ],\n" +
                "        \"produces\": [\n" +
                "          \"*/*\"\n" +
                "        ],\n" +
                "        \"parameters\": [\n" +
                "          {\n" +
                "            \"in\": \"body\",\n" +
                "            \"name\": \"mileage\",\n" +
                "            \"description\": \"mileage\",\n" +
                "            \"required\": true,\n" +
                "            \"schema\": {\n" +
                "              \"$ref\": \"#/definitions/Mileage\"\n" +
                "            }\n" +
                "          }\n" +
                "        ],\n" +
                "        \"responses\": {\n" +
                "          \"200\": {\n" +
                "            \"description\": \"OK\"\n" +
                "          },\n" +
                "          \"201\": {\n" +
                "            \"description\": \"Created\"\n" +
                "          },\n" +
                "          \"401\": {\n" +
                "            \"description\": \"Unauthorized\"\n" +
                "          },\n" +
                "          \"403\": {\n" +
                "            \"description\": \"Forbidden\"\n" +
                "          },\n" +
                "          \"404\": {\n" +
                "            \"description\": \"Not Found\"\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"/mileage/all\": {\n" +
                "      \"get\": {\n" +
                "        \"tags\": [\n" +
                "          \"mileage-controller\"\n" +
                "        ],\n" +
                "        \"summary\": \"allMileages\",\n" +
                "        \"operationId\": \"allMileagesUsingGET\",\n" +
                "        \"consumes\": [\n" +
                "          \"application/json\"\n" +
                "        ],\n" +
                "        \"produces\": [\n" +
                "          \"*/*\"\n" +
                "        ],\n" +
                "        \"parameters\": [\n" +
                "          {\n" +
                "            \"name\": \"latitude\",\n" +
                "            \"in\": \"query\",\n" +
                "            \"description\": \"latitude\",\n" +
                "            \"required\": false,\n" +
                "            \"type\": \"integer\",\n" +
                "            \"format\": \"int64\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"longitude\",\n" +
                "            \"in\": \"query\",\n" +
                "            \"description\": \"longitude\",\n" +
                "            \"required\": false,\n" +
                "            \"type\": \"integer\",\n" +
                "            \"format\": \"int64\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"mileage\",\n" +
                "            \"in\": \"query\",\n" +
                "            \"description\": \"mileage\",\n" +
                "            \"required\": false,\n" +
                "            \"type\": \"number\",\n" +
                "            \"format\": \"float\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"responses\": {\n" +
                "          \"200\": {\n" +
                "            \"description\": \"OK\",\n" +
                "            \"schema\": {\n" +
                "              \"type\": \"array\",\n" +
                "              \"items\": {\n" +
                "                \"$ref\": \"#/definitions/Mileage\"\n" +
                "              }\n" +
                "            }\n" +
                "          },\n" +
                "          \"401\": {\n" +
                "            \"description\": \"Unauthorized\"\n" +
                "          },\n" +
                "          \"403\": {\n" +
                "            \"description\": \"Forbidden\"\n" +
                "          },\n" +
                "          \"404\": {\n" +
                "            \"description\": \"Not Found\"\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"/mileage/reflect\": {\n" +
                "      \"get\": {\n" +
                "        \"tags\": [\n" +
                "          \"mileage-controller\"\n" +
                "        ],\n" +
                "        \"summary\": \"reflectMileage\",\n" +
                "        \"operationId\": \"reflectMileageUsingGET\",\n" +
                "        \"consumes\": [\n" +
                "          \"application/json\"\n" +
                "        ],\n" +
                "        \"produces\": [\n" +
                "          \"*/*\"\n" +
                "        ],\n" +
                "        \"parameters\": [\n" +
                "          {\n" +
                "            \"name\": \"latitude\",\n" +
                "            \"in\": \"query\",\n" +
                "            \"description\": \"latitude\",\n" +
                "            \"required\": false,\n" +
                "            \"type\": \"integer\",\n" +
                "            \"format\": \"int64\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"longitude\",\n" +
                "            \"in\": \"query\",\n" +
                "            \"description\": \"longitude\",\n" +
                "            \"required\": false,\n" +
                "            \"type\": \"integer\",\n" +
                "            \"format\": \"int64\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"mileage\",\n" +
                "            \"in\": \"query\",\n" +
                "            \"description\": \"mileage\",\n" +
                "            \"required\": false,\n" +
                "            \"type\": \"number\",\n" +
                "            \"format\": \"float\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"responses\": {\n" +
                "          \"200\": {\n" +
                "            \"description\": \"OK\",\n" +
                "            \"schema\": {\n" +
                "              \"$ref\": \"#/definitions/Mileage\"\n" +
                "            }\n" +
                "          },\n" +
                "          \"401\": {\n" +
                "            \"description\": \"Unauthorized\"\n" +
                "          },\n" +
                "          \"403\": {\n" +
                "            \"description\": \"Forbidden\"\n" +
                "          },\n" +
                "          \"404\": {\n" +
                "            \"description\": \"Not Found\"\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"definitions\": {\n" +
                "    \"Mileage\": {\n" +
                "      \"properties\": {\n" +
                "        \"latitude\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int64\"\n" +
                "        },\n" +
                "        \"longitude\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int64\"\n" +
                "        },\n" +
                "        \"mileage\": {\n" +
                "          \"type\": \"number\",\n" +
                "          \"format\": \"float\"\n" +
                "        },\n" +
                "        \"timestamp\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"format\": \"date-time\"\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }

}
