package lk.ijse.gdse68.assessment;

import lk.ijse.gdse68.assessment.config.Config;
import lk.ijse.gdse68.assessment.user.Kusal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;




public class AppInit {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Config.class);
        applicationContext.refresh();
        applicationContext.registerShutdownHook();

    }


}

