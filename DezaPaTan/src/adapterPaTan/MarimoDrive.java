package adapterPaTan;
/*
  アダプタ共通のインターフェース
*/
interface IpSettings {
    public void setIpConfig(String ip, String subnet, String interfaceName);
}

class CiscoMarimo {

    public CiscoMarimo() {
        System.out.println("CiscoMarimo new!!!");
    }

    public void enableMode() {
        System.out.println("enamble");
    }
    public void configMode() {
        System.out.println("configure terminal");
    }
    public void interfaceMode(String interfaceName) {
        System.out.println("interface fastethernet 0/0");
    }
    public void setIP(String ip, String subnet) {
        System.out.println("ip address "  + ip + " " + subnet);
    }
    public void noShutdonw() {
        System.out.println("no shutdown");
    }
    public void exit() {
        System.out.println("exit");
    }
}

class CiscoAdaptor implements IpSettings{
    CiscoMarimo cMarimo;

    public CiscoAdaptor(CiscoMarimo cMarimo) {
        this.cMarimo = cMarimo;
    }

    public void setIpConfig(String ip, String subnet, String interfaceName) {
        cMarimo.enableMode();
        cMarimo.configMode();
        cMarimo.interfaceMode(interfaceName);
        cMarimo.setIP(ip, subnet);
        cMarimo.noShutdonw();
        cMarimo.exit();
        cMarimo.exit();
    }

}

class LinuxMarimo {
    public LinuxMarimo() {
        System.out.println("LinuxMarimo new!!!");
    }

    public void doBySudo() {
        System.out.print("sudo ");
    }

    public void setLinuxIpConfig(String ip, String subnet, String interfaceName) {
        System.out.println("/sbin/ifconfig " + interfaceName + " " + ip + " netmask " + subnet);
    }

}

class LinuxAdaptor implements IpSettings{
    LinuxMarimo lMarimo;
    public LinuxAdaptor(LinuxMarimo lMarimo) {
        this.lMarimo = lMarimo;
    }

    public void setIpConfig(String ip, String subnet, String interfaceName) {
        lMarimo.doBySudo();
        lMarimo.setLinuxIpConfig(ip, subnet, interfaceName);
    }

}


class MarimoDrive {
    public static void main(String[] args) {
        System.out.println("---------------MarimoDrive start---------------");

        String ip               = "192.168.1.1";
        String subnet           = "255.255.255.0";
        String interfaceName    = "eth0";

        /*
          各機種を意識しなくても設定することができる。
          同じinterface(APIと言い換えても良い)を実装しているアダプタを
          使っているからな！
	*/

        System.out.println("Cisco機器の設定");
        IpSettings cAdaptor = new CiscoAdaptor(new CiscoMarimo());
        cAdaptor.setIpConfig(ip, subnet, interfaceName); //methodの使い方が同じ！


        System.out.println("\nlinux機器の設定");
        IpSettings lAdaptor = new LinuxAdaptor(new LinuxMarimo());
        lAdaptor.setIpConfig(ip, subnet, interfaceName); //methodの使い方が同じ！

        System.out.println("---------------MarimoDrive end---------------");
    }
}

