#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	//matriz 4x5, 4 trimestres 5 regioes.
	int vetRefr[4][5];
	int i;
	int a;
	printf("Digite as quantidades vendidas em cada trimestre e regiao: \n");
	//i sempre com valor inicial 1, para funcionamento dessa matriz.
	//preenchimento da matriz com valores nos campos trimestre e regiao.
	for(i = 1; i < 5; i++){
		for(a = 0; a < 5; a++){
			//switch usado para melhor usuabilidade e leitura do possível usuário.
			switch(a){
				//uso do switch é para a melhorar a usuabilidade
				//assim conseguindo representar o que o programa está pedindo (para qual região) de maneira rápida, e consumindo menos tempo.
				case 0:
				printf("Regiao Norte, trimestre: %d", i);
				scanf("%d", &vetRefr[i][a]);
				fflush(stdin);
				break;
				case 1:
				printf("\n Regiao Nordeste, trimestre: %d", i);
				scanf("%d", &vetRefr[i][a]);
				fflush(stdin);
				break;
				case 2:
				printf("\n Regiao Sul, trimestre: %d", i);
				scanf("%d", &vetRefr[i][a]);
				fflush(stdin);
				break;
				case 3:
				printf("\n Regiao Suldeste, trimestre: %d", i);
				scanf("%d", &vetRefr[i][a]);
				fflush(stdin);
				break;
				case 4:
				printf("\n Regiao Centro-Oeste, trimestre: %d", i);
				scanf("%d", &vetRefr[i][a]);
				fflush(stdin);
				break;
			}
		}
	}
	for(i = 1; i < 5; i++){
		for(a = 0; a < 5; a++){
			switch(a){
			//mesmo uso do que os switch anterior, porém este deve representar a mesma ordem que o anterior
			//ie: case 0 tem que ser Norte por ter sido anteriormente.
			case 0:
			printf("\n Regiao Norte possui a seguinte quantidade vendida: %d", vetRefr[i][a]);
			break;
			case 1:
			printf("\n Regiao Nordeste possui a seguinte quantidade vendida: %d", vetRefr[i][a]);
			break;
			case 2:
			printf("\n Regiao Sul possui a seguinte quantidade vendida: %d", vetRefr[i][a]);
			break;
			case 3:
			printf("\n Regiao Suldeste possui a seguinte quantidade vendida: %d", vetRefr[i][a]);
			break;
			case 4:
			printf("\n Regiao Centro-Oeste possui a seguinte quantidade vendida: %d", vetRefr[i][a]);
			break;
		}
	}
	}
}
