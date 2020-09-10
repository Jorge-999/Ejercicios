/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;

/**
 *
 * @author usuario
 */
import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class comportamiento extends Behaviour
{
    public void action()
            {
                System.out.println("Hola mundo");   
            }
            public boolean done()
            {
                return true;
            }
    
    
    
}

