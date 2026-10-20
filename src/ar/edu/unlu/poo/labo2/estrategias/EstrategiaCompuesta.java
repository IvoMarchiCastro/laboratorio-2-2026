package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

import java.util.ArrayList;


public class EstrategiaCompuesta implements EstrategiaDeMejora {

    private arraylist<EstrategiaDeMejora> coleccionEstrategias;
    public void EstrategiaCompuesta(Artefacto unArtefacto, EstrategiaDeMejora...estrategias) {
        estrategias = new ArrayList<>;
        for(EstrategiaDeMejora unaEstrategia : estrategias){ this.coleccionEstrategias.add(unaEstrategia);}
    }
    @Override
    public void mejorar(Artefacto unArtefacto ){
            for(EstrategiaDeMejora unaEstrategia:this.coleccionEstrategias){
                unArtefacto.incrementarPoder();
            }

    }
}
