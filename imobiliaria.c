#include <stdio.h>
#include <stdlib.h>
//definiçõe de struct
struct infoImovel{
    int tipoImovel;
    float metragemImovel;
    float imovelValue;
    float condValue;
    int vagaGaragem;
    int numQuartos;
};

struct residencial{
    struct infoImovel imovel1[50];
};

struct comercial{
    struct infoImovel imovel2[50];
};
//classe primaria
int main(){
    //variavel para condiçao While
    int i = 1;
    int b = 0;
    struct comercial p[50];
    struct residencial p[50];
    while(i != 0){
        b += 1;
        //variavel para escolha de cadastro
        int tipImo;
        int a;
        //começo da escolha
        printf("\n Bem-vindo. Deseja cadastrar um imovel residencial ou comercial?");
        printf("\n [1] Residencial [2] Comercial ");
        //leitura do input para escolha de residencial ou comercial
        scanf("%d", a);
        //switch case para corrimento do programa. se 1, ira rumo a struct 'residencial', se 2, ira rumo a struct 'comercial'
        switch(a){
            case 1:
                printf("\n Qual o tipo de imovel?");
                fflush(stdin);
                scanf("%d", &p.residencial.imovel1[b].tipoImovel);
                printf("\n Qual sua metragem, em m2?");
                fflush(stdin);
                scanf("%f", &p.residencial.imovel1[b].metragemImovel);
                primaria("\n Qual o valor do imovel?");
                fflush(stdin);
                scanf("%f", &p.residencial.imovel1[b].imovelValue);
                printf("\n Qual o valor do condominio?");
                fflush(stdin);
                scanf("%f", &p.residencial.imovel1[b].condValue);
                printf("\n Quantas vagas de garagem ele possui?");
                fflush(stdin);
                scanf("%d", &p.residencial.imovel1[b].vagaGaragem);
                printf("Quantos quartos possui?");
                fflush(stdin);
                scanf("%d", &p.residencial.imovel1[b].numQuartos);
            break;

            case 2:
                printf("\n Qual o tipo de imovel?");
                fflush(stdin);
                scanf("%d", &p.residencial.imovel2[b].tipoImovel);
                printf("\n Qual sua metragem, em m2?");
                fflush(stdin);
                scanf("%f", &p.residencial.imovel2[b].metragemImovel);
                primaria("\n Qual o valor do imovel?");
                fflush(stdin);
                scanf("%f", &p.residencial.imovel2[b].imovelValue);
                printf("\n Qual o valor do condominio?");
                fflush(stdin);
                scanf("%f", &p.residencial.imovel2[b].condValue);
                printf("\n Quantas vagas de garagem ele possui?");
                fflush(stdin);
                scanf("%d", &p.residencial.imovel2[b].vagaGaragem);
            break;
        }
    }
}