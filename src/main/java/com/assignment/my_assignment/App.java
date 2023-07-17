package com.assignment.my_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Facebook login page
        driver.get("https://www.facebook.com/");

        // Find the email/phone and password fields and input your credentials
        driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
        driver.findElement(By.id("pass")).sendKeys("password");

        // Find the login button and click it
        driver.findElement(By.name("login")).click();

        // Wait for a few seconds to see the result
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
