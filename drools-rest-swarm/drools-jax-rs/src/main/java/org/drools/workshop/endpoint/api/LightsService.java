package org.drools.workshop.endpoint.api;


import java.util.List;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.drools.workshop.model.*;


@Path("lights")
public interface LightsService {

	@POST
	@Consumes("application/json")
    @Produces("application/json")
    @Path("/lightswitch/create")
    public Lightswitch create(@NotNull Lightswitch lightswitch);

	@GET
    @Produces("application/json")
    @Path("/lightswitch")
    public List<Lightswitch> getLightswitchs();

	@POST
	@Consumes("application/json")
    @Produces("application/json")
    @Path("/availablelight/create")
    public AvailableLight create(@NotNull AvailableLight avalableLight);

	@GET
    @Produces("application/json")
    @Path("/availablelight")
    public List<AvailableLight> getAvailableLights();

	@POST
	@Consumes("application/json")
    @Produces("application/json")
    @Path("/absencesensor/create")
    public AbsenceSensor create(@NotNull AbsenceSensor absenceSensor);

	@GET
    @Produces("application/json")
    @Path("/absencesensor")
    public List<AbsenceSensor> getAbsenceSensors();

    @POST
	@Consumes("application/json")
    @Produces("application/json")
    @Path("/aula/create")
    public Aula create(@NotNull Aula aula);

	@GET
    @Produces("application/json")
    @Path("/aula")
    public List<Aula> getAulas();

}



