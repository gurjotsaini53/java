package Mutlithreading.ThreadLifeCyle.ProcessThreads;

public class Main {

    public static void main(String[] args) {

        Thread _processThread01 = new Thread(new ProcessThreads(), "Process Thread01");
        Thread _processThread02 = new Thread(new ProcessThreads(), "Process Thread02");
        Thread _processThread03 = new Thread(new ProcessThreads(), "Process Thread03");

    }
}
