// 1번
public void startGame(){
	String[] word = getShuffleWord();
	this.inputWord(word);
}

// 2번
public String[] getShuffleWord(){
	String[] word = this.shuffleWord("KOREA");
	return word;
}

// 3번
public String[] shuffleWord(String word){

}

// 4번
public void inputWord(String[] word){   // 응집도가 높은코드
	셔플한 단어를 매개변수로 받고
	프롬프트 보여주고
	셔플한 단어 보여주고
	키보드 입력받기 
}


public void inputWord() {  // 결합도가 높은코드 좋지않다
	프롬프트 보여주고
	셔플한 단어 가져오고
	셔플한 단어 보여주고
	키보드 입력받기

}
