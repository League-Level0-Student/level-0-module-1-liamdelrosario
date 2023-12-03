
void setup() {
  size(500, 500);
  
}
void draw() {
    
    fill(#F2C738);
    ellipse(250,250, 400,400);
    fill(#F01B13);
    ellipse(250,250, 380,380);
    fill(#FDFF81);
    ellipse(250,250, 365,365);
    if(mousePressed){
    PImage pepperoni;
    pepperoni = loadImage("pepperoni.png");
        pepperoni.resize(70,70);
    image(pepperoni,200,200);
    image(pepperoni,300,200);
    image(pepperoni,220,300);
    image(pepperoni,100,150);
    image(pepperoni,200,105);
    image(pepperoni,100,300);
    PImage mushroom;
    mushroom = loadImage("mushroom.png");
    mushroom.resize(50,50);
    image(mushroom,153, 150);
    image(mushroom,150, 350);
    image(mushroom,350, 150);
    image(mushroom,350, 250);
    PImage olive;
    olive = loadImage("olive.png");
    olive.resize(50,50);
    image(olive,150, 250);
    image(olive,320, 110);
    image(olive,310, 350);
}
}
