public class GamblingGame {
  private ArrayList<Integer> numbers, winNumbers;
  public int balance;
  public GamblingGame(){
    numbers = new ArrayList<>();
    winNumbers = new ArrayList<>();
    balance = 10;
    for (int i = 1; i <= 80; i++){
      numbers.add(i);
    }
    setWinNum();
  }

  private void setWinNum() {
    int rand;
    while( numbers.size() > 60 ) {
      rand = (int)(Math.random()*numbers.size());
      winNumbers.add(numbers.remove(rand));
    }
  }

  public ArrayList<Integer> getWinNumbers() {
    return winNumbers;
  }
  
  public void numberShuffles(){
    winNumbers.clear();
    numbers.clear();
    for (int i = 1; i <= 80; i++){
      numbers.add(i);
    }
    setWinNum();
  }
  
}