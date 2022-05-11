class WordList {
  private String[]  listOfWords = {"words", "floor", "hills", "array", "farid"};
  
  public String getWord() {
    return listOfWords[(int)(Math.random()*(listOfWords.length))];
  }
}