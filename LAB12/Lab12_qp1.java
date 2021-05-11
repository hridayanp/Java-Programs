/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to implement multi-threading.
*/

/**
 * ALGORITHM:
 * We create three threads namely A, B and C by extending the Thread class only.
 * We then create a for loop to display the number 1 to 100 in all the threads.
 * We then set the priority of Thread B as maximum.
 * We then instantiate all the threads inside the main class.
*/

class ThreadA extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("i= "+ i);
        }
        System.out.println("\nExit from ThreadA");
    }
}
class ThreadB extends Thread{
    public void run(){
        for(int j=0; j<=100; j++){
            System.out.println("j= "+ j);
        }
        System.out.println("\nExit from ThreadB");
    }
}
class ThreadC extends Thread{
    public void run(){
        for(int k=0; k<=100; k++){
            System.out.println("k= "+ k);
        }
        System.out.println("\nExit from ThreadC");
    }
}
class Lab12_qp1{
    public static void main(String args[]) {
        ThreadA obj1= new ThreadA();
        ThreadB obj2= new ThreadB();
        ThreadC obj3= new ThreadC();
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}

/*
 *OUTPUT:
k= 0
k= 1 
i= 0 
j= 0 
i= 1 
k= 2 
k= 3 
i= 2 
i= 3 
i= 4 
i= 5 
i= 6 
i= 7 
i= 8 
i= 9 
i= 10
i= 11
i= 12
i= 13
i= 14
i= 15
i= 16
i= 17
j= 1 
i= 18
k= 4 
i= 19
j= 2
i= 20
k= 5
i= 21
j= 3
i= 22
k= 6
i= 23
j= 4
i= 24
i= 25
k= 7
i= 26
j= 5
i= 27
k= 8
i= 28
j= 6
i= 29
k= 9
i= 30
j= 7
i= 31
k= 10
i= 32
j= 8
i= 33
k= 11
i= 34
j= 9
i= 35
k= 12
i= 36
j= 10
i= 37
k= 13
i= 38
j= 11
i= 39
k= 14
i= 40
j= 12
i= 41
k= 15
i= 42
j= 13
i= 43
k= 16
i= 44
j= 14
i= 45
k= 17
i= 46
j= 15
i= 47
k= 18
i= 48
j= 16
i= 49
k= 19
i= 50
j= 17
i= 51
k= 20
i= 52
j= 18
i= 53
k= 21
i= 54
j= 19
i= 55
k= 22
i= 56
j= 20
i= 57
k= 23
i= 58
j= 21
i= 59
k= 24
i= 60
j= 22
i= 61
k= 25
i= 62
j= 23
i= 63
k= 26
i= 64
j= 24
i= 65
k= 27
i= 66
j= 25
i= 67
k= 28
i= 68
j= 26
i= 69
k= 29
i= 70
j= 27
i= 71
i= 72
i= 73
k= 30
i= 74
j= 28
i= 75
k= 31
i= 76
j= 29
i= 77
k= 32
i= 78
j= 30
i= 79
k= 33
i= 80
j= 31
i= 81
k= 34
i= 82
j= 32
i= 83
k= 35
i= 84
j= 33
i= 85
k= 36
i= 86
j= 34
i= 87
k= 37
i= 88
j= 35
i= 89
k= 38
i= 90
j= 36
i= 91
k= 39
i= 92
j= 37
i= 93
k= 40
k= 41
i= 94
j= 38
i= 95
i= 96
i= 97
k= 42
i= 98
j= 39
i= 99
k= 43
i= 100
j= 40

Exit from ThreadA
k= 44
j= 41
k= 45
k= 46
j= 42
j= 43
k= 47
j= 44
k= 48
j= 45
k= 49
j= 46
k= 50
j= 47
k= 51
j= 48
k= 52
j= 49
k= 53
j= 50
k= 54
j= 51
k= 55
j= 52
j= 53
k= 56
j= 54
k= 57
j= 55
k= 58
j= 56
k= 59
j= 57
k= 60
j= 58
k= 61
j= 59
k= 62
j= 60
k= 63
j= 61
k= 64
j= 62
j= 63
k= 65
j= 64
k= 66
k= 67
j= 65
k= 68
j= 66
j= 67
j= 68
k= 69
j= 69
k= 70
j= 70
k= 71
j= 71
k= 72
j= 72
k= 73
j= 73
k= 74
j= 74
k= 75
j= 75
j= 76
k= 76
j= 77
j= 78
k= 77
j= 79
k= 78
j= 80
k= 79
j= 81
k= 80
j= 82
k= 81
j= 83
k= 82
j= 84
k= 83
j= 85
j= 86
k= 84
j= 87
k= 85
j= 88
k= 86
j= 89
k= 87
j= 90
k= 88
j= 91
k= 89
j= 92
k= 90
j= 93
k= 91
j= 94
k= 92
j= 95
k= 93
j= 96
j= 97
k= 94
j= 98
j= 99
k= 95
j= 100
k= 96

Exit from ThreadB
k= 97
k= 98
k= 99
k= 100

Exit from ThreadC
*/