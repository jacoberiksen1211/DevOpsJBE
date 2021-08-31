import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class Service {

    @Path("/hello")
    @GET
    public String getHello(){
        return "Hello REST caller";
    }

    @Path("/bye")
    @GET
    public String getBye(){
        return "Goodbye REST caller";
    }
}
