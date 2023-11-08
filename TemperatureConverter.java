import java.util.*;
public class TemperatureConverter
{//class definition starts
public static void main(String[] args)
    {//main method definition starts

        Scanner sc = new Scanner(System.in);//object of scanner class created to take input from user
        System.out.println("                 Temperature Conversion                    ");
        System.out.println("___________________________________________________________");
        System.out.println("Enter a temperature value: ");
        double temperature = sc.nextDouble();//assigning temperature in variable temperature

        System.out.println("Enter the original unit of measurement: ");
        String originalUnit = sc.next();//assigning unit in variable originalUnit

        double celsius=0;//declaring variable named as celsius of double datatype
        double fahrenheit=0;//declaring variable named as fahrenheit of double datatype
        double kelvin=0;//declaring variable named as kelvin of double datatype

        if (originalUnit.equals("c") ||originalUnit.equals("C") ||originalUnit.equals("CELSIUS") || originalUnit.equals("Celsius") ||originalUnit.equals("celsius")) 
        {
            //checking condition where given unit is given in Celsius

            fahrenheit = (temperature * 1.8) + 32;
            kelvin = temperature + 273.15;

            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            System.out.println("Temperature in Kelvin: " + kelvin);

        }
            else if (originalUnit.equals("F") ||(originalUnit.equals("f") || originalUnit.equals("fahrenheit") ||originalUnit.equals("Fahrenheit")||originalUnit.equals("FAHRENHEIT")))
            {
                //checking condition where given unit is given in Fahrenheit

                celsius = (temperature - 32) / 1.8;
                kelvin = (temperature - 32) / 1.8 + 273.15;

                System.out.println("Temperature in Celsius: " + celsius);
                System.out.println("Temperature in Kelvin: " + kelvin);

            }

            else if (originalUnit.equals("K") || originalUnit.equals("Kelvin") ||originalUnit.equals("k") || originalUnit.equals("kelvin")|| originalUnit.equals("KELVIN")) 
            {
               //checking condition where given unit is given in Kelvin

                celsius = temperature - 273.15;
                fahrenheit = (temperature - 273.15) * 1.8 + 32;

                System.out.println("Temperature in Celsius: " + celsius);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);

            }

        else 
        {
            //if given unit is invalid

            System.out.println("Invalid unit of measurement");
            return;
        }
    }//main method definition stops
}//class definition stops