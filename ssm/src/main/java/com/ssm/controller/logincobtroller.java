package com.ssm.controller;

import com.ssm.mapper.BillMapper;
import com.ssm.mapper.ProviderMapper;
import com.ssm.mapper.UserMapper;
import com.ssm.pojo.Bill;
import com.ssm.pojo.Provider;
import com.ssm.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class logincobtroller {
    @Autowired
    private SqlSessionTemplate template;
    @RequestMapping("login.do")
    public   String   login(HttpServletRequest request, User user){
        UserMapper mapper = template.getMapper(UserMapper.class);
        List<User> query = mapper.findAll(null);
        request.getSession().setAttribute("users",query);
        System.out.println(query);
        if (!query.isEmpty()){
            return  "frame";
        }else {
            return  "../login";

        }

    }

    @RequestMapping("bill.do")
    public  String billQuery(Model model, Bill bill){
        if (bill.getProductname()!=null) {
            bill.setProductname("%" + bill.getProductname() + "%");
        }
        System.out.println(bill);
        BillMapper mapper = template.getMapper(BillMapper.class);
        List<Bill> query = mapper.findAll(bill);
        ProviderMapper mapper1 = template.getMapper(ProviderMapper.class);
        List<Provider> query1 = mapper1.findAll(null);
        model.addAttribute("prolist",query1);
        model.addAttribute("billList",query);
        return  "billlist";
    }

    @RequestMapping("billId.do")
    public String billId(Model model,Bill bill){
        System.out.println(bill.getId());
        BillMapper mapper = template.getMapper(BillMapper.class);
        List<Bill> billList = mapper.findAll(bill);
        model.addAttribute("billList",billList);
        return  "billview";
    }

    @RequestMapping("billupdate.do")
    public String billupdate(Model model,int id){
        System.out.println(id);
        BillMapper mapper = template.getMapper(BillMapper.class);
        Bill bill = mapper.findId(id);

        ProviderMapper mapper1 = template.getMapper(ProviderMapper.class);
        List<Provider> query1 = mapper1.findAll(null);

        model.addAttribute("prolist",query1);
        model.addAttribute("bill",bill);
        return  "billmodify";
    }
    @RequestMapping("bilupdate.do")
    public String update(Model model,Bill bill){
        BillMapper mapper = template.getMapper(BillMapper.class);
        System.out.println(bill);
        mapper.update(bill);

        List<Bill> all = mapper.findAll(bill);


        model.addAttribute("billList",all);
        ProviderMapper mapper1 = template.getMapper(ProviderMapper.class);
        List<Provider> all1 = mapper1.findAll(null);
        model.addAttribute("prolist",all1);
        return "billlist";
    }
    /*删除*/
    @RequestMapping("billdel.do")
    public String del(int id){
        BillMapper mapper = template.getMapper(BillMapper.class);
        mapper.del(id);
        return "frame";
    }
}
