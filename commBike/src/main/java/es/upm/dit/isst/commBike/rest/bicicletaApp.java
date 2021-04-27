package es.upm.dit.isst.commBike.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")

public class bicicletaApp extends ResourceConfig {

        public bicicletaApp() {

                packages("es.upm.dit.isst.commBike.rest");

        }

}