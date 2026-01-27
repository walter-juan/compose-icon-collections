package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(285.7f, -15.8f)
                curveToRelative(10.8f, 2.6f, 18.4f, 12.2f, 18.4f, 23.3f)
                lineToRelative(0.0f, 387.1f)
                curveToRelative(0.0f, 9.0f, -5.1f, 17.3f, -13.1f, 21.4f)
                lineTo(143.8f, 491.0f)
                curveToRelative(-8.0f, 4.1f, -17.7f, 3.3f, -25.0f, -2.0f)
                reflectiveCurveToRelative(-11.0f, -14.2f, -9.6f, -23.2f)
                lineTo(134.4f, 305.9f)
                lineTo(20.0f, 191.4f)
                curveToRelative(-6.4f, -6.4f, -8.6f, -15.8f, -5.8f, -24.4f)
                reflectiveCurveToRelative(10.1f, -14.9f, 19.1f, -16.3f)
                lineTo(193.1f, 125.3f)
                lineTo(258.8f, -3.3f)
                curveToRelative(5.0f, -9.9f, 16.2f, -15.0f, 27.0f, -12.4f)
                close()
                moveTo(256.1f, 107.4f)
                lineTo(230.3f, 158.0f)
                curveToRelative(-3.5f, 6.8f, -10.0f, 11.6f, -17.6f, 12.8f)
                lineToRelative(-125.5f, 20.0f)
                lineToRelative(89.8f, 89.9f)
                curveToRelative(5.4f, 5.4f, 7.9f, 13.1f, 6.7f, 20.7f)
                lineToRelative(-19.8f, 125.5f)
                lineToRelative(92.2f, -46.9f)
                lineToRelative(0.0f, -272.6f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
