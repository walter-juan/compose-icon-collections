package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.5f, 416.0f)
                lineToRelative(123.0f, 0.0f)
                lineToRelative(65.3f, -65.3f)
                lineToRelative(-173.5f, -173.5f)
                lineToRelative(-126.7f, 126.7f)
                lineToRelative(112.0f, 112.0f)
                close()
                moveTo(224.0f, 480.0f)
                lineToRelative(-45.5f, 0.0f)
                curveToRelative(-17.0f, 0.0f, -33.3f, -6.7f, -45.3f, -18.7f)
                lineTo(17.0f, 345.0f)
                curveTo(6.1f, 334.1f, 0.0f, 319.4f, 0.0f, 304.0f)
                reflectiveCurveToRelative(6.1f, -30.1f, 17.0f, -41.0f)
                lineTo(263.0f, 17.0f)
                curveTo(273.9f, 6.1f, 288.6f, 0.0f, 304.0f, 0.0f)
                reflectiveCurveToRelative(30.1f, 6.1f, 41.0f, 17.0f)
                lineTo(527.0f, 199.0f)
                curveToRelative(10.9f, 10.9f, 17.0f, 25.6f, 17.0f, 41.0f)
                reflectiveCurveToRelative(-6.1f, 30.1f, -17.0f, 41.0f)
                lineToRelative(-135.0f, 135.0f)
                lineToRelative(120.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-288.0f, 0.0f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
