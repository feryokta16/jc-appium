package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Pixel 2 API 30");
        desiredCapabilities.setCapability("udid", "emulator-5554");
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("appPackage","com.chad.financialrecord");
        desiredCapabilities.setCapability("appActivity","com.rookie.catatankeuangan.feature.splash.SplashActivity");
        desiredCapabilities.setCapability("noReset",true);

        //URL
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        //Instance Android Driver
        AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
        //mobile Element Pengeluaran
        delay(5);
        MobileElement add = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/fabMenu"));
        add.click();
        delay(5);
        MobileElement tanggal = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/tvDate"));
        tanggal.click();
        delay(5);
        MobileElement enamBelas = (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc=\"23 Oktober 2023\"]"));
        enamBelas.click();
        delay(5);
        MobileElement ok = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
        ok.click();
        delay(5);
        MobileElement kategori = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/tvName"));
        kategori.click();
        delay(10);
        MobileElement pajak = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView"));
        pajak.click();
        delay(10);
        MobileElement jumlah = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/etAmount"));
        jumlah.sendKeys("100");
        delay(10);
        MobileElement ket = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.EditText"));
        ket.sendKeys("olahraga");
        delay(5);
        MobileElement submitKeluar = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/btSave"));
        submitKeluar.click();
        delay(10);



//         Mobile Element Pemasukan
        delay(10);
//        MobileElement addMasuk = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/fabMenu"));
        add.click();
        delay(5);
        MobileElement masukButton = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/btnIncome"));
        masukButton.click();
        delay(5);
        MobileElement tanggalMasuk = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/tvDate"));
        tanggalMasuk.click();
        delay(5);
        MobileElement duaEmpat = (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc=\"24 Oktober 2023\"]"));
        duaEmpat.click();
        delay(5);
        MobileElement okMasuk = (MobileElement) driver.findElement(By.id("android:id/button1"));
        okMasuk.click();
        delay(5);
        MobileElement kategoriMasuk = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/llForm"));
        kategoriMasuk.click();
        delay(5);
        MobileElement hibah = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView"));
        hibah.click();
        delay(5);
        MobileElement jumlahMasuk = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.EditText"));
        jumlahMasuk.sendKeys("200");
        delay(10);
        MobileElement ketMasuk = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/etNote"));
        ketMasuk.sendKeys("alhamdulillah");
        delay(5);

        MobileElement saveMasuk = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/btSave"));
        saveMasuk.click();
        delay(10);

        MobileElement hasilKeluar =(MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[4]"));
        String txtHasilKeluar = hasilKeluar.getText();
        System.out.println(txtHasilKeluar);
        assertEquals(txtHasilKeluar,"100");

        MobileElement hasilKat =(MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]"));
        String txtHasilKat = hasilKat.getText();
        System.out.println(txtHasilKat);
        assertEquals(txtHasilKat,"Olahraga");

        MobileElement hasilMasuk =(MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[4]"));
        String txtHasilMasuk = hasilMasuk.getText();
        System.out.println(txtHasilMasuk);
        assertEquals(txtHasilMasuk,"200");

        MobileElement hasilKatKeluar =(MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]"));
        String txtHasilKatKeluar = hasilKatKeluar.getText();
        System.out.println(txtHasilKatKeluar);
        assertEquals(txtHasilKatKeluar,"Hibah");

        delay(10);






        driver.quit();


    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void assertEquals(String actual, String expected){
        if(actual.equals(expected)){
            System.out.println("passes");
        }else{
            System.out.println("failed");
        }
    }
}