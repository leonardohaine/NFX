/*    */ package br.com.nfx.util;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.Field;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ public class EntityBase
/*    */ {
/*    */   public String toString()
/*    */   {
/* 15 */     StringBuffer sb = new StringBuffer();
/* 16 */     String tableName = "";
/*    */ 
/* 18 */     Annotation[] annotationsClass = getClass().getAnnotations();
/* 19 */     for (Annotation annotation : annotationsClass) {
/* 20 */       if (annotation.annotationType().equals(Table.class)) {
/* 21 */         Table t = (Table)annotation;
/* 22 */         tableName = t.name();
/* 23 */         sb.append("<");
/* 24 */         sb.append(tableName);
/* 25 */         sb.append(">");
/*    */ 
/* 27 */         break;
/*    */       }
/*    */     }
/* 30 */     Field[] declaredFields = getClass().getDeclaredFields();
/* 31 */     for (Field field : declaredFields) {
/* 32 */       Annotation[] annotations = field.getAnnotations();
/* 33 */       for (Annotation annotation : annotations)
/* 34 */         if (annotation.annotationType().equals(Column.class)) {
/* 35 */           Column c = (Column)annotation;
/* 36 */           sb.append("<");
/* 37 */           sb.append(c.name());
/* 38 */           sb.append(">");
/*    */           try
/*    */           {
/* 43 */             field.setAccessible(true);
/* 44 */             if (field.get(this) != null)
/* 45 */               sb.append(field.get(this));
/*    */           }
/*    */           catch (Exception e) {
/* 48 */             throw new RuntimeException(e);
/*    */           }
/*    */ 
/* 51 */           sb.append("</");
/* 52 */           sb.append(c.name());
/* 53 */           sb.append(">");
/*    */         } else {
/* 55 */           if (!annotation.annotationType().equals(EmbeddedId.class)) continue;
/*    */           try {
/* 57 */             field.setAccessible(true);
/* 58 */             EntityBase embeddedIdField = (EntityBase)field.get(this);
/* 59 */             if (embeddedIdField == null)
/* 60 */               sb.append("null");
/*    */             else
/* 62 */               sb.append(embeddedIdField.toString());
/*    */           } catch (Exception e) {
/* 64 */             throw new RuntimeException(e);
/*    */           }
/*    */         }
/*    */     }
/* 68 */     if (!"".equals(tableName)) {
/* 69 */       sb.append("</");
/* 70 */       sb.append(tableName);
/* 71 */       sb.append(">");
/*    */     }
/*    */ 
/* 75 */     return sb.toString();
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.EntityBase
 * JD-Core Version:    0.6.0
 */