package listadeexercicios.televisao;
/**
 * @author: EDCLYDSON SOUSA
 * Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. 
 *  
 * O controle de volume permite:
     aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
     aumentar e diminuir o número do canal em uma unidade
     trocar para um canal indicado;
     consultar o valor do volume de som e o canal selecionado.
 * 
 */
public class ATV21EJP{// CLASSE TELEVISAO
    private int[] totalCanais = {2,5,8,9,10,12,14,17,20,22,24};
    private int canalAtual;
    private int volumeMAX = 10;
    private int volumeAtual;
    private int posicaoAtual;

    ATV21EJP()
    {
        this.posicaoAtual = 4;
        this.canalAtual = totalCanais[posicaoAtual];
        this.volumeAtual = 3;
    }
    
    public void aumentarvolume()
    {
        if(volumeAtual<volumeMAX)volumeAtual = volumeAtual + 1;
        else System.out.println("O volume está no máximo!");
    }
    
    public void diminuirvolume()
    {
        if(volumeAtual>0) volumeAtual = volumeAtual - 1;
        else System.out.println("O volume está no mínimo!");
    }
   
    public void zapearmaisum()
    {
        if(canalAtual < 24)
        {
            canalAtual = totalCanais[posicaoAtual++];
            System.out.println("Canal "+canalAtual);
        }
        else if(canalAtual >= 2)
        {
            posicaoAtual = 0;
            canalAtual = totalCanais[posicaoAtual++];
            System.out.println("Canal "+canalAtual);            
        }
        else
        {
            posicaoAtual = 0;
            canalAtual = totalCanais[posicaoAtual];
            System.out.println("Canal "+canalAtual);
        }
    }
    
    public void zapearmenosum()
    {
        if(canalAtual > 2)
        {
            canalAtual = totalCanais[posicaoAtual--];
            System.out.println("Canal "+canalAtual);
        }
        else if(canalAtual <= 24)
        {
            posicaoAtual = 10;
            canalAtual = totalCanais[posicaoAtual--];
            System.out.println("Canal "+canalAtual);
        }
        else
        {
            posicaoAtual = 10;
            canalAtual = totalCanais[posicaoAtual];
            System.out.println("Canal "+canalAtual);
        }
    }

    public void consultacanalevolume()
    {
        System.out.println("Assistindo: Canal "+canalAtual);
        System.out.println("Volume: "+volumeAtual);
    }

    public void trocacanal(int canal)
    {
        switch(canal)
        {
            case 2:
            {
                posicaoAtual = 0;
                canalAtual = totalCanais[posicaoAtual];
                break;
            }
            case 5:
            {
                posicaoAtual = 1;
                canalAtual = totalCanais[posicaoAtual];
                break;

            }
            case 8:
            {
                posicaoAtual = 2;
                canalAtual = totalCanais[posicaoAtual];
                break;
            }
            case 9:
            {
                posicaoAtual = 3;
                canalAtual = totalCanais[posicaoAtual];
                break;
            }
            case 10:
            {
                posicaoAtual = 4;
                canalAtual = totalCanais[posicaoAtual];
                break;
            }
            case 12:
            {
                posicaoAtual = 5;
                canalAtual = totalCanais[posicaoAtual];
                break;
            }
            case 14:
            {
                posicaoAtual = 6;
                canalAtual = totalCanais[posicaoAtual];
                break;
            }
            case 17:
            {
                posicaoAtual = 7;
                canalAtual = totalCanais[posicaoAtual];
                break;
            }
            case 20:
            {
                posicaoAtual = 8;
                canalAtual = totalCanais[posicaoAtual];
                break;
            }
            case 22:
            {
                posicaoAtual = 9;
                canalAtual = totalCanais[posicaoAtual];
                break;
            }
            case 24:
            {
                posicaoAtual = 10;
                canalAtual = totalCanais[posicaoAtual];
                break;
            }
            default:{break;}
        }
    }
}
