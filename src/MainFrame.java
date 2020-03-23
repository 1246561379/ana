
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javaapplication3.HttpClient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chu
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtURL1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtnStart1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jtxtEncoding1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtURL2 = new javax.swing.JTextField();
        jbtnStart2 = new javax.swing.JButton();
        jtxtEncoding2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtURL3 = new javax.swing.JTextField();
        jbtnStart3 = new javax.swing.JButton();
        jtxtEncoding3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtURL1.setText("https://www.163.com/index.html");
        jtxtURL1.setName("jtxtURL1"); // NOI18N

        jLabel1.setText("Address");

        jbtnStart1.setText("start");
        jbtnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnStart1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jtxtEncoding1.setText("GBK");

        jLabel2.setText("Address");

        jtxtURL2.setText("http://www.people.com.cn/index.html");
        jtxtURL2.setName("jtxtURL"); // NOI18N

        jbtnStart2.setText("start");
        jbtnStart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnStart2ActionPerformed(evt);
            }
        });

        jtxtEncoding2.setText("gb2312");

        jLabel3.setText("Address");

        jtxtURL3.setText("http://www.gov.cn/index.html");
        jtxtURL3.setName("jtxtURL"); // NOI18N

        jbtnStart3.setText("start");
        jbtnStart3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnStart3ActionPerformed(evt);
            }
        });

        jtxtEncoding3.setText("utf-8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtxtURL3, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnStart3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtEncoding3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtxtURL2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnStart2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtEncoding2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtxtURL1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtEncoding1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtURL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jbtnStart1)
                    .addComponent(jtxtEncoding1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtURL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbtnStart2)
                    .addComponent(jtxtEncoding2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtURL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jbtnStart3)
                    .addComponent(jtxtEncoding3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
        );

        jtxtURL1.getAccessibleContext().setAccessibleName("jtxtURL");
        jbtnStart1.getAccessibleContext().setAccessibleName("jbtnParse");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnStart1ActionPerformed
        String url=jtxtURL1.getText();
        String encoding = jtxtEncoding1.getText();        
        HttpClient cl = new HttpClient(url,encoding);        
        
        parseHTML(url,encoding);
        jTextArea1.append(cl.doGet(encoding)); 
        /*
        System.err.println("number of hrefs:" + cl.getHrefs().size());
        
        for(java.util.Iterator itr=cl.getHrefs().iterator();itr.hasNext();) {
            HttpClient cl2 = new HttpClient(strURL);
            //System.err.println("ther should be an address:");
            System.err.println(itr.next().toString());
            System.err.println(cl2.doGet());
            //jTextArea1.append(itr.next().toString() + "\n");
            //jTextArea1.append(cl2.Html2Text(cl2.doGet(itr.next().toString())));
            //jTextArea1.repaint();
        
        } 
        */ 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnStart1ActionPerformed

    private void jbtnStart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnStart2ActionPerformed
        // TODO add your handling code here:
        String url=jtxtURL2.getText();
        String encoding = jtxtEncoding2.getText();        
        HttpClient cl = new HttpClient(url,encoding);        
        
        parseHTML(url,encoding);
        jTextArea1.append(cl.doGet(encoding)); 
    }//GEN-LAST:event_jbtnStart2ActionPerformed

    private void jbtnStart3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnStart3ActionPerformed
        // TODO add your handling code here:
        testHashMap();
        
    }//GEN-LAST:event_jbtnStart3ActionPerformed
    
    private void testReg(){
        
        String str = "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\">\n" +
                    "<meta charset=\"gb2312\">\n" +
                    "<meta charset=\"iso-8859-1\">\n"
                ;
        
        
        String reg_charset = "(?<=charset=\")[\\w\\-\\d]+";  
        String encoding = "";
        Pattern p = Pattern.compile(reg_charset);  
        Matcher m = p.matcher(str);  
        
        while (m.find()) {
            encoding = m.group();
            //encoding=encoding.replaceAll(" ", "");
            //encoding = encoding.substring(8, encoding.length()-1);
            System.err.println("encoding string:" + encoding);                
        } 
    }
    
        private void testHashMap(){
        String txt = "天地玄黄，宇宙洪荒。 \n" +
"日月盈昃，辰宿列张。 \n" +
"寒来暑往，秋收冬藏。 \n" +
"闰余成岁，律吕调阳。 \n" +
"云腾致雨，露结为霜。 \n" +
"金生丽水，玉出昆冈。 \n" +
"剑号巨阙，珠称夜光。 \n" +
"果珍李柰，菜重芥姜。 \n" +
"海咸河淡，鳞潜羽翔。 \n" +
"龙师火帝，鸟官人皇。 \n" +
"始制文字，乃服衣裳。 \n" +
"推位让国，有虞陶唐。 \n" +
"吊民伐罪，周发殷汤。 \n" +
"坐朝问道，垂拱平章。 \n" +
"爱育黎首，臣伏戎羌。 \n" +
"遐迩一体，率宾归王。 \n" +
"鸣凤在竹，白驹食场。 \n" +
"化被草木，赖及万方。 \n" +
"盖此身发，四大五常。 \n" +
"恭惟鞠养，岂敢毁伤。 \n" +
"女慕贞洁，男效才良。 \n" +
"知过必改，得能莫忘。 \n" +
"罔谈彼短，靡恃己长。 \n" +
"信使可覆，器欲难量。 \n" +
"墨悲丝染，诗赞羔羊。 \n" +
"景行维贤，克念作圣。 \n" +
"德建名立，形端表正。 \n" +
"空谷传声，虚堂习听。 \n" +
"祸因恶积，福缘善庆。 \n" +
"尺璧非宝，寸阴是竞。 \n" +
"资父事君，曰严与敬。 \n" +
"孝当竭力，忠则尽命。 \n" +
"临深履薄，夙兴温凊。 \n" +
"似兰斯馨，如松之盛。 \n" +
"川流不息，渊澄取映。 \n" +
"容止若思，言辞安定。 \n" +
"笃初诚美，慎终宜令。 \n" +
"荣业所基，籍甚无竟。 \n" +
"学优登仕，摄职从政。 \n" +
"存以甘棠，去而益咏。 \n" +
"乐殊贵贱，礼别尊卑。 \n" +
"上和下睦，夫唱妇随。 \n" +
"外受傅训，入奉母仪。 \n" +
"诸姑伯叔，犹子比儿。 \n" +
"孔怀兄弟，同气连枝。 \n" +
"交友投分，切磨箴规。 \n" +
"仁慈隐恻，造次弗离。 \n" +
"节义廉退，颠沛匪亏。 \n" +
"性静情逸，心动神疲。 \n" +
"守真志满，逐物意移。 \n" +
"坚持雅操，好爵自縻。 \n" +
"都邑华夏，东西二京。 \n" +
"背邙面洛，浮渭据泾。 \n" +
"宫殿盘郁，楼观飞惊。 \n" +
"图写禽兽，画彩仙灵。 \n" +
"丙舍旁启，甲帐对楹。 \n" +
"肆筵设席，鼓瑟吹笙。 \n" +
"升阶纳陛，弁转疑星。 \n" +
"右通广内，左达承明。 \n" +
"既集坟典，亦聚群英。 \n" +
"杜稿钟隶，漆书壁经。 \n" +
"府罗将相，路侠槐卿。 \n" +
"户封八县，家给千兵。 \n" +
"高冠陪辇，驱毂振缨。 \n" +
"世禄侈富，车驾肥轻。 \n" +
"策功茂实，勒碑刻铭。 \n" +
"盘溪伊尹，佐时阿衡。 \n" +
"奄宅曲阜，微旦孰营。 \n" +
"桓公匡合，济弱扶倾。 \n" +
"绮回汉惠，说感武丁。 \n" +
"俊义密勿，多士实宁。 \n" +
"晋楚更霸，赵魏困横。 \n" +
"假途灭虢，践土会盟。 \n" +
"何遵约法，韩弊烦刑。 \n" +
"起翦颇牧，用军最精。 \n" +
"宣威沙漠，驰誉丹青。 \n" +
"九州禹迹，百郡秦并。 \n" +
"岳宗泰岱，禅主云亭。 \n" +
"雁门紫塞，鸡田赤诚。 \n" +
"昆池碣石，钜野洞庭。 \n" +
"旷远绵邈，岩岫杳冥。 \n" +
"治本于农，务兹稼穑。 \n" +
"俶载南亩，我艺黍稷。 \n" +
"税熟贡新，劝赏黜陟。 \n" +
"孟轲敦素，史鱼秉直。 \n" +
"庶几中庸，劳谦谨敕。 \n" +
"聆音察理，鉴貌辨色。 \n" +
"贻厥嘉猷，勉其祗植。 \n" +
"省躬讥诫，宠增抗极。 \n" +
"殆辱近耻，林皋幸即。 \n" +
"两疏见机，解组谁逼。 \n" +
"索居闲处，沉默寂寥。 \n" +
"求古寻论，散虑逍遥。 \n" +
"欣奏累遣，戚谢欢招。 \n" +
"渠荷的历，园莽抽条。 \n" +
"枇杷晚翠，梧桐蚤凋。 \n" +
"陈根委翳，落叶飘摇。 \n" +
"游鹍独运，凌摩绛霄。 \n" +
"耽读玩市，寓目囊箱。 \n" +
"易輶攸畏，属耳垣墙。 \n" +
"具膳餐饭，适口充肠。 \n" +
"饱饫烹宰，饥厌糟糠。 \n" +
"亲戚故旧，老少异粮。 \n" +
"妾御绩纺，侍巾帷房。 \n" +
"纨扇圆洁，银烛炜煌。 \n" +
"昼眠夕寐，蓝笋象床。 \n" +
"弦歌酒宴，接杯举殇。 \n" +
"矫手顿足，悦豫且康。 \n" +
"嫡后嗣续，祭祀烝尝。 \n" +
"稽颡再拜，悚惧恐惶。 \n" +
"笺牒简要，顾答审详。 \n" +
"骸垢想浴，执热愿凉。 \n" +
"驴骡犊特，骇跃超骧。 \n" +
"诛斩贼盗，捕获叛亡。 \n" +
"布射僚丸，嵇琴阮箫。 \n" +
"恬笔伦纸，钧巧任钓。 \n" +
"释纷利俗，并皆佳妙。 \n" +
"毛施淑姿，工颦妍笑。 \n" +
"年矢每催，曦晖朗曜。 \n" +
"璇玑悬斡，晦魄环照。 \n" +
"指薪修祜，永绥吉劭。 \n" +
"矩步引领，俯仰廊庙。 \n" +
"束带矜庄，徘徊瞻眺。 \n" +
"孤陋寡闻，愚蒙等诮。 \n" +
"谓语助者，焉哉乎也。";
    HashMap<Character,Integer> words = new HashMap<>();
        for(int i=0;i<txt.length();i++){
            Character c =txt.charAt(i);
            if(words.containsKey(c)){
                words.put(c,1+words.get(c));
            }else{
                words.put(c, 1);
            }
        }
         Set<Character> keys=words.keySet();
         keys.forEach((key) -> {
             int value=words.get(key);
             System.out.println("key:"+key+"  and  value:"+value);
        });
        
    }
    
    private void parseHTML(String url,String encoding){
        

        HttpClient cl = new HttpClient(url,encoding);
        
        jTextArea1.append(cl.doGet(encoding));  
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });        
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnStart1;
    private javax.swing.JButton jbtnStart2;
    private javax.swing.JButton jbtnStart3;
    private javax.swing.JTextField jtxtEncoding1;
    private javax.swing.JTextField jtxtEncoding2;
    private javax.swing.JTextField jtxtEncoding3;
    private javax.swing.JTextField jtxtURL1;
    private javax.swing.JTextField jtxtURL2;
    private javax.swing.JTextField jtxtURL3;
    // End of variables declaration//GEN-END:variables
}