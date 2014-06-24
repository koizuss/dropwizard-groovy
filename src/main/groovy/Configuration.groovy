import org.hibernate.validator.constraints.NotEmpty

class Configuration extends com.yammer.dropwizard.config.Configuration {
    @NotEmpty
    String template
}
