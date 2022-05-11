public class Word {
  String[] word = new String[5];
  
  public Word(String word) {
    for (int i = 0;i < 5;i++){
      this.word[i] = word.substring(i, i+1);
    }
  }

  public String getLetter(int index){
    return this.word[index];
  }

  public String green(Word check) {
    String[] greens = new String[5];
    String a;
    for (int i = 0;i < 5;i++){
      if (this.word[i].equals(check.getLetter(i))){
        greens[i] = " ";
      } else {
        greens[i] = this.word[i];
      }
    }
    a = String.join("", word);
    return a;
  }

  public boolean[] orange(String check){
    boolean[] oranges = new boolean[5];
    for(int i = 0; i < 5; i++){
      if(check.contains(this.word[i])){
        oranges[i] = true;
      }
      else{
        oranges[i] = false;
      }
    }
    return oranges;
  }
}