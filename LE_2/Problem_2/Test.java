class Test{
    public static void main(String args[]){
        Voice voice = new Voice();
        Animal[] animal = voice.prepareVoice();
        voice.hear(animal);
    }
}