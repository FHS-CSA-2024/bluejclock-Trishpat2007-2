package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        System.out.println("TestingClock Display");
        ClockDisplay test1= new ClockDisplay();
        String test1output= test1.getTime();
        System.out.println("/tEmpty Con.Test-" + test1output);
        
        ClockDisplay test2= new ClockDisplay(2,45);
        String test2output=test2.getTime();
        System.out.println("/t Arg Con. Test-"+ test2output);
        
        test2.setTime(5,1);
        String test3Output= test2.getTime();
        System.out.println("/t Set time test-"+test3Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3,32);
        String tickTest1Output=tickTest1.getTime();
        System.out.println("/tTickTest1 Before increment-"+tickTest1Output);
        tickTest1.timeTick();
        tickTest1Output=tickTest1.getTime();
        System.out.println("/tTickTest1 after increment-"+tickTest1Output);
        
        ClockDisplay tickTest2 = new ClockDisplay(3,9);
        String tickTest2Output=tickTest2.getTime();
        System.out.println("/tTickTest2 Before increment-"+tickTest2Output);
        tickTest2.timeTick();
        tickTest2Output=tickTest2.getTime();
        System.out.println("/tTickTest2 after increment-"+tickTest2Output);
        
        ClockDisplay tickTest3 = new ClockDisplay(1,59);
        String tickTest3Output=tickTest3.getTime();
        System.out.println("/tTickTest3 Before increment-"+tickTest3Output);
        tickTest3.timeTick();
        tickTest3Output=tickTest3.getTime();
        System.out.println("/tTickTest3 after increment-"+tickTest3Output);
        
        ClockDisplay tickTest4 = new ClockDisplay(9,59);
        String tickTest4Output=tickTest4.getTime();
        System.out.println("/tTickTest4 Before increment-"+tickTest4Output);
        tickTest4.timeTick();
        tickTest4Output=tickTest4.getTime();
        System.out.println("/tTickTest4 after increment-"+tickTest4Output);
        
        ClockDisplay tickTest5 = new ClockDisplay(23,59);
        String tickTest5Output=tickTest5.getTime();
        System.out.println("/tTickTest5 Before increment-"+tickTest5Output);
        tickTest5.timeTick();
        tickTest5Output=tickTest5.getTime();
        System.out.println("/tTickTest5 after increment-"+tickTest5Output);
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        System.out.println("TestingClockSeconds Display");
        ClockDisplaySeconds test4= new ClockDisplaySeconds();
        String test4output= test4.getTime();
        System.out.println("/tEmpty Con.Test-" + test4output);
        
        ClockDisplaySeconds test5= new ClockDisplaySeconds(2,45,26);
        String test5output=test5.getTime();
        System.out.println("/t Arg Con. Test-"+ test5output);
        
        test5.setTime(5,1,8);
        String test6Output= test5.getTime();
        System.out.println("/t Set time test-"+test6Output);
        
        ClockDisplaySeconds tickTest6 = new ClockDisplaySeconds(3,32,59);
        String tickTest6Output=tickTest6.getTime();
        System.out.println("/tTickTest6 Before increment-"+tickTest6Output);
        tickTest6.timeTick();
        tickTest6Output=tickTest6.getTime();
        System.out.println("/tTickTest6 after increment-"+tickTest6Output);
        
        ClockDisplaySeconds tickTest7 = new ClockDisplaySeconds(1,0,59);
        String tickTest7Output=tickTest7.getTime();
        System.out.println("/tTickTest7 Before increment-"+tickTest7Output);
        tickTest7.timeTick();
        tickTest7Output=tickTest7.getTime();
        System.out.println("/tTickTest7 after increment-"+tickTest7Output);
        
        ClockDisplaySeconds tickTest8 = new ClockDisplaySeconds(1,59,59);
        String tickTest8Output=tickTest8.getTime();
        System.out.println("/tTickTest8 Before increment-"+tickTest8Output);
        tickTest8.timeTick();
        tickTest8Output=tickTest8.getTime();
        System.out.println("/tTickTest8 after increment-"+tickTest8Output);
        
        ClockDisplaySeconds tickTest9 = new ClockDisplaySeconds(23,59,59);
        String tickTest9Output=tickTest9.getTime();
        System.out.println("/tTickTest9 Before increment-"+tickTest9Output);
        tickTest9.timeTick();
        tickTest9Output=tickTest9.getTime();
        System.out.println("/tTickTest9 after increment-"+tickTest9Output);
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        
        
    }
}
