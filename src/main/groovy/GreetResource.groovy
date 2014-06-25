import javax.ws.rs.*
import javax.ws.rs.core.Context
import javax.servlet.http.HttpServletRequest

@Path('/greet')
class GreetResouce {
    def template

    @Context
    HttpServletRequest req

    @GET
    def greet() {
        req.headerNames.each {
            println "$it: ${req.getHeaders(it).collect()}"
        }
        req.parameterNames.each {
            println "$it: ${req.getParameterValues(it)}"
        }
        return String.format(template, 'dropwizard')
    }
}
