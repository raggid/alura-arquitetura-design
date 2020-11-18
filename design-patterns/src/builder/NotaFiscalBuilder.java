package builder;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String CNPJ;
    private String observacao;
    private Calendar emissao;
    private List<ItemDaNota> itens = new ArrayList<>();
    private double valorTotal;
    private double imposto;

    public NotaFiscalBuilder comRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCNPJ(String CNPJ){
        this.CNPJ = CNPJ;
        return this;
    }

    public NotaFiscalBuilder comObservacao(String obsevacao){
        this.observacao = obsevacao;
        return this;
    }

    public NotaFiscalBuilder naDataAtual(){
        this.emissao = Calendar.getInstance();
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item){
        this.itens.add(item);
        this.valorTotal += item.getValor();
        this.imposto += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscal build(){
        return new NotaFiscal(razaoSocial, CNPJ, emissao, valorTotal, imposto, itens, observacao);
    }
}
