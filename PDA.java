class Pda {

  public boolean func1(int val){
    if(val == 1){
      return true;
    }else{
      return false;
    }
  }

  public int max(int a, int b){
    if(a > b){
      return a;
    }else{
      return b;
    }
  }

  public int looper(){
    int i = 0;
    while(i <= 10){
      i++;
    }
    return i;
  } 

  public String checkLoop(){
    if (looper() == 10){
      return "looper passed";
    }
    else{
      return "looper failed";
    }
  }
}

// 1. Typo on line 11 with the misspelling of 'Private'.

// 2. Each access modifier should be public not private.

// 3. Missing bracket at the end of code.

// 4. Extra equals sign needed in line 4. 

// 4. Semi colon missing at the end of line 29 after return statement.

// 5. In test three the return statement sits within the while loop instead of outside of it.

// 6. In the final test it should read public string instead of public void.

// 7. Brackets missing after looper on line 28.

// 8. There should be a comma between parameters in on line 11.

