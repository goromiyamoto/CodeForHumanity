#include <stdio.h>
#include <stdlib.h>

struct pessoa{
	char nome[50]; //define nome
	float nota[5]; //define nota
	int cpf[18]; //define cpf
};

int main(){
	struct pessoa p, p1;
	printf("Preencha os campos a seguir: \n");
	printf("Nome, nota e cpf: \n");
	scanf("%c %f %d", &p.nome, &p.nota, &p.cpf);
	fflush(stdin);

	printf("\n %c %f %d", p.nome, p.nota, p.cpf);
}	
