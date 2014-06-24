import javax.ws.rs.*

@Path('/greet')
class GreetResouce {
    def template

    @GET
    def greet() {
        return String.format(template, 'dropwizard')
    }
}
