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

public val SolidGroup.Blender: ImageVector
    get() {
        if (_blender != null) {
            return _blender!!
        }
        _blender = Builder(name = "Blender", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 56.0f)
                curveTo(0.0f, 25.1f, 25.1f, 0.0f, 56.0f, 0.0f)
                lineTo(437.6f, 0.0f)
                curveToRelative(21.3f, 0.0f, 36.6f, 20.3f, 30.8f, 40.8f)
                lineTo(457.1f, 80.0f)
                lineTo(344.0f, 80.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(99.4f, 0.0f)
                lineToRelative(-18.3f, 64.0f)
                lineToRelative(-81.1f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(67.4f, 0.0f)
                lineToRelative(-27.4f, 96.0f)
                lineToRelative(-256.0f, 0.0f)
                lineToRelative(-9.1f, -96.0f)
                lineToRelative(-62.9f, 0.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, -25.1f, -56.0f, -56.0f)
                lineTo(0.0f, 56.0f)
                close()
                moveTo(114.3f, 192.0f)
                lineTo(100.6f, 48.0f)
                lineTo(56.0f, 48.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                lineToRelative(58.3f, 0.0f)
                close()
                moveTo(136.0f, 384.0f)
                lineToRelative(240.0f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                lineToRelative(-240.0f, 0.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                close()
                moveTo(256.0f, 472.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _blender!!
    }

private var _blender: ImageVector? = null
