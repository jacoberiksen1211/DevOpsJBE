import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class Service {
    @GET
    public String getHello(){
        return "Hello REST caller";
    }
}