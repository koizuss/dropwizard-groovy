import org.hibernate.validator.constraints.NotEmpty
import io.dropwizard.Configuration

class Conf extends Configuration {
    @NotEmpty
    String template
}
