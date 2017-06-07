package br.eti.kinoshita.commons.exec;

import java.util.Collections;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.Executor;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.io.output.ByteArrayOutputStream;

public class Tests {

    private static long TIMEOUT_ONE_SECOND = 1000;
    private static long TIMEOUT_TEN_SECONDS = 10 * TIMEOUT_ONE_SECOND;
    private static long TIMEOUT_ONE_MINUTE = 60 * TIMEOUT_ONE_SECOND;
    private static long TIMEOUT_FIVE_MINUTES = 5 * TIMEOUT_ONE_MINUTE;
    private static long TIMEOUT_TEN_MINUTES = 10 * TIMEOUT_ONE_MINUTE;
    
    public static void main(String[] args) throws Exception {
        String cmd = "/tmp/test.sh";
        CommandLine cmdLine = CommandLine.parse("/bin/bash " + cmd);

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        ByteArrayOutputStream stderr = new ByteArrayOutputStream();
        PumpStreamHandler psh = new PumpStreamHandler(stdout, stderr);

        psh.setStopTimeout(TIMEOUT_FIVE_MINUTES);

        ExecuteWatchdog watchdog = new ExecuteWatchdog(TIMEOUT_TEN_MINUTES); // timeout in milliseconds

        Executor executor = new DefaultExecutor();
        executor.setExitValue(0);
        executor.setStreamHandler(psh);
        executor.setWatchdog(watchdog);

        int exitValue = executor.execute(cmdLine, Collections.emptyMap());
        System.out.println(exitValue);
    }
}
