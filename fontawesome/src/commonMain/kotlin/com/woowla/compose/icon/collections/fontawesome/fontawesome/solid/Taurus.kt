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

public val SolidGroup.Taurus: ImageVector
    get() {
        if (_taurus != null) {
            return _taurus!!
        }
        _taurus = Builder(name = "Taurus", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, -16.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                curveToRelative(0.0f, 58.5f, -28.6f, 110.3f, -72.5f, 142.3f)
                curveToRelative(53.2f, 34.1f, 88.5f, 93.8f, 88.5f, 161.7f)
                curveToRelative(0.0f, 106.0f, -86.0f, 192.0f, -192.0f, 192.0f)
                reflectiveCurveTo(0.0f, 426.0f, 0.0f, 320.0f)
                curveTo(0.0f, 252.1f, 35.3f, 192.4f, 88.5f, 158.3f)
                curveTo(44.6f, 126.3f, 16.0f, 74.5f, 16.0f, 16.0f)
                curveTo(16.0f, -1.7f, 30.3f, -16.0f, 48.0f, -16.0f)
                reflectiveCurveTo(80.0f, -1.7f, 80.0f, 16.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveTo(304.0f, 77.9f, 304.0f, 16.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(192.0f, 192.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 0.0f, 256.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 0.0f, -256.0f)
                close()
            }
        }
        .build()
        return _taurus!!
    }

private var _taurus: ImageVector? = null
