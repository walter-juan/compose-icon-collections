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

public val SolidGroup.ArrowTurnUpLeft: ImageVector
    get() {
        if (_arrowTurnUpLeft != null) {
            return _arrowTurnUpLeft!!
        }
        _arrowTurnUpLeft = Builder(name = "ArrowTurnUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.239f, 20.25f)
                curveTo(19.824f, 20.25f, 19.489f, 19.914f, 19.489f, 19.5f)
                lineTo(19.489f, 8.999f)
                lineTo(5.55f, 8.999f)
                lineTo(8.019f, 11.469f)
                curveTo(8.312f, 11.762f, 8.312f, 12.237f, 8.019f, 12.53f)
                curveTo(7.727f, 12.823f, 7.252f, 12.823f, 6.959f, 12.53f)
                lineTo(3.209f, 8.779f)
                curveTo(2.916f, 8.486f, 2.916f, 8.012f, 3.209f, 7.719f)
                lineTo(6.959f, 3.968f)
                curveTo(7.252f, 3.675f, 7.727f, 3.675f, 8.019f, 3.968f)
                curveTo(8.312f, 4.261f, 8.312f, 4.736f, 8.019f, 5.029f)
                lineTo(5.55f, 7.499f)
                lineTo(20.239f, 7.499f)
                curveTo(20.653f, 7.499f, 20.989f, 7.835f, 20.989f, 8.249f)
                lineTo(20.989f, 19.5f)
                curveTo(20.989f, 19.914f, 20.653f, 20.25f, 20.239f, 20.25f)
                close()
            }
        }
        .build()
        return _arrowTurnUpLeft!!
    }

private var _arrowTurnUpLeft: ImageVector? = null
