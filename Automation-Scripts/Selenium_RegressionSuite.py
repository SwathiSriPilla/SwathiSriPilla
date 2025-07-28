# Selenium Python Example: Verify Homepage Title
from selenium import webdriver

driver = webdriver.Chrome()
driver.get("https://example.com")
print("Page Title:", driver.title)
driver.quit()
