programa {
  funcao inicio() {
    cadeia nome
    inteiro idade

    escreva("Digite seu nome: ")
    leia(nome)

    escreva("Digite sua idade: ")
    leia(idade)

    se(idade >= 18){
          escreva("Partipção autorizada.")
    }

    senao{
        escreva("Necessária autorização dos responsáveis. ")
    }
  }
}
