import com.yammer.dropwizard.Service
import com.yammer.dropwizard.config.Bootstrap
import com.yammer.dropwizard.config.Configuration
import com.yammer.dropwizard.config.Environment

class MainService extends Service<Conf> {
    static main(args) {
        new MainService().run(args)
    }

    void initialize(Bootstrap bootstrap) {}
    void run(Conf conf, Environment env) {
        // env.addResource(new GreetResouce(template: conf.template))
        env.addResource(new GreetResouce(template: conf.template))
    }
}
