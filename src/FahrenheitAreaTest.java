class FahrenheitArea {
    float fahrenheit;
    String area;


    FahrenheitArea(float fahrenheit, String area) { 
        this.fahrenheit = fahrenheit; 
        this.area = area;
    }

    float convertToCelsius() {
        return ((float)5 / 9) * (fahrenheit - 32);
    }

    String wearClothes() { 
        float celsius = convertToCelsius();
        String clothesRecommendation = ""; 
        if(celsius >= 28) {clothesRecommendation = "민소매, 반팔 티셔츠, 반바지(핫팬츠), 민소매 원피스, 짧은 치마, 린넨"; }  
        else if(celsius >= 23 && celsius <= 27) { clothesRecommendation = "반팔 티셔츠, 얇은 셔츠, 얇은 긴팔 티셔츠, 반바지, 면바지";}
        else if(celsius >= 20 && celsius <= 22) { clothesRecommendation = "얇은 가디건, 긴팔 티셔츠, 셔츠, 블라우스, 후드티, 면바지, 슬랙스, 7부 바지, 청바지";}
        else if(celsius >= 17 && celsius <= 19) { clothesRecommendation = "얇은 니트, 얇은 가디건, 얇은 재킷, 후드티, 스웨트 셔츠(맨투맨), 바람막이, 가디건, 긴바지, 청바지, 슬랙스, 스키니진";}
        else if(celsius >= 12 && celsius <= 16) { clothesRecommendation = "재킷, 가디건, 청재킷, 야상, 니트, 스웨트 셔츠(맨투맨), 셔츠, 기모 후드티, 청바지, 면바지, 살구색 스타킹";}
        else if(celsius >= 9 && celsius <= 11) { clothesRecommendation = "재킷, 야상, 점퍼, 트렌치 코트, 니트, 청바지, 면바지, 검은색 스타킹, 기모 바지, 레이어드";}
        else if(celsius >= 5 && celsius <= 8) { clothesRecommendation = "코트, 울 코트, 가죽 재킷, 플리스, 내복, 니트, 레깅스, 청바지, 두꺼운 바지, 스카프, 기모";}
        else { clothesRecommendation = "패딩, 두꺼운 코트, 누빔, 내복, 목도리, 장갑, 기모, 방한용품";}
    
        return clothesRecommendation;
    }
}

public class FahrenheitAreaTest { 
    public static void main(String args[]){ 
        FahrenheitArea FA = new FahrenheitArea(43.2f, "Seoul");
        float celsius = FA.convertToCelsius();
        System.out.println(FA.area + "지역 화씨"+FA.fahrenheit +"도 섭씨"+celsius+"도 입니다"); 
        System.out.println(FA.wearClothes());
    }
}
