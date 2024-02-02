package ch08.ButtonExample;

import ch08.ButtonExample.Button.Button;

public class ButtonExample {
    public static void main(String[] args){
        Button btnOk = new Button();

        class BtnOkClickEventListener implements Button.ClickListener {
            @Override
            public void onClick(){
                System.out.println("Ok button");
            }
        }

        btnOk.setClickListener(new BtnOkClickEventListener());

        btnOk.click();

        class BtnCancelListener implements Button.ClickListener {
            @Override
            public void onClick(){
                System.out.println("Cancel button");
            }
        }

        btnOk.setClickListener(new BtnCancelListener());
        btnOk.click();
    }    
}
