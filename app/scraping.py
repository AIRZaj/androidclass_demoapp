import requests
import json
from bs4 import BeautifulSoup
#       pip install beautifulsoup4

idArray = ["0490021500","0490021400", "0490020100", "0490020200", "0490030200", "0490030100", "0490030500", "0490030300", "0490030400"]
people_data = []


def get_mail(html):
    soup = BeautifulSoup(html.content, "html.parser")
    mail = soup.select_one(".address-book-result__list__user-email a")
    email = mail.text.strip() if mail else None
    return email

def parse_all_people(html):
    soup = BeautifulSoup(html.content, "html.parser")
    person_blocks = soup.find_all("div", class_="list-people__item__wrapper")
    for block in person_blocks:
        person_data = {}
        # Tytuł naukowy (np. dr)
        title_tag = block.find("span")
        person_data['tytul'] = title_tag.text.strip() if title_tag else None
        # Imię i nazwisko oraz link
        name_tag = block.find("a", class_="list-people__item__title")
        if name_tag:
            #person_data['imie_nazwisko'] = name_tag.text.strip()
            x = name_tag.text.strip()
            y = x.split()
            person_data['imie'] = y[0]
            person_data['nazwisko'] = y[1]
            person_data['profil_url'] = name_tag['href']
        else:
            person_data['imie_nazwisko'] = None
            person_data['profil_url'] = None
        # Stanowisko i jednostka
        stanowisko_tag = block.find("ul", style=lambda value: value and "margin-bottom" in value)
        if stanowisko_tag:
            stanowisko_text = stanowisko_tag.get_text(strip=True)
            person_data['stanowisko'] = stanowisko_text
        else:
            person_data['stanowisko'] = None
        # Link do serwisu
        link_serwis = block.select_one(".person__list__item-mail a")
        person_data['link_do_serwisu_USOS'] = link_serwis['href'] if link_serwis else None
        # Pokój
        pokoj_tag = block.find("li", class_="person__list__item-mark")
        if pokoj_tag != None:
            p = pokoj_tag.text
            p = p.replace(" (Collegium Physicum)", "")
            p = p.replace(" (Obserwatorium Astronomiczne)", "")
            if pokoj_tag.text.find("(Collegium Physicum)") > 0:
                b="Collegium Physicum"
            else:
                b="Obserwatorium Astronomiczne"
            person_data['pokoj'] = p if pokoj_tag else None
            person_data['budynek'] = b if pokoj_tag else None
        #Telefon
        tel_tag = block.find("li", class_="person__list__item-tel")
        #tel_tag = tel_tag.text
        if tel_tag != None:
            t = tel_tag.text.replace(" ", "")
            t = t.replace("-", "")
            t = t.replace("+48", "")
            person_data['telefon'] = t if tel_tag else None


        #Mail
        newlink = requests.get("https://amu.edu.pl/uniwersytet/wyszukiwarka-pracownikow?query="+person_data['imie']+"+"+person_data['nazwisko']+"&submit_button=Szukaj&restrict=All")
        print("https://amu.edu.pl/uniwersytet/wyszukiwarka-pracownikow?query="+person_data['imie']+"+"+person_data['nazwisko']+"&submit_button=Szukaj&restrict=All")
        person_data['mail']=get_mail(newlink)
        # Konsultacje
        konsultacje_tag = block.find("li", class_="person__list__item-time")
        if konsultacje_tag:
            konsultacje_text = konsultacje_tag.get_text(separator=" ", strip=True)
            konsultacje_text = konsultacje_text.replace("Konsultacje:", "").strip()
            person_data['konsultacje'] = konsultacje_text
        else:
            person_data['konsultacje'] = None

        people_data.append(person_data)
        print(person_data)

    return people_data

people = []
for id in idArray:
    #url = "https://pracownicy.wmi.amu.edu.pl/api/getPeople?id="+id+"&lang=pl&style=matrix&person_base=https%3A%2F%2Fwww.fizyka.amu.edu.pl%2Fstrona-glowna%2Fksiazka-adresowa%2Fpracownik&ordering=hierarchical"
    pass
    r = requests.get("https://pracownicy.wmi.amu.edu.pl/api/getPeople?id="+id+"&lang=pl&style=matrix&person_base=https%3A%2F%2Fwww.fizyka.amu.edu.pl%2Fstrona-glowna%2Fksiazka-adresowa%2Fpracownik&ordering=hierarchical")
    """people = 
    print("")
    print(people)"""
    with open('people.json', 'w', encoding='utf-8') as f:
        json.dump(parse_all_people(r), f, ensure_ascii=False, indent=4)




"""

def parse_person(html):
    soup = BeautifulSoup(html, "html.parser")
    person_data = {}

    # Tytuł naukowy (np. dr)
    title_tag = soup.find("span")
    person_data['tytul'] = title_tag.text.strip() if title_tag else None

    # Imię i nazwisko oraz link
    name_tag = soup.find("a", class_="list-people__item__title")
    if name_tag:
        person_data['imie_nazwisko'] = name_tag.text.strip()
        person_data['profil_url'] = name_tag['href']
    else:
        person_data['imie_nazwisko'] = None
        person_data['profil_url'] = None

    # Stanowisko i jednostka
    stanowisko_tag = soup.find("ul", style=lambda value: value and "margin-bottom" in value)
    if stanowisko_tag:
        stanowisko_text = stanowisko_tag.get_text(strip=True)
        person_data['stanowisko'] = stanowisko_text
    else:
        person_data['stanowisko'] = None

    # Link do serwisu (np. sprawdź w serwisie)
    link_serwis = soup.select_one(".person__list__item-mail a")
    person_data['link_do_serwisu'] = link_serwis['href'] if link_serwis else None

    # Pokój
    pokoj_tag = soup.find("li", class_="person__list__item-mark")
    person_data['pokoj'] = pokoj_tag.text.strip() if pokoj_tag else None

    # Konsultacje
    konsultacje_tag = soup.find("li", class_="person__list__item-time")
    if konsultacje_tag:
        person_data['konsultacje'] = konsultacje_tag.get_text(strip=True).replace("Konsultacje:", "").strip()
    else:
        person_data['konsultacje'] = None

    return person_data
    """