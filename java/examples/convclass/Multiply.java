package net.adrianlehmann.swt_revision.patterns.conv.convclass;

/**
 * Created by adrianlehmann on 27.07.17.
 */
public class Mulitply {
    private int v1, v2, v3; //State

    int mult(int p1, int p2, int p3) {
        return p1 * p2 * p3;
    }

    int mult(int p1) {
        return mult(p1, v2, v3);
    }

    int mult() {
        return mult(v1, v2, v3);
    }

    void setState(int p1, int p2, int p3) {
        v1 = p1;
        v2 = p2;
        v3 = p3;
    }
}