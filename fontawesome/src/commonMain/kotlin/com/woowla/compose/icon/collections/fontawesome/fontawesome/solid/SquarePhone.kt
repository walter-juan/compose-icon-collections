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

public val SolidGroup.SquarePhone: ImageVector
    get() {
        if (_squarePhone != null) {
            return _squarePhone!!
        }
        _squarePhone = Builder(name = "SquarePhone", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(152.0f, 128.7f)
                curveToRelative(9.8f, -2.7f, 20.1f, 2.4f, 24.0f, 11.8f)
                lineToRelative(20.3f, 48.7f)
                curveToRelative(3.4f, 8.3f, 1.1f, 17.8f, -5.9f, 23.5f)
                lineToRelative(-22.1f, 18.0f)
                curveToRelative(16.2f, 35.8f, 44.5f, 65.0f, 79.6f, 82.4f)
                lineToRelative(19.3f, -23.6f)
                curveToRelative(5.7f, -6.9f, 15.2f, -9.3f, 23.5f, -5.9f)
                lineToRelative(48.7f, 20.3f)
                curveToRelative(9.4f, 3.9f, 14.4f, 14.2f, 11.8f, 24.0f)
                lineToRelative(-0.8f, 2.8f)
                curveToRelative(-8.8f, 32.3f, -40.1f, 59.9f, -78.2f, 51.8f)
                curveToRelative(-87.5f, -18.5f, -156.3f, -87.4f, -174.9f, -174.9f)
                curveToRelative(-8.1f, -38.1f, 19.5f, -69.4f, 51.8f, -78.2f)
                lineToRelative(2.8f, -0.8f)
                close()
            }
        }
        .build()
        return _squarePhone!!
    }

private var _squarePhone: ImageVector? = null
