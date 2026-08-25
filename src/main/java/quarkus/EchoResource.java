package quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/greet")
public class EchoResource {

    @GET
    public String greet(){
        return "Hello";
    }

    @GET
    @Path("/morning")
    public String greetGoodMorning() {
        return "Hello, good morning";
    }

    @GET
    @Path("/afternoon")
    public String greetGoodAfternoon() {
        return "Hello, good afternoon";
    }

    @GET
    @Path("/night")
    public String greetGoodNight() {
        return "Hello, good evening";
    }

}
