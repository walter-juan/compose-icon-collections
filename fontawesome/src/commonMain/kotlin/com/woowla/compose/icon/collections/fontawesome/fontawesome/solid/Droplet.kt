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

public val SolidGroup.Droplet: ImageVector
    get() {
        if (_droplet != null) {
            return _droplet!!
        }
        _droplet = Builder(name = "Droplet", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 512.0f)
                curveTo(86.0f, 512.0f, 0.0f, 426.0f, 0.0f, 320.0f)
                curveTo(0.0f, 228.8f, 130.2f, 45.9f, 166.6f, -3.5f)
                curveTo(172.5f, -11.5f, 181.8f, -16.0f, 191.8f, -16.0f)
                lineToRelative(0.4f, 0.0f)
                curveToRelative(10.0f, 0.0f, 19.3f, 4.5f, 25.2f, 12.5f)
                curveToRelative(36.4f, 49.4f, 166.6f, 232.3f, 166.6f, 323.5f)
                curveToRelative(0.0f, 106.0f, -86.0f, 192.0f, -192.0f, 192.0f)
                close()
                moveTo(112.0f, 312.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                curveToRelative(0.0f, 75.1f, 60.9f, 136.0f, 136.0f, 136.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                curveToRelative(-48.6f, 0.0f, -88.0f, -39.4f, -88.0f, -88.0f)
                close()
            }
        }
        .build()
        return _droplet!!
    }

private var _droplet: ImageVector? = null
