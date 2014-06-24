import org.hibernate.validator.constraints.NotEmpty
import com.yammer.dropwizard.config.Configuration

class Conf extends Configuration {
    @NotEmpty
    String template
}
