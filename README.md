# **MaskSensitive - Java Custom Annotation for Masking Sensitive Data**  

## 📌 Overview  
The **MaskSensitive** project introduces a **custom Java annotation (`@MaskSensitive`)** to mask sensitive fields (e.g., passwords, credit card numbers) when logging objects. This ensures that **sensitive data is not exposed in logs**, enhancing security in Java applications.  

## ✨ Features  
- **Custom annotation (`@MaskSensitive`)** to mark sensitive fields.  
- **Automatic data masking** for logs using reflection.  
- **Lightweight and easy to integrate** with existing Java applications.  
- **Enhances security** by preventing accidental exposure of sensitive data.  

## 🎯 Use Cases  
- **Logging sensitive data securely**: Ensures that sensitive information (passwords, credit card numbers, API keys) is never printed in logs.  
- **Compliance with security standards**: Helps follow **GDPR, PCI-DSS**, and other data protection regulations.  
- **Reducing manual masking efforts**: Automatically replaces sensitive data with `****`, reducing the need for manual logging sanitization.  

