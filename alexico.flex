/*Seccion de codigo de usuario*/
package analizadorlex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//clase de los token devueltos
class Yytoken {
    Yytoken (int numToken,String token, String tipo, int linea, int columna){
        //Contador para el número de tokens reconocidos
        this.numToken = numToken;
        //String del token reconocido
        this.token = new String(token);
        //Tipo de componente léxico encontrado
        this.tipo = tipo;
        //Número de linea
        this.linea = linea;
        //Columna donde empieza el primer carácter del token
        this.columna = columna;
    }
    //Métodos de los atributos de la clase
    public int numToken;
    public String token;
    public String tipo;
    public int linea;
    public int columna;
    //Metodo que devuelve los datos necesarios que escribiremos en un archive de salida
    public String toString() {
        return "Token #"+numToken+": "+token+" C.Lexico: "+tipo+" ["+linea
        + "," +columna + "]";
    }
}

/* Seccion de opciones y declaraciones de JFlex */
%% //inicio de opciones
//Cambiamos el nombre la funcion para el siguiente token por nextToken
%function nextToken
//Clase publica
%public
//Cambiamos el nombre de la clase del analizador
%class AnalizadorLexico
//Agregamos soporte a unicode
%unicode
//Codigo java
%{
	
    private int contador;
    private ArrayList<Yytoken> tokens;

	private void writeOutputFile() throws IOException{
			String filename = "file.out";
			BufferedWriter out = new BufferedWriter(
				new FileWriter(filename));
            System.out.println("\n*** Tokens guardados en archivo ***\n");
			for(Yytoken t: this.tokens){
				System.out.println(t);
				out.write(t + "\n");
			}
			out.close();
	}
%}
//Creamos un contador para los tokens
%init{
    contador = 0;
	tokens = new ArrayList<Yytoken>();
%init}
//Cuando se alcanza el fin del archivo de entrada
%eof{
	try{
		this.writeOutputFile();
        System.exit(0);
	}catch(IOException ioe){
		ioe.printStackTrace();
	}
%eof}
//Activar el contador de lineas, variable yyline
%line
//Activar el contador de columna, variable yycolumn
%column
//Fin de opciones

//Expresiones regulares
//Declaraciones
EXP_ALPHA=[A-Za-z]
EXP_DIGITO=[0-9]
EXP_ALPHANUMERIC={EXP_ALPHA}|{EXP_DIGITO}
NUMERO=({EXP_DIGITO})+
IDENTIFICADOR={EXP_ALPHA}({EXP_ALPHANUMERIC})*
ESPACIO=" "

SALTO=\n|\r|\r\n
TIPO_CADENA="\""({ESPACIO}|{EXP_ALPHANUMERIC})*"\""
COMENTARIOUNO="\-"({ESPACIO}|{EXP_ALPHANUMERIC})*"\-"
COMENTARIODOS="\*"({ESPACIO}|{EXP_ALPHANUMERIC})*"\*"
//fin declaraciones

/* Seccion de reglas lexicas */
%% 
//Regla     {Acciones}

{NUMERO}    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"num",yyline,yycolumn);
    tokens.add(t);
    return t;
}
{COMENTARIOUNO}    {
//    contador++;
//    Yytoken t = new Yytoken(contador,yytext(),"comentariotipouno",yyline,yycolumn);
//    tokens.add(t);
//    return t;
}
{COMENTARIODOS}    {
//    contador++;
//    Yytoken t = new Yytoken(contador,yytext(),"comentariotipouno",yyline,yycolumn);
//    tokens.add(t);
//    return t;
}
"Int"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"tipo_entero",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"Bool"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"tipo_booleano",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"String"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"tipo_cadena",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"SELF_TYPE"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"tipo_this",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"class"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"class",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"else"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"else",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"false"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"false",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"fi"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"fi",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"if"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"if",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"in"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"in",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"inherits"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"inherits",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"isvoid"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"isvoid",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"let"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"let",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"loop"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"loop",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"pool"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"pool",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"then"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"then",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"while"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"while",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"case"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"case",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"esac"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"esac",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"new"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"new",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"of"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"of",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"not"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"not",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"true"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"true",yyline,yycolumn);
    tokens.add(t);
    return t;
}
{IDENTIFICADOR}   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"id",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"+="  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"asigna_suma",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"+"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"suma",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"*"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"multiplicacion",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"/"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"division",yyline,yycolumn);
    tokens.add(t);
    return t;
}


"="  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"asigna",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"-"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"resta",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"<"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"menora",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"<="  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"menoroiguala",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"<-"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"asignacionizquierda",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"{"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"llaveizquierda",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"}"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"llavederecha",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"("  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"parentesisizquierdo",yyline,yycolumn);
    tokens.add(t);
    return t;
}
")"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"parentesisderecho",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"=>"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"asignacionderecha",yyline,yycolumn);
    tokens.add(t);
    return t;
}




/*Los metacaracteres es necesario usar la secuencia de escape */
"\^"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"potencia",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"\;"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"puntoycoma",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"\,"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"coma",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"\@"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"arroba",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"\~"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"circunflejo",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"\:"  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"dospuntos",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"\."  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"dospuntos",yyline,yycolumn);
    tokens.add(t);
    return t;
}

{ESPACIO} {
 	//ignorar
}
{TIPO_CADENA}
{
 contador++;
    Yytoken t = new Yytoken(contador,yytext(),"cadena",yyline,yycolumn);
    tokens.add(t);
    return t;
}
{SALTO} {
    //contador++;
    //Yytoken t = new Yytoken(contador,"","fin_linea",yyline,yycolumn);
    //tokens.add(t);
    //return t;
}
