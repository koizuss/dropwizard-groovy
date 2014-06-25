import io.dropwizard.Application
import io.dropwizard.Configuration
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import io.dropwizard.assets.AssetsBundle

class MainService extends Application<Conf> {
    static main(args) {
        new MainService().run(args)
    }

    void initialize(Bootstrap bootstrap) {
        bootstrap.addBundle(new AssetsBundle())
    }

    void run(Conf conf, Environment env) {
        final greet = new GreetResouce(template: conf.template)
        env.jersey().register greet
    }
}
