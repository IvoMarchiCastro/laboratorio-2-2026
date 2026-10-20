package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class ForjadorDeRunas implements EstrategiaDeMejora {
    private Artefacto unArtefacto;


    @Override
    public void mejorar(Artefacto unArtefacto){
        if(unArtefacto.getTipo().equals("Varita")){
            unArtefacto.incrementarPoder(15);
        }
    }

}
