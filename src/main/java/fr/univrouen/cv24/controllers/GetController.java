package fr.univrouen.cv24.controllers;

import fr.univrouen.cv24.model.TestCV;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import fr.univrouen.cv24.util.Fichier;


@RestController
public class GetController {

    Fichier fichier = new Fichier();
    @GetMapping("/resume")
    public String getListCVinXML() {
        return "Envoi de la liste des CV";
    }

    @GetMapping("/cvid")
    public String getCVinXML( @RequestParam(value = "texte") String texte) {
        return ("Détail du CV n°" + texte);
    }

    @GetMapping("/test")
    public String getCVinXML( @RequestParam(value = "id") Integer id,  @RequestParam(value = "titre") String titre) {
        return (String.format("Test :<br>id = %d<br>titre = %s", id, titre));
    }

    @GetMapping("/testfic")
    public String getSmallCVFileContent() {
        return (fichier.loadFileXML());
    }

    @RequestMapping(value="/testxml", produces= MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody TestCV getXML() {
        TestCV cv = new TestCV("HAMILTON","Margaret","1969/07/21",
            "Appollo11@nasa.us");
        return cv;
    }


}
