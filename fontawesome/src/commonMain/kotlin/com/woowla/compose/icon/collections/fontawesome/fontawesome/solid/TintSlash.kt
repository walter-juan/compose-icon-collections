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

public val SolidGroup.TintSlash: ImageVector
    get() {
        if (_tintSlash != null) {
            return _tintSlash!!
        }
        _tintSlash = Builder(name = "TintSlash", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(463.6f, 397.8f)
                curveToRelative(10.5f, -23.8f, 16.4f, -50.1f, 16.4f, -77.8f)
                curveToRelative(0.0f, -91.2f, -130.2f, -274.1f, -166.6f, -323.5f)
                curveToRelative(-5.9f, -8.0f, -15.2f, -12.5f, -25.2f, -12.5f)
                lineToRelative(-0.4f, 0.0f)
                curveToRelative(-10.0f, 0.0f, -19.3f, 4.5f, -25.2f, 12.5f)
                curveToRelative(-15.6f, 21.2f, -48.5f, 66.9f, -80.9f, 119.4f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(133.0f, 202.8f)
                curveToRelative(-21.6f, 43.8f, -37.0f, 85.9f, -37.0f, 117.2f)
                curveToRelative(0.0f, 106.0f, 86.0f, 192.0f, 192.0f, 192.0f)
                curveToRelative(43.4f, 0.0f, 83.4f, -14.4f, 115.5f, -38.6f)
                lineTo(133.0f, 202.8f)
                close()
            }
        }
        .build()
        return _tintSlash!!
    }

private var _tintSlash: ImageVector? = null
