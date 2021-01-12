package com.brycelooyenga.encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
            } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 0 || tonerAmount  > 100) {
            return -1;
        } else if (this.tonerLevel + tonerAmount > 100) {
            return -1;
        } else {
            this.tonerLevel+=tonerAmount;
        }
        return this.tonerLevel;
    }


    public int printPages(int pagesToPrint) {
      if (this.duplex = true) {
          pagesToPrint = (pagesPrinted % 2) + (pagesToPrint/2);
          this.pagesPrinted+=pagesToPrint;
      } else {
          this.pagesPrinted+=pagesToPrint;
      }
 return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }



}
