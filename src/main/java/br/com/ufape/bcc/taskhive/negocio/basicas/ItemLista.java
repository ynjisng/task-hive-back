package br.com.ufape.bcc.taskhive.negocio.basicas;

public class ItemLista {
    private long id;
    private String item;
    private boolean checked;
    
    public ItemLista() {
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
