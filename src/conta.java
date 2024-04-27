import javax.swing.JOptionPane;

public class conta {
    public static void main(String[] args) throws Exception {

        count c = new count();
        String n, s;

        n = JOptionPane.showInputDialog("INFORME SEU NOME: ");

        if (n.equals(c.getnome())) {
            JOptionPane.showMessageDialog(null, "NOME CORRETO!");
            System.out.println("NOME CORRETO!");
        } else {
            while (n != c.getnome()) {
                if (n.equals(c.getnome())) {
                    JOptionPane.showMessageDialog(null, "NOME CORRETO!");
                    System.out.println("NOME CORRETO!");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "NOME INCORRETO, TENTE NOVAMENTE!");
                    n = JOptionPane.showInputDialog("INFORME SEU NOME: ");
                }
            }
        }

        s = JOptionPane.showInputDialog("INFORME SUA SENHA: ");
        int s1 = Integer.parseInt(s);

        if (s1 == c.getsenha()) {
            JOptionPane.showMessageDialog(null, "SENHA CORRETA!");
            System.out.println("SENHA CORRETA");
        } else {
            while (s1 != c.getsenha()) {
                if (s1 == c.getsenha()) {
                    JOptionPane.showMessageDialog(null, "SENHA CORRETA!");
                    System.out.println("SENHA CORRETA!");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "SENHA INCORRETA, TENTE NOVAMENTE!");
                    s = JOptionPane.showInputDialog("INFORME SUA SENHA: ");
                    s1 = Integer.parseInt(s);
                    if (s1 == c.getsenha()) {
                        JOptionPane.showMessageDialog(null, "SENHA CORRETA!");
                        System.out.println("SENHA CORRETA!");
                        break;
                    }
                }
            }
        }

    }
}
