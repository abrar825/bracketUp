package com.amc.bracketup;

import com.amc.bracketup.entity.Team;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BracketupApplication {

    public static void main(String[] args) {
        SpringApplication.run(BracketupApplication.class, args);

        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet("https://v3.football.api-sports.io/standings?league=1&season=2022");
            httpGet.setHeader("x-rapidapi-host", "v3.football.api-sports.io");
            httpGet.setHeader("x-rapidapi-key", "dd5c4e69ad727fd94a3af9a9244f0553");

            HttpResponse response = client.execute(httpGet);


            ObjectMapper objectMapper = new ObjectMapper();
            ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();

            String jsonResponse = EntityUtils.toString(response.getEntity());
            JsonNode jsonNode = objectMapper.readTree(jsonResponse);
            ArrayNode responseNode = (ArrayNode) jsonNode.get("response");

            String responseText;
            JsonNode node = responseNode.get(0);
            ArrayNode standingsNode = (ArrayNode) node.get("league").get("standings");

            for (JsonNode groupNode : standingsNode) {
                System.out.println(groupNode.toPrettyString());
            }

//            String responseB = objectWriter.writeValueAsString(objectMapper.readTree(ex));
//            System.out.println(responseB);




        } catch (Exception e) {
            e.printStackTrace();
        }

    }






}
