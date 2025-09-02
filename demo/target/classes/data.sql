
--Sample Data for organic_remedies
INSERT INTO organic_remedies(crop, symptom, solution, dosage) VALUES
('Tomato','Leaf Curl','Neem Oil Spray','20ml per liter of water'),
('Tomato','Yellow Leaves','Turmeric Spray','50g turmeric in 1 liter water'),
('Tomato','Fruit Rot','Cow Dung Slurry','Mix 1kg in 10 liter water'),
('Tomato','White flies','Garlic-Chili Extract','100 ml per liter'),
('Wheat','Brown Spots','Wood Ash Dusting','Sprinkle ash over affected area'),
('Wheat','Rust Fungus','Garlic Decoction','Boil 100g garlic in 1 liter water'),
('Wheat','Yellow Rust','Turmeric Solution','30 g per liter'),
('Rice','Stem Borer','Garlic-Chili Spray','100g garlic + 50g chili in 1 liter water'),
('Rice','Leaf Blast','Butter Milk Spray','Dilute 1 liter buttermilk in 5 liters water'),
('Rice','Stem Borer','Ash Dusting','1 handful per plant base'),
('Chilli','Aphids','Soap Water Spray','5ml liquid soap in 1 liter of water'),
('Chilli','Leaf Curl','Neem-Karanja Oil Mix','10ml each per liter of water'),
('Cotton','Bollworm','Neem Seed Kernel Extract','60 ml per liter');

-- Sample Data for pest_reports
INSERT INTO pest_reports(crop, symptom, chosen_solution, location, severity) VALUES
('Tomato','Leaf Curl','Neem Oil Spray','Bangalore','MEDIUM'),
('Rice','Stem Borer','Ash Dusting','Mysore','HIGH'),
('Cotton','Bollworm','Neem Seed Kernel Extract','Tumkur','LOW');