
package bancodedados;


public class ClassePrincipal {

  
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void rum(){
                bancodedados.conexaobanco();
                new Login_Scream().setVisible(true);
            }
        });
        /*  java.awt.EventQueue.invokeLater(new Runnable() {}
                public void rum(){
                   conexaobanco.prencherParaTeste();
                   new Login_Scream().setVisible(true);
                try{
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            } 
    );}
    }*/
    }
    
}
