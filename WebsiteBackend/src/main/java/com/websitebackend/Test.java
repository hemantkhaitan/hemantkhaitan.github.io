package com.websitebackend;

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

class SampleDemo implements Runnable {

    private Thread t;
    private String threadName;

    SampleDemo (String threadName){
        this.threadName = threadName;
    }

    public void run()
    {
        while (true)
            System.out.print(threadName);
    }

    public void start ()
    {
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

public class Test  {

    public static void main(String args[]) {

        SampleDemo A = new SampleDemo( "A");
        SampleDemo B = new SampleDemo( "B");

        B.start();
        A.start();
    }
}
