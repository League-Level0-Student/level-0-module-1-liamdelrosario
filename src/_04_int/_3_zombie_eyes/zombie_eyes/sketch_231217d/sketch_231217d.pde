void setup() {
size(1000,1000);
PImage fish = loadImage("fisheyes.jpeg");
fish.resize(1000, 1000);
image(fish, 0,0);


}
void draw() {
fill(mouseX*255/1000,mouseY*255/1000,50);
ellipse(350,572, 150,150);
ellipse(640,572, 150,150);
fill(#000000);
ellipse(360,587, 50,50);
ellipse(655,578, 49,50);
}
