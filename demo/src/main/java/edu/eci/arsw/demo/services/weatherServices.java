package edu.eci.arsw.demo.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.demo.connection.Connection;
import edu.eci.arsw.demo.model.City;
import java.util.HashMap;

@Service
public class weatherServices {

    public static HashMap<String, String> cities;

    public String getWeather(String name) throws IOException {
        /*if (cities.get(name) == null) {
            String consulta;
            Connection.setCity(name);
            consulta = Connection.connection();
            cities.put(name, consulta);
            return consulta;

        } else {
            return cities.get(name);
        }*/

        String consulta;
        Connection.setCity(name);
        consulta = Connection.connection();
        return consulta;
    }

}
