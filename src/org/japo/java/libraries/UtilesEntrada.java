/*
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class UtilesEntrada {

    //Scan
    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    //constantes
    public static final String MSG_USR = "Introducir número ....: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";
    public static final String MSG_OUT = "Número introducido ...: ";

    //Constantes 
    public static final String MSG_A = "Introduzca valor de a ";
    public static final String MSG_B = "Introduzca valor de b ";
    public static final String MSG_C = "Introduzca valor de c ";

    public static final double obtener(String msgUsr, String msgErr) {
        double numero = 0;
        boolean errorOK = true;
        do {
            try {
                System.out.print(msgUsr);
                numero = SCN.nextDouble();
                errorOK = false;
            } catch (Exception e) {
                System.out.println(msgErr);
                System.out.println("---");
            } finally {
                SCN.nextLine();
            }
        } while (errorOK);

        return numero;

    }

    public static final int leerNumero(String msgUsr, String msgErr) {
        return (int) obtener(msgUsr, msgErr);

    }

}
