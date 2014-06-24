import com.yammer.dropwizard.Service
import com.yammer.dropwizard.config.Bootstrap
import com.yammer.dropwizard.config.Configuration
import com.yammer.dropwizard.config.Environment

class MainService extends Service<Configuration> {
    static main(args) {
        new MainService().run(args)
    }

    void initialize(Bootstrap bootstrap) {}
    void run(Configuration conf, Environment env) {}
}
