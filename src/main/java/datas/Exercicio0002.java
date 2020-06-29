package datas;

//Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que os juros sejam cobrados
//Caso essa data caia em um sábado ou domingo o cliente pode pagar na segunda-feira seguinte.
//Crie uma estrutura que receba umad ata de vencimento e calcule quantos dias ele tem para pagar

import java.util.Calendar;

public class Exercicio0002 {

    public static final Calendar boleto = Calendar.getInstance();

    static Calendar getVencimento(Calendar data){

        Calendar vencimento = (Calendar) data.clone();
        vencimento.add(Calendar.DATE,10);

        if (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            vencimento.add(Calendar.DATE, 2);
        } else if (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            vencimento.add(Calendar.DATE, 1);
        }

        return vencimento;
    }

    public static void main(String[] args){

        Calendar vencimento = getVencimento(boleto);

        Calendar treDiasDepois = (Calendar) boleto.clone();
        treDiasDepois.add(Calendar.DATE, 3);

        System.out.println("O boleto gerado vence em: " + vencimento.getTime());

        System.out.println("O boleto gerado daqui a 3 dias vence em: " + getVencimento(treDiasDepois).getTime());
    }
}
