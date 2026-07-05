package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockAccount {

    private double balance;

    private final Lock lock = new ReentrantLock();

    public void withdraw(double amount){
        lock.lock();
        try {
            lock.wait();
            balance -= amount;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void deposit(double amount){
        lock.lock();
        try {
            balance += amount;
        }
        finally {
            lock.unlock();
        }
    }

    public void transfer(ReentrantLockAccount to, double amount){
        lock.lock();
        try {
            this.withdraw(amount);
            to.deposit(amount);
        }finally {
            lock.unlock();
        }
    }

    public double getBalance(){
        lock.lock();
        try {
            return balance;
        }finally {
            lock.unlock();
        }
    }



}
