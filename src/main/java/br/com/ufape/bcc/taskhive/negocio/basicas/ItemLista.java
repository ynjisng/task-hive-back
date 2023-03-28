package br.com.ufape.bcc.taskhive.negocio.basicas;

public class ItemLista {
    private String item;
    private boolean checked;
    
    public ItemLista() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

}
