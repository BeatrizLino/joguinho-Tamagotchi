class Tamagotchi{
	int energia;
	int fome;
	int limpeza;
	int diamante;
	int idade;
	int opcao;
	void brincar(){
		energia -= 2;
		fome -= 1;
		limpeza -=3;
		diamante += 1;
		idade += 1;
	}
	void comer(){
    if (fome <= 6){
    energia -= 1;
    limpeza -= 2;
    idade +=1;
    fome += 4;	
    }else{
    System.out.println("Seu bichinho ainda esta cheio, brinque mais um pouco!");	
    }if(fome==10){
    	fome = 10+0;
    }
    
    }
    void dormir(){
    	fome -= 1;
    	idade = idade + (20 - energia);
    	energia = (20 - energia) + energia; 
    }
    void banho(){
    	fome -= 1;
    	energia -= 3;
    	idade += 2;
    	limpeza = (15 - limpeza) + limpeza;
    }
}