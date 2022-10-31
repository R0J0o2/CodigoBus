package be20001;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class BE20001 {

    public static void main(String[] args) {
        int izquierda[], derecha[], opcion, vacio = 0, ladoI, ladoD, cualLado, cualAsiento, lugar = 0;
        izquierda = new int[10];
        derecha = new int[10];
        String salida = "";
        boolean disponible = false, encontrado = false;
        JTextArea hoja = new JTextArea();

        for (ladoI = 0; ladoI < 10; ladoI++) {
            izquierda[ladoI] = vacio;
        }
        for (ladoD = 0; ladoD < 10; ladoD++) {
            derecha[ladoD] = vacio;
        }

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones\n1-Asignar asiento\n2-Mostrar bus"));

            if (opcion == 1) {
                for (ladoI = 0; ladoI < 10; ladoI++) {
                    for (ladoD = 0; ladoD < 10; ladoD++) {
                        if ((izquierda[ladoI] == 0 || izquierda[ladoI] == 1) && (derecha[ladoD] == 0 || derecha[ladoD] == 1)) {
                            disponible = true;
                        }
                    }
                }
                if (disponible = false) {
                    JOptionPane.showMessageDialog(null, "Todos los asientos han sido ocupados");
                } else if (disponible = true) {
                    cualLado = Integer.parseInt(JOptionPane.showInputDialog("Que lado desea sentarse\n1-Izquierda\n2-Derecha"));
                    if (cualLado == 1) {
                        salida = "";
                        for (ladoI = 0; ladoI < 10; ladoI++) {
                            salida = salida + (ladoI + 1) + "|" + izquierda[ladoI] + "\t";
                        }
                        salida = salida + "\nIngrese le numero de asiento que desea ocupar";
                        hoja.setText(salida);
                        cualAsiento = Integer.parseInt(JOptionPane.showInputDialog(hoja));
                        for (ladoI = 0; ladoI < 10; ladoI++) {
                            if (izquierda[ladoI] == 2) {
                                encontrado = false;

                            } else if (ladoI == (cualAsiento - 1)) {
                                encontrado = true;

                            }
                        }

                        if (encontrado = true) {
                            izquierda[ladoI] = izquierda[ladoI] + 1;
                        } else if (encontrado = false) {
                            JOptionPane.showMessageDialog(null, "Los asientos han sido ocupados");
                        }
                    } else if (cualLado == 2) {
                        salida = "";
                        for (ladoD = 0; ladoD < 10; ladoD++) {
                            salida = salida + (ladoD + 1) + "|" + derecha[ladoD] + "\t";
                        }
                        salida = salida + "\nIngrese le numero de asiento que desea ocupar";
                        hoja.setText(salida);
                        cualAsiento = Integer.parseInt(JOptionPane.showInputDialog(hoja));
                        for (ladoD = 0; ladoD < 10; ladoD++) {
                            if (derecha[ladoD] == 2) {
                                encontrado = false;

                            } else if (ladoD == (cualAsiento - 1)) {
                                encontrado = true;

                            }
                        }

                        if (encontrado = true) {
                            derecha[ladoD] = derecha[ladoD] + 1;
                        } else if (encontrado = false) {
                            JOptionPane.showMessageDialog(null, "Los asientos han sido ocupados");
                        }
                    } else if (cualLado > 2) {
                        JOptionPane.showMessageDialog(null, "Error.\nLa respuesta que ha ingresado es incorrecta");
                    }
                }

            } else if (opcion == 2) {
                salida = "Mostrando bus\nIzquierda\n";
                for (ladoI = 0; ladoI < 10; ladoI++) {
                    salida = salida + (ladoI + 1) + "|" + izquierda[ladoI] + "\t";
                }
                salida = salida + "\nDerecha\n";
                for (ladoD = 0; ladoD < 10; ladoD++) {
                    salida = salida + (ladoD + 1) + "|" + derecha[ladoD] + "\t";
                }

                hoja.setText(salida);
                JOptionPane.showMessageDialog(null, hoja);

            }
        } while (opcion == 1 || opcion == 2);

    }

}
