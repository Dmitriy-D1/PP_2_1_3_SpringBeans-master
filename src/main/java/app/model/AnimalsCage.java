package app.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private static Logger logger = LoggerFactory.getLogger(AnimalsCage.class);

    private final Animal animal;

    private final Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal, Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public Timer getTimer(){
        return this.timer;
    }

    public void whatAnimalSay() {
        logger.info("Say:");
        logger.info(animal.toString());
        logger.info("At:");
        logger.info(timer.getTime().toString());
        logger.info("________________________");
    }
}
