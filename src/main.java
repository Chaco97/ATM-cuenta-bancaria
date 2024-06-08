import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {

        double cuentaTotal = 0;
        String nombreDeUsuario = "Marcos";
        String Contraseña = "123marcos";

        boolean opcionCorrecta = false;

        while (!opcionCorrecta) {
            JOptionPane.showMessageDialog(null, "Inicio de Sesion");
            String user = JOptionPane.showInputDialog("Usuario");
            String pass = JOptionPane.showInputDialog("Contraseña");

            if (user.equals(nombreDeUsuario) && pass.equals(Contraseña)) {

                JOptionPane.showMessageDialog(null, "Welcome");
                opcionCorrecta=true;
                boolean salir = false;
                while (!salir) {
                    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una Opcion" + "\n" +
                            "1- Ingreso de Dinero" + "\n" +
                            "2- Retiro de Dinero" + "\n" +
                            "3- Cuenta Bancaria" + "\n" +
                            "4- Salir"));
                    switch (opcion) {
                        case 1:
                            double ingresoDinero = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la Cantidad de Dinero a Ingresar"));
                            cuentaTotal = cuentaTotal + ingresoDinero;
                            break;

                        case 2:
                            double retiro = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el monto a retirar"));
                            if (cuentaTotal > retiro) {
                                cuentaTotal = cuentaTotal - retiro;
                                JOptionPane.showMessageDialog(null, "Retiro con exito");
                            } else {
                                JOptionPane.showMessageDialog(null, "El Retiro no puede exceder el monto");
                            }
                            break;


                        case 3:
                            JOptionPane.showMessageDialog(null, "Su Cuenta es de " + cuentaTotal);
                            break;

                        case 4:
                            JOptionPane.showMessageDialog(null, "Hasta Pronto");
                            salir = true;
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Error Contraseña o Usuario Incorrecto");

            }

        }

    }

}


