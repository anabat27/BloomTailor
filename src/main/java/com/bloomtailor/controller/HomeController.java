package com.bloomtailor.controller;

import com.bloomtailor.model.Bouquet;
import com.bloomtailor.model.Flower;
import com.bloomtailor.model.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<Flower> flowers = Arrays.asList(
                new Flower(1L, "Rose", "rose.jpg", "Red", 2.50),
                new Flower(2L, "Tulip", "tulip.jpg", "Pink", 1.80),
                new Flower(3L, "Lily", "lily.jpg", "White", 3.00),
                new Flower(4L, "Sunflower", "sunflower.jpg", "Yellow", 2.00),
                new Flower(5L, "Orchid", "orchid.jpg", "Purple", 4.50),
                new Flower(6L, "Daisy", "daisy.jpg", "White", 1.50)
        );

        List<Bouquet> bouquets = Arrays.asList(
                new Bouquet(1L, "Spring Mix", "spring-mix.jpg", "Fresh spring flowers", 35.00, true),
                new Bouquet(2L, "Elegant White", "elegant-white.jpg", "White flowers for elegant occasions", 45.00, false),
                new Bouquet(3L, "Romantic Red", "romantic-red.jpg", "Red roses for romantic occasions", 50.00, true),
                new Bouquet(4L, "Wildflowers", "wildflowers.jpg", "Natural wildflower arrangement", 30.00, true),
                new Bouquet(5L, "Premium Roses", "premium-roses.jpg", "Our finest rose selection", 55.00, false),
                new Bouquet(6L, "Tropical Vibes", "tropical-vibes.jpg", "Exotic tropical flowers", 40.00, true)
        );

        List<Store> stores = Arrays.asList(
                new Store(1L, "BloomTailor Central", "Strada Florilor 15, Sector 1", "+40 123 456 789", "Mon-Sun: 9:00-20:00"),
                new Store(2L, "BloomTailor North", "Bulevardul Primaverii 22, Sector 1", "+40 987 654 321", "Mon-Sun: 10:00-19:00")
        );

        model.addAttribute("flowers", flowers);
        model.addAttribute("bouquets", bouquets); // ✅ FIXED
        model.addAttribute("stores", stores);

        return "home";
    }
}