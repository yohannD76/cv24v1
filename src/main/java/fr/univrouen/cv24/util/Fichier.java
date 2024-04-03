package fr.univrouen.cv24.util;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Fichier {

    public String loadFileXML() {
        Resource resource = new DefaultResourceLoader().getResource("smallCV.xml");

        try {
            Reader reader = new InputStreamReader(resource.getInputStream());
            return FileCopyUtils.copyToString(reader);
        } catch (IOException e) {
            return "ERREUR : " + e.getMessage();
        }
    }


}
