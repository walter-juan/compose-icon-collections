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

public val SolidGroup.RedoAlt: ImageVector
    get() {
        if (_redoAlt != null) {
            return _redoAlt!!
        }
        _redoAlt = Builder(name = "RedoAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.0f, 192.0f)
                lineToRelative(-144.0f, 0.0f)
                curveToRelative(-9.7f, 0.0f, -18.5f, -5.8f, -22.2f, -14.8f)
                reflectiveCurveToRelative(-1.7f, -19.3f, 5.2f, -26.2f)
                lineToRelative(46.7f, -46.7f)
                curveToRelative(-75.3f, -58.6f, -184.3f, -53.3f, -253.5f, 15.9f)
                curveToRelative(-75.0f, 75.0f, -75.0f, 196.5f, 0.0f, 271.5f)
                reflectiveCurveToRelative(196.5f, 75.0f, 271.5f, 0.0f)
                curveToRelative(8.2f, -8.2f, 15.5f, -16.9f, 21.9f, -26.1f)
                curveToRelative(10.1f, -14.5f, 30.1f, -18.0f, 44.6f, -7.9f)
                reflectiveCurveToRelative(18.0f, 30.1f, 7.9f, 44.6f)
                curveToRelative(-8.5f, 12.2f, -18.2f, 23.8f, -29.1f, 34.7f)
                curveToRelative(-100.0f, 100.0f, -262.1f, 100.0f, -362.0f, 0.0f)
                reflectiveCurveTo(-25.0f, 175.0f, 75.0f, 75.0f)
                curveToRelative(94.3f, -94.3f, 243.7f, -99.6f, 344.3f, -16.2f)
                lineTo(471.0f, 7.0f)
                curveToRelative(6.9f, -6.9f, 17.2f, -8.9f, 26.2f, -5.2f)
                reflectiveCurveTo(512.0f, 14.3f, 512.0f, 24.0f)
                lineToRelative(0.0f, 144.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _redoAlt!!
    }

private var _redoAlt: ImageVector? = null
