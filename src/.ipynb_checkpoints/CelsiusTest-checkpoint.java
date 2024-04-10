class Fahrenheit { 
    float fahrenheit = 43.2;
    float convertToCelsius() { 
        float celsius = ((float)5/9) * (fahrenheit -32); 
        return celsius;
}
public class CelsiusTest { 
    public static void main(String[] args){ 
        Fahrenheit f1 = new Fahrenheit();
        float cel = f1.convertToCelsius;
        System.out.println("화씨 %.1f도는 섭씨 %.1f도 입니다.", f1.fahrenheit, cel);
    }
}
