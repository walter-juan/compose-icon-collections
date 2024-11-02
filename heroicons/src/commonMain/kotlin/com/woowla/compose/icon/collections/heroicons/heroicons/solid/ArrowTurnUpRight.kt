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

public val SolidGroup.ArrowTurnUpRight: ImageVector
    get() {
        if (_arrowTurnUpRight != null) {
            return _arrowTurnUpRight!!
        }
        _arrowTurnUpRight = Builder(name = "ArrowTurnUpRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.739f, 20.25f)
                curveTo(4.153f, 20.25f, 4.489f, 19.914f, 4.489f, 19.5f)
                lineTo(4.489f, 8.999f)
                lineTo(18.428f, 8.999f)
                lineTo(15.958f, 11.469f)
                curveTo(15.666f, 11.762f, 15.666f, 12.237f, 15.959f, 12.53f)
                curveTo(16.251f, 12.823f, 16.726f, 12.823f, 17.019f, 12.53f)
                lineTo(20.769f, 8.779f)
                curveTo(21.062f, 8.486f, 21.062f, 8.012f, 20.769f, 7.719f)
                lineTo(17.019f, 3.968f)
                curveTo(16.726f, 3.675f, 16.251f, 3.675f, 15.959f, 3.968f)
                curveTo(15.666f, 4.261f, 15.666f, 4.736f, 15.958f, 5.029f)
                lineTo(18.428f, 7.499f)
                lineTo(3.739f, 7.499f)
                curveTo(3.325f, 7.499f, 2.989f, 7.835f, 2.989f, 8.249f)
                lineTo(2.989f, 19.5f)
                curveTo(2.989f, 19.914f, 3.325f, 20.25f, 3.739f, 20.25f)
                close()
            }
        }
        .build()
        return _arrowTurnUpRight!!
    }

private var _arrowTurnUpRight: ImageVector? = null
