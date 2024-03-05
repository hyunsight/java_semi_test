package java_02.Quiz3;

public class Marine {
    int x = 0, y = 0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
    static int weapon = 6; // 공격력
    static int armor = 0; // 방어력

    static void weaponUp() {
        weapon++;
    }
    static void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수
        this.y = y; // this.y는 인스턴스 변수, y는 지역변수
    }
}

/*
정답:
1. static 붙여야 하는 것들
- int weapon, int armor, void weaponUp(), void armorUp()
2. 이유
- 모든 병사의 공격력과 방어력은 같아야(같이 적용되어야) 하므로 공격력(int weapon) 및 방어력(int armor)은 공유되어야 한다.
  즉 해당 2개 필드에 static을 붙여야 한다.
- 또한 해당 공격력 및 방어력을 증가시키는 메소드인 void weaponUp(), void armorUp()에도 static을 붙여야 한다.
*/