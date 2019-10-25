/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
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
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) throws InterruptedException {
        System.out.print("¿Dispone usted de un permiso de circulación?: ");

        try {
            boolean permisoOK = SCN.nextBoolean();
            System.out.println("Usted dijo: " + permisoOK + ".");
            System.out.println("¡Anotado!");
        } catch (Exception e) {
            System.out.printf("%nEl valor introducido no es válido.%n"
                    + "Por favor, si tiene, escriba \"true\".%n"
                    + "Si no tiene, escriba \"false\".%n%n");
        }
    }
}
