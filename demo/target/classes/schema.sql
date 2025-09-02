
-- Master table: Remedies (Organic solution to pest problems)
CREATE TABLE IF NOT EXISTS organic_remedies(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    crop VARCHAR(100) NOT NULL,
    symptom VARCHAR(255) NOT NULL,
    solution VARCHAR(225) NOT NULL,
    dosage VARCHAR(100) NOT NULL
);

--Reports table: Farmer reports to pest problems
CREATE TABLE pest_reports(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    crop VARCHAR(100) NOT NULL,
    symptom VARCHAR(255) NOT NULL,
    chosen_solution VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    severity VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);