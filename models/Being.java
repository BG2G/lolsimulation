package lolsimulation.models;

public abstract class Being {

    protected String name;
    protected int level = 1;
    //stats de base actuelles
    //stats de niveau 1
    protected float baseHp;
    protected float baseRegenHp;
    protected float baseMana;
    protected float baseRegenMana;
    protected float baseAD;
    protected float baseAS;
    protected float baseArmor;
    protected float baseMR;
    protected float baseRange;
    protected float baseMS;

    //croissance par niveau
    protected float growthHp;
    protected float growthRegenHp;
    protected float growthMana;
    protected float growthRegenMana;
    protected float growthAD;
    protected float growthAS; //attention cette stat est un pourcentage qui s'applique différement que pour les autres stats
    protected float growthArmor;
    protected float growthMR;

    //current stats
    protected float hpMax;
    protected int hp;
    protected float regenHp;
    protected float manaMax;
    protected int mana;
    protected float regenMana;
    protected float ad;
    protected float as;
    protected float ap;
    protected float armor;
    protected float mr;
    protected float ms;

    public float getMs() {
        return ms;
    }

    public void setMs(float ms) {
        this.ms = ms;
    }

    protected float tenacity;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(float baseHp) {
        this.baseHp = baseHp;
    }

    public float getBaseMana() {
        return baseMana;
    }

    public void setBaseMana(float baseMana) {
        this.baseMana = baseMana;
    }

    public float getBaseRegenHp() {
        return baseRegenHp;
    }

    public void setBaseRegenHp(float baseRegenHp) {
        this.baseRegenHp = baseRegenHp;
    }

    public float getBaseRegenMana() {
        return baseRegenMana;
    }

    public void setBaseRegenMana(float baseRegenMana) {
        this.baseRegenMana = baseRegenMana;
    }

    public float getBaseAD() {
        return baseAD;
    }

    public void setBaseAD(float baseAD) {
        this.baseAD = baseAD;
    }

    public float getBaseAS() {
        return baseAS;
    }

    public void setBaseAS(float baseAS) {
        this.baseAS = baseAS;
    }

    public float getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(float baseArmor) {
        this.baseArmor = baseArmor;
    }

    public float getBaseMR() {
        return baseMR;
    }

    public void setBaseMR(float baseMR) {
        this.baseMR = baseMR;
    }

    public float getBaseRange() {
        return baseRange;
    }

    public void setBaseRange(float baseRange) {
        this.baseRange = baseRange;
    }

    public float getBaseMS() {
        return baseMS;
    }

    public void setBaseMS(float baseMS) {
        this.baseMS = baseMS;
    }

    public float getGrowthHp() {
        return growthHp;
    }

    public void setGrowthHp(float growthHp) {
        this.growthHp = growthHp;
    }

    public float getGrowthRegenHp() {
        return growthRegenHp;
    }

    public void setGrowthRegenHp(float growthRegenHp) {
        this.growthRegenHp = growthRegenHp;
    }

    public float getGrowthMana() {
        return growthMana;
    }

    public void setGrowthMana(float growthMana) {
        this.growthMana = growthMana;
    }

    public float getGrowthRegenMana() {
        return growthRegenMana;
    }

    public void setGrowthRegenMana(float growthRegenMana) {
        this.growthRegenMana = growthRegenMana;
    }

    public float getGrowthAD() {
        return growthAD;
    }

    public void setGrowthAD(float growthAD) {
        this.growthAD = growthAD;
    }

    public float getGrowthAS() {
        return growthAS;
    }

    public void setGrowthAS(float growthAS) {
        this.growthAS = growthAS;
    }

    public float getHpMax() {
        return hpMax;
    }

    public void setHpMax(float hpMax) {
        this.hpMax = hpMax;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public float getRegenHp() {
        return regenHp;
    }

    public void setRegenHp(float regenHp) {
        this.regenHp = regenHp;
    }

    public float getManaMax() {
        return manaMax;
    }

    public void setManaMax(float manaMax) {
        this.manaMax = manaMax;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public float getRegenMana() {
        return regenMana;
    }

    public void setRegenMana(float regenMana) {
        this.regenMana = regenMana;
    }

    public float getAd() {
        return ad;
    }

    public void setAd(float ad) {
        this.ad = ad;
    }

    public float getAs() {
        return as;
    }

    public void setAs(float as) {
        this.as = as;
    }

    public float getAp() {
        return ap;
    }

    public void setAp(float ap) {
        this.ap = ap;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public float getMr() {
        return mr;
    }

    public void setMr(float mr) {
        this.mr = mr;
    }

    public float getTenacity() {
        return tenacity;
    }

    public void setTenacity(float tenacity) {
        this.tenacity = tenacity;
    }

    public float getGrowthArmor() {
        return growthArmor;
    }

    public void setGrowthArmor(float growthArmor) {
        this.growthArmor = growthArmor;
    }

    public float getGrowthMR() {
        return growthMR;
    }

    public void setGrowthMR(float growthMR) {
        this.growthMR = growthMR;
    }

    public void applyLevel(int newLevel){

        baseHp =  (baseHp + (newLevel - level) * growthHp);
        baseMana = (baseMana +(newLevel - level) * growthMana);
        baseRegenHp = baseRegenHp + (newLevel - level) * growthRegenHp;
        baseRegenMana = baseRegenMana + (newLevel - level) * growthRegenMana;
        baseAD = (baseAD + (newLevel - level) * growthAD);
        as = as + (newLevel - level) * growthAS;
        baseArmor = (baseArmor + (newLevel - level) * growthArmor);
        baseMR = (baseMR + (newLevel - level) * growthMR);
        hp = (int) hpMax;
        mana = (int) manaMax;
        tenacity = 0;
        ap = 0;
        level = newLevel;

    }

    public boolean receiveDamage(Damage damage){
        // TODO: special reduction from the Target side, defensive mastery, Braum's e, Alistar's r..., (shields)

        hp = hp - damage.getTotalDamage();

        if(hp <=0){
            hp =0;
            return false;
        }else{
            return true;
        }
    }

    public String toString(){

        StringBuilder description = new StringBuilder();
        description.append(name).append(", level ").append(level);
        description.append("\nHealth : ").append(hp).append(" / ").append(hpMax);
        description.append("\nMana : ").append(mana).append(" / ").append(manaMax);
        description.append("\nRegeneration : HP ").append(regenHp).append(", Mana ").append(regenMana);
        description.append("\nAD : ").append(baseAD).append(" + ").append(ad-baseAD).append(" = ").append(ad);
        description.append("\nAP : ").append(ap);
        description.append("\nArmor : ").append(baseArmor).append(" + ").append(armor - baseArmor).append(" = ").append(armor);
        description.append("\nMagic Resistance : ").append(baseMR).append(" + ").append(mr - baseMR).append(" = ").append(mr);
        description.append("\nAttack Speed : ").append(baseAS).append(" + ").append(as - baseAS).append(" = ").append(as);
        description.append("\nTenacity : ").append(tenacity);
        description.append("\n");

        return description.toString();
    }
}
