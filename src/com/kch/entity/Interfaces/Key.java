package com.kch.entity.Interfaces;

public interface Key {
    void up();          // 방향 변경
    void down();        // 한칸 밑으로 내려감
    void left();        // 왼쪽으로 한칸 이동
    void right();       // 오른쪽으로 한칸 이동
    void space();       // 바로 하강
    void hold();        // 홀드 시켜둠
}
