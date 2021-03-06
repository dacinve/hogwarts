package edu.tcu.cs.hogwartsartifactsonline.datainitializer;

import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactsonline.dao.WizardDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.domain.Wizard;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {

    private ArtifactDao artifactDao;
    private WizardDao wizardDao;

    public DBDataInitializer(ArtifactDao artifactDao, WizardDao wizardDao) {

        this.artifactDao = artifactDao;
        this.wizardDao = wizardDao;
    }

    @Override
    public void run(String... args) throws Exception {
        Artifact a1 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("The Deluminator, also referred to as a \"Put-Outer\", is a small magical device that looks like a cigarette lighter. It captures and stores a light source, like a streetlight, and can later be used to restore the light to its original place.");
        a1.setImageUrl("imageUrl");

        Artifact a2 = new Artifact();
        a2.setId("1250808601744904193");
        a2.setName("Invisiblitity Cloak");
        a2.setDescription("The Deluminator, also referred to as a \"Put-Outer\", is a small magical device that looks like a cigarette lighter. It captures and stores a light source, like a streetlight, and can later be used to restore the light to its original place.");
        a2.setImageUrl("imageUrl");

        Artifact a3 = new Artifact();
        a3.setId("1250808601744904192");
        a3.setName("Eler Wand");
        a3.setDescription("The Deluminator, also referred to as a \"Put-Outer\", is a small magical device that looks like a cigarette lighter. It captures and stores a light source, like a streetlight, and can later be used to restore the light to its original place.");
        a3.setImageUrl("imageUrl");

        Artifact a4 = new Artifact();
        a4.setId("1250808601744904194");
        a4.setName("The Marauder's Map");
        a4.setDescription("The Deluminator, also referred to as a \"Put-Outer\", is a small magical device that looks like a cigarette lighter. It captures and stores a light source, like a streetlight, and can later be used to restore the light to its original place.");
        a4.setImageUrl("imageUrl");

        Artifact a5 = new Artifact();
        a5.setId("1250808601744904195");
        a5.setName("The Sword of Gryffindor");
        a5.setDescription("The Deluminator, also referred to as a \"Put-Outer\", is a small magical device that looks like a cigarette lighter. It captures and stores a light source, like a streetlight, and can later be used to restore the light to its original place.");
        a5.setImageUrl("imageUrl");

        Artifact a6 = new Artifact();
        a6.setId("1250808601744904196");
        a6.setName("Ressurection Stone");
        a6.setDescription("The Deluminator, also referred to as a \"Put-Outer\", is a small magical device that looks like a cigarette lighter. It captures and stores a light source, like a streetlight, and can later be used to restore the light to its original place.");
        a6.setImageUrl("imageUrl");
//        artifactDao.save(a1);
//        artifactDao.save(a2);
//        artifactDao.save(a3);
//        artifactDao.save(a4);
//        artifactDao.save(a5);
//        artifactDao.save(a6);

        Wizard w1 = new Wizard();
        w1.setName("Albus Dumbledore");
        w1.addArtifact(a1);
        w1.addArtifact(a3);

        Wizard w2 = new Wizard();
        w2.setName("Harry Potter");
        w2.addArtifact(a2);
        w2.addArtifact(a4);

        Wizard w3 = new Wizard();
        w3.setName("Neville Longbottom");
        w3.addArtifact(a5);

        wizardDao.save(w1);
        wizardDao.save(w2);
        wizardDao.save(w3);
        //sinze a6 doesnt have an owner yet, need to save it explicitly here
        artifactDao.save(a6);
    }

}

