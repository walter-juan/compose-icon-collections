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

public val SolidGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.1f, 7.6f)
                curveToRelative(0.0f, -11.1f, -7.6f, -20.7f, -18.4f, -23.3f)
                reflectiveCurveToRelative(-21.9f, 2.5f, -27.0f, 12.4f)
                lineTo(193.1f, 125.3f)
                lineTo(33.2f, 150.7f)
                curveToRelative(-8.9f, 1.4f, -16.3f, 7.7f, -19.1f, 16.3f)
                reflectiveCurveToRelative(-0.5f, 18.0f, 5.8f, 24.4f)
                lineToRelative(114.4f, 114.5f)
                lineToRelative(-25.2f, 159.9f)
                curveToRelative(-1.4f, 8.9f, 2.3f, 17.9f, 9.6f, 23.2f)
                reflectiveCurveToRelative(16.9f, 6.1f, 25.0f, 2.0f)
                lineTo(291.0f, 416.1f)
                curveToRelative(8.0f, -4.1f, 13.1f, -12.4f, 13.1f, -21.4f)
                lineToRelative(0.0f, -387.1f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
