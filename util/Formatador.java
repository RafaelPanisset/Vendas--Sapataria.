/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Cliente
 */
public class Formatador {

    public double converterVirgulaParaPonto(String pString) {
        String retorno = new String();

        for (int i = 0; i < pString.length(); i++) {
            if (pString.charAt(i) == ',') {
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }

}
