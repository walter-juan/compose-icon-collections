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

public val RegularGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 192.0f)
                curveToRelative(0.0f, -88.4f, 71.6f, -160.0f, 160.0f, -160.0f)
                curveToRelative(47.1f, 0.0f, 89.4f, 20.4f, 118.7f, 52.7f)
                curveToRelative(10.6f, -3.1f, 21.8f, -4.7f, 33.3f, -4.7f)
                curveToRelative(66.3f, 0.0f, 120.0f, 53.7f, 120.0f, 120.0f)
                curveToRelative(0.0f, 13.2f, -2.1f, 25.9f, -6.1f, 37.8f)
                curveToRelative(41.6f, 21.1f, 70.1f, 64.3f, 70.1f, 114.2f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                lineToRelative(-304.0f, 0.0f)
                curveToRelative(-79.5f, 0.0f, -144.0f, -64.5f, -144.0f, -144.0f)
                curveToRelative(0.0f, -56.8f, 32.9f, -105.9f, 80.7f, -129.4f)
                curveToRelative(-0.4f, -4.8f, -0.7f, -9.7f, -0.7f, -14.6f)
                close()
                moveTo(240.0f, 80.0f)
                curveToRelative(-61.9f, 0.0f, -112.0f, 50.1f, -112.0f, 112.0f)
                curveToRelative(0.0f, 8.4f, 0.9f, 16.6f, 2.7f, 24.5f)
                curveToRelative(2.7f, 12.1f, -4.3f, 24.3f, -16.1f, 28.1f)
                curveToRelative(-38.7f, 12.4f, -66.6f, 48.7f, -66.6f, 91.4f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineToRelative(304.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -37.4f, -25.7f, -68.9f, -60.5f, -77.6f)
                curveToRelative(-7.5f, -1.9f, -13.6f, -7.2f, -16.5f, -14.3f)
                reflectiveCurveToRelative(-2.1f, -15.2f, 2.0f, -21.7f)
                curveToRelative(7.0f, -11.1f, 11.0f, -24.2f, 11.0f, -38.3f)
                curveToRelative(0.0f, -39.8f, -32.2f, -72.0f, -72.0f, -72.0f)
                curveToRelative(-11.1f, 0.0f, -21.5f, 2.5f, -30.8f, 6.9f)
                curveToRelative(-10.5f, 5.0f, -23.1f, 1.7f, -29.8f, -7.8f)
                curveToRelative(-20.3f, -28.6f, -53.7f, -47.1f, -91.3f, -47.1f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
