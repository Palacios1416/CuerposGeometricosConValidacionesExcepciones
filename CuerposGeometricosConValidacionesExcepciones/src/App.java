import java.util.Scanner;
public class App {
    public static double altura, radio, generatriz, areaZonaEsferica, volumenZonaEsferica,
    areatotal, arealateral, volumen, areaPentagonal, volumenCasquete, areaCasquete,
    nGrado, arista, area, apotema, diametro, longitudLado, ancho, diagonal,
    radiomayor, radiomenor, radiomayorCasquete, alturaCasquete, aBasemayor,
    distancialados,apotemaCentral, aBase, distanciaLados, pBase, anguloradianes,
    restaRadios, areaLateral, aBasemenor, areaTotal, ladoMayor, ladoMenor,
    pBasemayor, pBasemenor, catetoAdyacente;
    public static byte numeroLados = 5;
    public static byte opc, count = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("FIGURAS GEOMETRICAS");
        System.out.println("¿Que figura desea hacer?");
        System.out.println(
        "1) Cilindro\n" + 
        "2) Cono\n" +
        "3) Cuña Esferica\n" +
        "4) Dodecaedro\n" +
        "5) Esfera\n" +
        "6) Hexaedro\n" +
        "7) Huso Esferico\n" +
        "8) Icosaedro\n" +
        "9) Octaedro\n" +
        "10) Ortoedro\n" +
        "11) Piramide\n" +
        "12) Prisma\n" +
        "13) Tetraedro\n" +
        "14) Tronco de cono\n" +
        "15) Tronco de piramide\n" +
        "16) Zona esferica y Casquete esferico\n"+
        "17) Salir"
        );
        
        do {
          opc = scanner.nextByte(); 
                count++; 
        } while ((opc < 1 || opc > 17) && count < 3);

         Opciones(opc);
    }
       

    public static void Opciones(byte opc){
        switch (opc) {
            case 1:
                Cilindro();
                break;
            case 2:
                Cono();
                break;
            case 3:
                CuñaEsferica();
                break;
            case 4:
                Dodecaedro();
                break;
            case 5:
                Esfera();
                break;
            case 6:
                Hexaedro();
                break;
            case 7:
                HusoEsferico();
                break;
            case 8:
                Icosaedro();
                break;
            case 9:
                Octaedro();
                break;
            case 10:
                Ortoedro();
                break;
            case 11:
                Piramide();
                break;
            case 12:
                Prisma();
                break;
            case 13:
                Tetraedro();
                break;
            case 14:
                TroncoCono();
                break;
            case 15:
                TroncoPiramide();
                break;
            case 16:
                ZonaEsfericaYCasquete();
                break;
            case 17:
                System.out.println("Salió con éxito.");
                break;
        }
    }

    private static void ZonaEsfericaYCasquete() {
        System.out.println("ZONA ESFERICA");
        
        while (count < 3) {
            try {
                System.out.print("Ingrese el radio mayor: ");
                do {
                    radiomayor = scanner.nextDouble();
                    if (radiomayor <= 0) {
                        System.out.println("Valor incorrecto, el radio mayor debe ser positivo");
                        System.out.print("Ingrese el radio mayor: ");
                    }
                } while (radiomayor <= 0);
                System.out.print("Ingrese el radio menor: ");
                do {
                    radiomenor = scanner.nextDouble();
                    if (radiomenor <= 0) {
                        System.out.println("Valor incorrecto, el radio debe ser positivo");
                        System.out.print("Ingrese el radio menor: ");
                    }
                } while (radiomenor <= 0);
                System.out.print("Ingrese la altura: ");
                do {
                    altura = scanner.nextDouble();
                    if (altura <= 0) {
                        System.out.println("Valor incorrecto, la altura debe ser positiva");
                        System.out.print("Ingrese la altura: ");
                    }
                } while (altura <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }

    if(count == 3){
        System.out.println("Se agotaron los intentos.");
    }else {
        areaZonaEsferica = 2 * (3.1416) * radiomayor * altura;
        volumenZonaEsferica = ((3.1416) * altura * ((altura*altura) + 3*(radiomenor*radiomenor) + 3*(radiomayor*radiomayor)))/6;
        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("el area de la zona esferica es: "+ areaZonaEsferica);
        System.out.println("el voluemen de la zona esfercia es: "+ volumenZonaEsferica);

        System.out.println("CASQUETE ESFERICO");
        /*se vuelven a pedir los valores porque es un calculo de una zona
          en especifico de la esfera */
        while (count < 3) {
            try {
                System.out.print("Ingrese el radio mayor: ");
                do {
                    radiomayorCasquete = scanner.nextDouble();
                    if (radiomayorCasquete <= 0) {
                                System.out.println("Valor incorrecto, el radio debe ser positivo");
                                System.out.print("Ingrese el radio mayor: ");
                            }
                } while (radiomayorCasquete <= 0);
                
                System.out.print("Ingrese la altura: ");
                do {
                    alturaCasquete = scanner.nextDouble();
                    if (alturaCasquete <= 0) {
                                System.out.println("Valor incorrecto, la altura debe ser positiva");
                                System.out.print("Ingrese la altura: ");
                            }
                } while (alturaCasquete <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }
        if(count == 3){
            System.out.println("Se agotaron los intentos.");
        }else {
            areaCasquete = 2 * (3.1416) * radiomayorCasquete * alturaCasquete;
            volumenCasquete = (((3.1416) * (alturaCasquete*alturaCasquete)) * ((3*radiomayorCasquete) - alturaCasquete))/3;
            System.out.println("::::::::::::::::::::::::::::::");
            System.out.println("el area del casquete esferico es: "+ areaCasquete);
            System.out.println("el volumen del casquete esferico es: "+ volumenCasquete);
        }

    }
    }
    private static void TroncoPiramide() {
        System.out.println("TRONCO DE PIRAMIDE");

        while (count < 3) {
            try {
                System.out.print("Ingrese la altura: ");
                do {
                    altura = scanner.nextDouble();
                    if (altura <= 0) {
                        System.out.println("Valor incorrecto, la altura debe ser positiva");
                        System.out.print("Ingrese la altura: ");
                    }
                } while (altura <= 0);
                System.out.print("Ingrese la longitud del lado mayor: ");
                do {
                    ladoMayor = scanner.nextDouble();
                    if (ladoMayor <= 0) {
                        System.out.println("Valor incorrecto, la longitud debe ser positiva");
                        System.out.print("Ingrese la longitud del lado mayor: ");
                    }
                } while (ladoMayor <= 0);
                
                System.out.print("Ingrese la longitud del lado menor: ");
                do {
                    ladoMenor = scanner.nextDouble(); 
                    if (ladoMenor <= 0) {
                        System.out.println("Valor incorrecto, la longitud debe ser positiva");
                        System.out.print("Ingrese la longitud del lado menor: ");
                    }
                } while (ladoMenor <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }
        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        aBasemayor = ladoMayor * ladoMayor;
        aBasemenor = ladoMenor * ladoMenor;
        pBasemayor = ladoMayor * 4; //4 es la cant de lados
        pBasemenor = ladoMenor * 4;
        catetoAdyacente = (ladoMayor/2) - ladoMenor;
        apotema = Math.sqrt((altura*altura) + (catetoAdyacente*catetoAdyacente));
        areaLateral = ((pBasemayor + pBasemenor)/2) * apotema;
        areaTotal = areaLateral + aBasemayor + aBasemenor;
        volumen = (altura/3) * (aBasemayor + aBasemenor + Math.sqrt(aBasemayor*aBasemenor));
        
        System.out.println("::::::::::::::::::::::::::");
        System.out.println("El area lateral es: " + areaLateral);
        System.out.println("El area total es: " + areaTotal);
        System.out.println("El volumen es: " + volumen);
        }
    }
    private static void TroncoCono() {

        System.out.println("TRONCO DE CONO");
        while (count < 3) {
            try {
                System.out.print("Ingrese el radio mayor: ");
                do {
                    radiomayor = scanner.nextDouble();
                    if (radiomayor <= 0) {
                        System.out.println("Valor incorrecto, el radiomayor debe ser positivo");
                        System.out.print("Ingrese el radio mayor: ");
                    }
                } while (radiomayor <= 0);
                System.out.print("Ingrese el radio menor: ");
                do {
                    radiomenor = scanner.nextDouble();
                    if (radiomenor <= 0) {
                        System.out.println("Valor incorrecto, el radio menor debe ser positivo");
                        System.out.print("Ingrese el radio menor: ");
                    }
                } while (radiomenor <= 0);
                System.out.print("Ingrese la altura: ");
                do {
                    altura = scanner.nextDouble();
                    if (altura <= 0) {
                        System.out.println("Valor incorrecto, la altura debe ser positiva");
                        System.out.print("Ingrese la altura: ");
                    }
                } while (altura <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }
        
        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        restaRadios = radiomayor - radiomenor;
        generatriz = Math.sqrt((altura*altura) + (restaRadios*restaRadios));
        /* para calcular la generatriz se utiliza una modificacion en la formula de la hipotenusa
         * la resta del radiomayor menos el radiomenor es el que se eleva al cuadrado
         */
        areaLateral = (3.1416) * generatriz * (radiomayor + radiomenor);
        aBasemayor = (3.1416) * (radiomayor * radiomayor);
        aBasemenor = (3.1416) * (radiomenor * radiomenor);
        areaTotal = areaLateral + aBasemayor + aBasemenor;
        volumen = ((3.1416) * altura * ((radiomayor*radiomayor) + (radiomenor*radiomenor) + (radiomayor*radiomenor)))/3;

        System.out.println(":::::::::::::::::::::::::::::::::::");
        System.out.println("El area lateral es: "+ areaLateral);
        System.out.println("El area total es: "+ areaTotal);
        System.out.println("El volumen es: "+ volumen);
        }
    }
    private static void Tetraedro() {
        System.out.println("TETRAEDRO");
        while (count < 3) {
            try {
                System.out.print("Ingrese la arista: ");
                do {
                    arista = scanner.nextDouble();
                    if (arista <= 0) {
                        System.out.println("Valor incorrecto, la arista debe ser positiva");
                        System.out.print("Ingrese la arista: ");
                    }
                } while (arista <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }
        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        area = (arista*arista) * Math.sqrt(3);
        volumen = (Math.sqrt(2)/12) * (arista*arista*arista);
        altura = arista * (Math.sqrt(6)/3);

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El volumen es: " + volumen);
        System.out.println("La altura es: " + altura);
        }
    }
    private static void Prisma() {
        System.out.println("PRISMA");
       while (count < 3) {
         try {
            System.out.print("Introduzca la altura: ");
            do {
                altura = scanner.nextDouble();
                if (altura <= 0) {
                        System.out.println("Valor incorrecto, la altura debe ser positiva");
                        System.out.print("Ingrese la altura: ");
                    }
            } while (altura <= 0);
            System.out.print("Ingrese la longitud del lado: ");
            do {
                distanciaLados = scanner.nextDouble();
                if (distancialados <= 0) {
                        System.out.println("Valor incorrecto, la longitud debe ser positiva");
                        System.out.print("Ingrese la longitud del lado: ");
                    }
            } while (distanciaLados <= 0);
            break;
         } catch (InputMismatchException e) {
            System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
         }
       }
        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        pBase = numeroLados*distanciaLados;
        arealateral = pBase * altura;

        anguloradianes = (3.1416/180) * (360/numeroLados);
        apotema = distanciaLados / (2 * Math.tan(anguloradianes/2));
        aBase = (pBase * apotema)/2;

        areatotal = arealateral + 2 * aBase;
        volumen = aBase * altura;

        System.out.println("El area total es: "+areatotal);
        System.out.println("El area lateral es: "+arealateral);
        System.out.println("El volumen es: "+volumen);
        }
    }
    private static void Piramide() {
        System.out.println("PIRAMIDE");

        while (count < 3) {
            try {
                System.out.print("Ingrese la altura: ");
                do {
                    altura = scanner.nextDouble();
                    if (altura <= 0) {
                        System.out.println("Valor incorrecto, la altura debe ser positiva");
                        System.out.print("Ingrese la altura: ");
                    }
                } while (altura <= 0);
                System.out.print("Ingrese la longitud de los lados: ");
                do {
                    distancialados = scanner.nextDouble();
                    if (distancialados <= 0) {
                        System.out.println("Valor incorrecto, la longitud debe ser positiva");
                        System.out.print("Ingrese la longitud de los lados: ");
                    }
                } while (distanciaLados <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }
        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        apotemaCentral = distancialados/2;

        apotema = Math.sqrt((altura * altura) + (apotemaCentral * apotemaCentral));

        arealateral = ((4 * distancialados) * apotema) / 2 ; 
        // 4 significa que la piramide tiene 4 lados
        aBase = distancialados*distancialados;
        areatotal = arealateral + aBase;
        volumen = (aBase * altura) / 3;

        System.out.println(":::::::::::::::::::::::::::::::::::");

        System.out.println("El area lateral es: " + arealateral);
        System.out.println("El area total es: " + areatotal);
        System.out.println("El volumen es: " + volumen);
        }
    }
    private static void Ortoedro() {
        System.out.println("ORTOEDRO");
        System.out.print("Ingrese la longitud: ");
        do {
            longitudLado = scanner.nextDouble();
        } while (longitudLado <= 0);
        
        System.out.print("Ingrese la anchura: ");
        do {
            ancho = scanner.nextDouble();
        } while (ancho <= 0);
        
        System.out.print("Ingrese la altura: ");
        do {
            altura = scanner.nextDouble();
        } while (altura <= 0);

        area = 2 * ((longitudLado*ancho) + (longitudLado*altura) + (ancho*altura));
        diagonal = Math.sqrt((longitudLado*longitudLado) + (ancho*ancho) + (altura*altura));
        volumen = longitudLado*altura*ancho;

        System.out.println("::::::::::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El diagonal es: "+ diagonal);
        System.out.println("El volumen es: "+ volumen);
    }
    private static void Octaedro() {
         System.out.println("OCTAEDRO");

        while (count < 3) {
            try {
                System.out.print("Ingrese la arista: ");
                do {
                    arista = scanner.nextDouble();
                    if (arista <= 0) {
                        System.out.println("Valor incorrecto, la arista debe ser positiva");
                        System.out.print("Ingrese la arista: ");
                    }
                } while (arista <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }
        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        area = 2* (arista*arista) * Math.sqrt(3);
        volumen = (Math.sqrt(2)/3) * (arista * arista * arista);

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El volumen es: " + volumen);
        }
    }

    private static void HusoEsferico(){
	
    System.out.println("HUSO ESFERICO");

        while (count < 3) {
            try {
                System.out.print("Ingrese el radio: ");
                do {
                    radio = scanner.nextDouble();
                    if (radio <= 0) {
                        System.out.println("Valor incorrecto, el radio debe ser positivo");
                        System.out.print("Ingrese el radio: ");
                    }
                } while (radio <= 0);
                System.out.print("Ingrese los grados: ");
                do {
                    nGrado = scanner.nextDouble();
                    if (nGrado <= 0) {
                        System.out.println("Valor incorrecto, los grados deben ser positivos");
                        System.out.print("Ingrese los grados: ");
                    }
                } while (nGrado <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }        
        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        area = (4 * (3.1416) * (radio*radio) * nGrado)/360;
        System.out.println(":::::::::::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        }

    }
    private static void Icosaedro() {
       System.out.println("ICOSAEDRO");
        while (count < 3) {
            try {
                System.out.print("Ingrese la arista: ");
                do {
                    arista = scanner.nextDouble();
                    if (arista <= 0) {
                        System.out.println("Valor incorrecto, la arista debe ser positiva");
                        System.out.print("Ingrese la arista: ");
                    }
                } while (arista <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }

        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        area = 5 * (arista*arista) * Math.sqrt(3);
        volumen = ((5 * (3 + Math.sqrt(5)))/12) * (arista * arista * arista);

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El volumen es: " + volumen);
        }
    }
    private static void Hexaedro() {
        System.out.println("HEXAEDRO");

        while (count < 3) {
            try {
                System.out.print("Ingrese la arista: ");
                do {
                    arista = scanner.nextDouble();
                    if (arista <= 0) {
                        System.out.println("Valor incorrecto, la arista debe ser positiva");
                        System.out.print("Ingrese la arista: ");
                    }
                } while (arista <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }

        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        area = 4 * (3.1416) * (radio*radio);
        volumen = (1.33) * (3.1416) * radio*radio*radio;

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("El area es: "+area);
        System.out.println("El volumen es: "+volumen);
        }
    }
    private static void Esfera() {
        System.out.println("ESFERA");

        while (count < 3) {
            try {
                System.out.print("Ingrese el radio: ");
                do {
                    radio = scanner.nextDouble();
                    if (radio <= 0) {
                        System.out.println("Valor incorrecto, el radio debe ser positivo");
                        System.out.print("Ingrese el radio: ");
                    }
                } while (radio <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }
        
        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        area = 4 * (3.1416) * (radio*radio);
        volumen = (1.33) * (3.1416) * radio*radio*radio;

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("El area es: "+area);
        System.out.println("El volumen es: "+volumen);
        }
    }
    private static void Dodecaedro() {
        System.out.println("DODECAEDRO");

        while (count < 3) {
            try {
                System.out.print("Ingrese la arista: ");
                do {
                    arista = scanner.nextDouble();
                    if (arista <= 0) {
                        System.out.println("Valor incorrecto, la arista debe ser positiva");
                        System.out.print("Ingrese la arista: ");
                    }
                } while (arista <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }

        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        area = 3* (arista*arista) * Math.sqrt(25 + (10 * (Math.sqrt(5))));
        volumen = ((15 + (7 * (Math.sqrt(5))))/4) * (arista * arista * arista);
        apotema = arista/(1.45);
        areaPentagonal = ((5 * arista)/2) * apotema;

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El volumen es: " + volumen);
        System.out.println("El area pentagonal es: " + areaPentagonal);
        }
    }
    private static void CuñaEsferica() {
        System.out.println("CUÑA ESFERICA");

        while (count < 3) {
            try {
                System.out.print("Introduzca el radio: ");
                do {
                    radio = scanner.nextDouble();
                    if (radio <= 0) {
                        System.out.println("Valor incorrecto, el radio debe ser positivo");
                        System.out.print("Introduzca el radio: ");
                    }
                } while (radio <= 0);

                System.out.print("Ingrese los grados: ");
                do {
                    nGrado = scanner.nextDouble();
                    if (nGrado <= 0) {
                        System.out.println("Valor incorrecto, los grados deben ser positivos");
                        System.out.print("Introduzca los grados: ");
                    }
                } while (nGrado <= 0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }
        if(count == 3){
        System.out.println("Se agotaron los intentos.");
        }else {
        volumen = (4/3)  * ((3.1416) * (radio*radio*radio) * nGrado)/360;

        System.out.println(":::::::::::::::::::::::::::::");
        System.out.println("El volumen es: "+ volumen);
        }
    }
    private static void Cono() {
         System.out.println("CONO");
        
        while (count < 3) {
            try {
                System.out.print("Introduzca la altura: ");
                do {
                    altura = scanner.nextDouble();
                    if (altura <= 0) {
                        System.out.println("Valor incorrecto, la altura debe ser positivo");
                        System.out.print("Introduzca la altura: ");
                    }
                } while (altura <= 0);

                System.out.print("Introduzca el radio: ");
                do {
                    radio = scanner.nextDouble();
                    if (radio <= 0) {
                        System.out.println("Valor incorrecto, el radio debe ser positivo");
                        System.out.print("Introduzca el radio: ");
                    }
                } while (radio <= 0);
                
                break;

            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            }
        }
        if(count == 3){
            System.out.println("Se agotaron los intentos.");
        }else {
        generatriz = Math.sqrt((altura*altura) + (radio*radio));
        arealateral = (3.1416) * radio * generatriz;
        areatotal = (3.1416) * radio * (generatriz + radio);
        volumen = ((3.1416) * (radio*radio) * altura)/3;

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("El area lateral es: " + arealateral);
        System.out.println("El area total es: "+ areatotal);
        System.out.println("El volumen es: "+ volumen);
        }
    }
    private static void Cilindro() {
        System.out.println("CILINDRO");
        while (count < 3) {
            try {
                System.out.print("Introduzca el radio: ");
                do {
                    radio = scanner.nextDouble();
                    if (radio <= 0) {
                        System.out.println("Valor incorrecto, el radio debe ser positivo");
                        System.out.print("Introduzca el radio: ");
                    }
                } while (radio <= 0);
                
                System.out.print("Introduzca la altura: ");
                do {
                    altura = scanner.nextDouble();
                    if (altura <= 0) {
                        System.out.println("Valor incorrecto, la altura debe ser positivo");
                        System.out.print("Introduzca la altura: ");
                    }
                } while (altura <= 0);
                
                break;
                
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, intente nuevamente.");
                scanner.nextLine();
                count++;
            } 
        }
        if(count == 3){
            System.out.println("Se agotaron los intentos.");
        }else {
            arealateral = 2 * (3.1416) * radio * altura;
            areatotal = 2 * (3.1416) * radio * (altura + radio);
            volumen = (3.1416) * (radio * radio) * altura;
        
            System.out.println("el area lateral es: " + arealateral);
            System.out.println("el area total es: " + areatotal);
            System.out.println("el volumen es: " + volumen);
        }
    
}
    