package employeeApp;

import com.workintech.firstChallenge.Company;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.
     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args) {
        String[] developerNames = new String[5];
        Company workintech = new Company(123, "Workintech", 850.000, developerNames);
        workintech.getDeveloperNames()[0] = "Doğancan Kınık";
        workintech.getDeveloperNames()[1] = "Emre Şahiner";
        workintech.getDeveloperNames()[2] = "Erhan Fırat";
        workintech.setDeveloperCounts(developerNames);
        // ************************
        System.out.println(Arrays.toString(workintech.getDeveloperNames()));
        System.out.println("*******************");
        workintech.addEmployee(6,"Maya");
        System.out.println("*******");
        System.out.println("developers:" + Arrays.toString(workintech.getDeveloperNames()));
        workWithData();
    }
}
