package src;

import java.io.PrintWriter;
import java.lang.String;


/**
 * Implementation of the Runqueue interface using an Ordered Array.
 *
 * Your task is to complete the implementation of this class.
 * You may add methods and attributes, but ensure your modified class compiles and runs.
 *
 * @author Sajal Halder, Minyi Li, Jeffrey Chan
 */
public class OrderedArrayRQ implements Runqueue {

    /**
     * Constructs empty queue
     */
    public OrderedArrayRQ() {
        // Implement Me

    }  // end of OrderedArrayRQ()


    @Override
    public void enqueue(String procLabel, int vt) {
        // Implement me

    } // end of enqueue()


    @Override
    public String dequeue() {
        // Implement me

        return ""; // placeholder,modify this
    } // end of dequeue()


    @Override
    public boolean findProcess(String procLabel){
        // Implement me

        return false; // placeholder, modify this
    } // end of findProcess()


    @Override
    public boolean removeProcess(String procLabel) {
        // Implement me

        return false; // placeholder, modify this
    } // end of removeProcess()


    @Override
    public int precedingProcessTime(String procLabel) {
        // Implement me

        return -1; // placeholder, modify this
    }// end of precedingProcessTime()


    @Override
    public int succeedingProcessTime(String procLabel) {
        // Implement me

        return -1; // placeholder, modify this
    } // end of precedingProcessTime()


    @Override
    public void printAllProcesses(PrintWriter os) {
        //Implement me

    } // end of printAllProcesses()


    private class Proc {

        protected String procLabel;
        protected int vt;
        protected int priority;

        /**
         * Reference to next node.
         */


        public Proc(String label, int vruntime) {
            procLabel = label;
            vt = vruntime;
        }

        public String getProcLabel() {
            return procLabel;
        }

        public void setProcLabel(String procLabel) {
            this.procLabel = procLabel;
        }

        public int getVt() {
            return vt;
        }

        public void setVt(int vt) {
            this.vt = vt;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }
    }
} // end of class OrderedArrayRQ
