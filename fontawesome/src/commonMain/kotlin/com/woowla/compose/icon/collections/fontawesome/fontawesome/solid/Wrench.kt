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

public val SolidGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(509.4f, 98.6f)
                curveToRelative(7.6f, -7.6f, 20.3f, -5.7f, 24.1f, 4.3f)
                curveToRelative(6.8f, 17.7f, 10.5f, 37.0f, 10.5f, 57.1f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                curveToRelative(-17.5f, 0.0f, -34.4f, -2.8f, -50.2f, -8.0f)
                lineTo(146.9f, 498.9f)
                curveToRelative(-28.1f, 28.1f, -73.7f, 28.1f, -101.8f, 0.0f)
                reflectiveCurveToRelative(-28.1f, -73.7f, 0.0f, -101.8f)
                lineTo(232.0f, 210.2f)
                curveToRelative(-5.2f, -15.8f, -8.0f, -32.6f, -8.0f, -50.2f)
                curveToRelative(0.0f, -88.4f, 71.6f, -160.0f, 160.0f, -160.0f)
                curveToRelative(20.1f, 0.0f, 39.4f, 3.7f, 57.1f, 10.5f)
                curveToRelative(10.0f, 3.8f, 11.8f, 16.5f, 4.3f, 24.1f)
                lineToRelative(-88.7f, 88.7f)
                curveToRelative(-3.0f, 3.0f, -4.7f, 7.1f, -4.7f, 11.3f)
                lineToRelative(0.0f, 41.4f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(41.4f, 0.0f)
                curveToRelative(4.2f, 0.0f, 8.3f, -1.7f, 11.3f, -4.7f)
                lineToRelative(88.7f, -88.7f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
