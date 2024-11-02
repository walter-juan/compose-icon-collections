package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.516f, 2.17f)
                curveTo(12.226f, 1.896f, 11.774f, 1.896f, 11.484f, 2.17f)
                curveTo(9.468f, 4.08f, 6.746f, 5.25f, 3.75f, 5.25f)
                curveTo(3.702f, 5.25f, 3.655f, 5.25f, 3.607f, 5.249f)
                curveTo(3.28f, 5.245f, 2.988f, 5.454f, 2.885f, 5.765f)
                curveTo(2.473f, 7.02f, 2.25f, 8.36f, 2.25f, 9.75f)
                curveTo(2.25f, 15.692f, 6.314f, 20.683f, 11.813f, 22.098f)
                curveTo(11.936f, 22.13f, 12.064f, 22.13f, 12.187f, 22.098f)
                curveTo(17.686f, 20.683f, 21.75f, 15.692f, 21.75f, 9.75f)
                curveTo(21.75f, 8.36f, 21.527f, 7.02f, 21.115f, 5.765f)
                curveTo(21.012f, 5.454f, 20.72f, 5.245f, 20.393f, 5.249f)
                curveTo(20.345f, 5.25f, 20.298f, 5.25f, 20.25f, 5.25f)
                curveTo(17.254f, 5.25f, 14.533f, 4.08f, 12.516f, 2.17f)
                close()
                moveTo(15.61f, 10.186f)
                curveTo(15.851f, 9.849f, 15.773f, 9.38f, 15.436f, 9.14f)
                curveTo(15.099f, 8.899f, 14.63f, 8.977f, 14.39f, 9.314f)
                lineTo(11.154f, 13.844f)
                lineTo(9.53f, 12.22f)
                curveTo(9.237f, 11.927f, 8.763f, 11.927f, 8.47f, 12.22f)
                curveTo(8.177f, 12.513f, 8.177f, 12.987f, 8.47f, 13.28f)
                lineTo(10.72f, 15.53f)
                curveTo(10.876f, 15.686f, 11.092f, 15.766f, 11.312f, 15.747f)
                curveTo(11.532f, 15.729f, 11.732f, 15.615f, 11.86f, 15.436f)
                lineTo(15.61f, 10.186f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
