void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#EA4242);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#33B44B);
    rect(176, 103, 12, 32);
    rect(167, 112, 32, 12);
    fill(#FFFFFF);
    if(mousePressed)
    ellipse(88, 200, 30, 30);
}
