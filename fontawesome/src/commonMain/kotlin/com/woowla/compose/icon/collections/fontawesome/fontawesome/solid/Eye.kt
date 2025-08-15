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

public val SolidGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                curveToRelative(-80.8f, 0.0f, -145.5f, 36.8f, -192.6f, 80.6f)
                curveToRelative(-46.8f, 43.5f, -78.1f, 95.4f, -93.0f, 131.1f)
                curveToRelative(-3.3f, 7.9f, -3.3f, 16.7f, 0.0f, 24.6f)
                curveToRelative(14.9f, 35.7f, 46.2f, 87.7f, 93.0f, 131.1f)
                curveToRelative(47.1f, 43.7f, 111.8f, 80.6f, 192.6f, 80.6f)
                reflectiveCurveToRelative(145.5f, -36.8f, 192.6f, -80.6f)
                curveToRelative(46.8f, -43.5f, 78.1f, -95.4f, 93.0f, -131.1f)
                curveToRelative(3.3f, -7.9f, 3.3f, -16.7f, 0.0f, -24.6f)
                curveToRelative(-14.9f, -35.7f, -46.2f, -87.7f, -93.0f, -131.1f)
                curveToRelative(-47.1f, -43.7f, -111.8f, -80.6f, -192.6f, -80.6f)
                close()
                moveTo(144.0f, 256.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, -288.0f, 0.0f)
                close()
                moveTo(288.0f, 192.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-11.5f, 0.0f, -22.3f, -3.0f, -31.7f, -8.4f)
                curveToRelative(-1.0f, 10.9f, -0.1f, 22.1f, 2.9f, 33.2f)
                curveToRelative(13.7f, 51.2f, 66.4f, 81.6f, 117.6f, 67.9f)
                reflectiveCurveToRelative(81.6f, -66.4f, 67.9f, -117.6f)
                curveToRelative(-12.2f, -45.7f, -55.5f, -74.8f, -101.1f, -70.8f)
                curveToRelative(5.3f, 9.3f, 8.4f, 20.1f, 8.4f, 31.7f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
