/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.nfx.util;

import java.io.Serializable;

/**
 *
 * @author cristiano.andrade
 */
public class Anexo implements Serializable{
    
    public static final String MIME_TYPE_PDF = "application/pdf";
    public static final String MIME_TYPE_XML = "application/xml";
    public static final String MIME_TYPE_JPEG = "image/jpeg";
    
    private byte[] conteudo;
    private String nomeArquivo;
    private String mime;
    
    public Anexo(){
        
    }
    
    public Anexo(byte[] conteudo, String nomeArquivo, String mime){
        this.conteudo = conteudo;
        this.nomeArquivo = nomeArquivo;
        this.mime = mime;
    }
    
    public byte[] getConteudo() {
        return conteudo;
    }
    
    public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
    }
    
    public String getNomeArquivo() {
        return nomeArquivo;
    }
    
    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    public String getMime() {
        return mime;
    }
    
    public void setMime(String mime) {
        this.mime = mime;
    }
}

/*
 tipo do mime                   extensão
application/hta                 hta
application/java                class
application/java-byte-code      class
application/msword              doc
application/msword              dot
application/octet-stream        *
application/octet-stream        bin
application/octet-stream        class
application/octet-stream        dms
application/octet-stream        exe
application/octet-stream        lha
application/octet-stream        lzh
application/pdf                 pdf
application/rtf                 rtf
application/vnd.ms-excel        xla
application/vnd.ms-excel        xlc
application/vnd.ms-excel        xlm
application/vnd.ms-excel        xls
application/vnd.ms-excel        xlt
application/vnd.ms-excel        xlw
application/vnd.ms-powerpoint	pot
application/vnd.ms-powerpoint	pps
application/vnd.ms-powerpoint	ppt
application/winhlp              hlp
application/x-compressed	zip
application/x-gzip              gz
application/x-java-class	class
application/x-javascript	js
application/x-mplayer2          asx
application/x-msaccess          mdb
application/x-tar               tar
application/x-zip-compressed	zip
application/xml                 xml
application/zip                 zip
audio/basic                     au
audio/basic                     snd
audio/mid                       mid
audio/mid                       rmi
audio/mpeg                      mp3
audio/x-mpegurl                 m3u
audio/x-pn-realaudio            ra
audio/x-pn-realaudio            ram
audio/x-wav                     wav
image/bmp                       bmp
image/gif                       gif
image/jpeg                      jpe
image/jpeg                      jpeg
image/jpeg                      jpg
image/x-icon                    ico
multipart/x-zip                 zip 
text/asp                        asp
text/css                        css
text/html                       htm
text/html                       html
text/html                       stm
text/plain                      bas
text/plain                      c
text/plain                      h
text/plain                      txt
text/richtext                   rtx
text/x-component                htc
text/xml                        xml
video/mpeg                      mp2
video/mpeg                      mpa
video/mpeg                      mpe
video/mpeg                      mpeg
video/mpeg                      mpg
video/mpeg                      mpv2
video/quicktime                 mov
video/quicktime                 qt
video/x-la-asf                  lsf
video/x-la-asf                  lsx
video/x-ms-asf                  asf
video/x-ms-asf                  asr
video/x-ms-asf                  asx
video/x-ms-asf                  asx
video/x-msvideo                 avi
video/x-sgi-movie               movie
x-world/x-vrml                  flr
x-world/x-vrml                  vrml
x-world/x-vrml                  wrl
x-world/x-vrml                  wrz
x-world/x-vrml                  xaf
x-world/x-vrml                  xof
 **/
