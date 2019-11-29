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
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;
import org.japo.java.libraries.UtilesPrimitivos;
import org.japo.java.libraries.UtilesEntrada;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public final class App {

    public final void launchApp() {

        //CABECERA
        System.out.println("VALIDACIÓN DE DNI ");
        System.out.println("================= ");

        //MUESTRA DNI
        System.out.printf("DNI ......: %d%c%n", UtilesPrimitivos.DNI_NUM,
                UtilesPrimitivos.DNI_CTR);

        //SEPARADOR
        System.out.println("---");

        //Analisis
        boolean dniOK = UtilesPrimitivos.validar(UtilesPrimitivos.DNI_NUM,
                UtilesPrimitivos.DNI_CTR);

        //MUESTRA
        System.out.printf("Valides ..: %s%n", dniOK ? "Correcto" : "incorrecto");
    }

}
