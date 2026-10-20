package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class AlquimistaExperto implements EstrategiaDeMejora{
    private Artefacto unArtefacto;


    @Override
    public void mejorar(Artefacto unArtefacto){
        if(unArtefacto.getTipo().equals("Poción") && unArtefacto.getPoder()<= 80){
            unArtefacto.incrementarPoder(20);
        }
    }

}

