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

public val SolidGroup.Bong: ImageVector
    get() {
        if (_bong != null) {
            return _bong!!
        }
        _bong = Builder(name = "Bong", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.5f, 384.0f)
                curveToRelative(0.0f, 41.5f, -13.1f, 79.9f, -35.5f, 111.3f)
                curveToRelative(-7.9f, 11.1f, -21.2f, 16.7f, -34.8f, 16.7f)
                lineToRelative(-243.3f, 0.0f)
                curveToRelative(-13.7f, 0.0f, -26.9f, -5.6f, -34.8f, -16.7f)
                curveToRelative(-22.4f, -31.4f, -35.5f, -69.8f, -35.5f, -111.3f)
                curveToRelative(0.0f, -71.1f, 38.6f, -133.1f, 96.0f, -166.3f)
                lineToRelative(0.0f, -153.7f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(0.0f, 153.7f)
                curveToRelative(14.2f, 8.2f, 27.2f, 18.2f, 38.8f, 29.6f)
                lineToRelative(39.3f, -39.3f)
                lineToRelative(-7.0f, -7.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                curveToRelative(16.0f, 16.0f, 32.0f, 32.0f, 48.0f, 48.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-7.0f, -7.0f)
                lineToRelative(-43.3f, 43.3f)
                curveToRelative(17.3f, 28.9f, 27.3f, 62.6f, 27.3f, 98.8f)
                close()
                moveTo(288.5f, 64.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 190.6f)
                lineToRelative(-32.0f, 18.5f)
                curveToRelative(-19.5f, 11.3f, -35.7f, 27.5f, -46.9f, 46.9f)
                lineToRelative(221.8f, 0.0f)
                curveToRelative(-11.2f, -19.4f, -27.4f, -35.6f, -46.9f, -46.9f)
                lineToRelative(-32.0f, -18.5f)
                lineToRelative(0.0f, -190.6f)
                close()
            }
        }
        .build()
        return _bong!!
    }

private var _bong: ImageVector? = null
