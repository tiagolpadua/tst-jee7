package org.tst;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("test")
public class TestResource {

	@GET
	@Path("/0")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test0() {
		return Response.ok().entity("Test 0 Response").build();
	}
	
	@GET
	@Path("/1")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test1() {
		SimpleContainer sc = new SimpleContainer();
		sc.setData("Foo");
		return Response.ok().entity(sc).build();
	}
	
	@GET
	@Path("/2")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test2() {
		ParametrizedContainer<String> pc = new ParametrizedContainer<String>();
		pc.setData("Foo");
		return Response.ok().entity(pc).build();
	}
	
	@GET
	@Path("/3")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test3() {
		SimpleNestedContainer nc = new SimpleNestedContainer();
		SimpleContainer sc = new SimpleContainer();
		sc.setData("foo");
		nc.setData(sc);
		return Response.ok().entity(nc).build();
	}
	
	@GET
	@Path("/4")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test4() {
		ParametrizedContainer<SimpleContainer> pc = new ParametrizedContainer<SimpleContainer>();
		SimpleContainer sc = new SimpleContainer();
		sc.setData("foo");
		pc.setData(sc);
		return Response.ok().entity(pc).build();
	}
}
