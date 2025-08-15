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

public val RegularGroup.StarHalfAlt: ImageVector
    get() {
        if (_starHalfAlt != null) {
            return _starHalfAlt!!
        }
        _starHalfAlt = Builder(name = "StarHalfAlt", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(309.5f, -18.9f)
                curveToRelative(-4.1f, -8.0f, -12.4f, -13.1f, -21.4f, -13.1f)
                reflectiveCurveToRelative(-17.3f, 5.1f, -21.4f, 13.1f)
                lineTo(193.1f, 125.3f)
                lineTo(33.2f, 150.7f)
                curveToRelative(-8.9f, 1.4f, -16.3f, 7.7f, -19.1f, 16.3f)
                reflectiveCurveToRelative(-0.5f, 18.0f, 5.8f, 24.4f)
                lineToRelative(114.4f, 114.5f)
                lineToRelative(-25.2f, 159.9f)
                curveToRelative(-1.4f, 8.9f, 2.3f, 17.9f, 9.6f, 23.2f)
                reflectiveCurveToRelative(16.9f, 6.1f, 25.0f, 2.0f)
                lineTo(288.1f, 417.6f)
                lineTo(432.4f, 491.0f)
                curveToRelative(8.0f, 4.1f, 17.7f, 3.3f, 25.0f, -2.0f)
                reflectiveCurveToRelative(11.0f, -14.2f, 9.6f, -23.2f)
                lineTo(441.7f, 305.9f)
                lineTo(556.1f, 191.4f)
                curveToRelative(6.4f, -6.4f, 8.6f, -15.8f, 5.8f, -24.4f)
                reflectiveCurveToRelative(-10.1f, -14.9f, -19.1f, -16.3f)
                lineTo(383.0f, 125.3f)
                lineTo(309.5f, -18.9f)
                close()
                moveTo(264.1f, 91.8f)
                lineToRelative(0.0f, 284.1f)
                lineToRelative(-100.1f, 50.9f)
                lineToRelative(19.8f, -125.5f)
                curveToRelative(1.2f, -7.6f, -1.3f, -15.3f, -6.7f, -20.7f)
                lineToRelative(-89.8f, -89.9f)
                lineToRelative(125.5f, -20.0f)
                curveToRelative(7.6f, -1.2f, 14.1f, -6.0f, 17.6f, -12.8f)
                lineToRelative(33.8f, -66.2f)
                close()
                moveTo(312.1f, 375.9f)
                lineToRelative(0.0f, -284.1f)
                lineToRelative(33.8f, 66.2f)
                curveToRelative(3.5f, 6.8f, 10.0f, 11.6f, 17.6f, 12.8f)
                lineToRelative(125.5f, 20.0f)
                lineToRelative(-89.8f, 89.9f)
                curveToRelative(-5.4f, 5.4f, -7.9f, 13.1f, -6.7f, 20.7f)
                lineToRelative(19.8f, 125.5f)
                lineToRelative(-100.1f, -50.9f)
                close()
            }
        }
        .build()
        return _starHalfAlt!!
    }

private var _starHalfAlt: ImageVector? = null
