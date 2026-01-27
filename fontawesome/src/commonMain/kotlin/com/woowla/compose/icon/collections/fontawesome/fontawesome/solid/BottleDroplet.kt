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

public val SolidGroup.BottleDroplet: ImageVector
    get() {
        if (_bottleDroplet != null) {
            return _bottleDroplet!!
        }
        _bottleDroplet = Builder(name = "BottleDroplet", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 0.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(0.0f, 103.3f)
                curveToRelative(64.9f, 20.4f, 112.0f, 81.0f, 112.0f, 152.7f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 544.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 288.0f)
                curveToRelative(0.0f, -71.6f, 47.1f, -132.3f, 112.0f, -152.7f)
                lineTo(112.0f, 32.0f)
                curveTo(94.3f, 32.0f, 80.0f, 17.7f, 80.0f, 0.0f)
                close()
                moveTo(160.0f, 416.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -32.4f, 64.0f, -64.0f)
                curveToRelative(0.0f, -21.2f, -28.9f, -64.5f, -47.9f, -90.6f)
                curveToRelative(-8.1f, -11.1f, -24.2f, -11.1f, -32.3f, 0.0f)
                curveToRelative(-19.0f, 26.1f, -47.9f, 69.4f, -47.9f, 90.6f)
                curveToRelative(0.0f, 31.6f, 28.7f, 64.0f, 64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _bottleDroplet!!
    }

private var _bottleDroplet: ImageVector? = null
