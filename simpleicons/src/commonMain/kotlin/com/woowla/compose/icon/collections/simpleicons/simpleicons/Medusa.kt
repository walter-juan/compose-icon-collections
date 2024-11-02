package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Medusa: ImageVector
    get() {
        if (_medusa != null) {
            return _medusa!!
        }
        _medusa = Builder(name = "Medusa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.325f, 3.896f)
                lineTo(14.891f, 0.769f)
                arcToRelative(5.728f, 5.728f, 0.0f, false, false, -5.734f, 0.0f)
                lineTo(3.698f, 3.896f)
                curveTo(1.946f, 4.921f, 0.844f, 6.822f, 0.844f, 8.848f)
                verticalLineToRelative(6.278f)
                curveToRelative(0.0f, 2.051f, 1.102f, 3.927f, 2.855f, 4.953f)
                lineToRelative(5.434f, 3.151f)
                arcToRelative(5.728f, 5.728f, 0.0f, false, false, 5.734f, 0.0f)
                lineToRelative(5.434f, -3.151f)
                curveToRelative(1.778f, -1.026f, 2.855f, -2.901f, 2.855f, -4.953f)
                lineTo(23.155f, 8.848f)
                curveToRelative(0.05f, -2.026f, -1.052f, -3.927f, -2.83f, -4.953f)
                close()
                moveTo(12.012f, 17.578f)
                curveToRelative(-3.08f, 0.0f, -5.584f, -2.501f, -5.584f, -5.578f)
                curveToRelative(0.0f, -3.077f, 2.504f, -5.578f, 5.584f, -5.578f)
                curveToRelative(3.08f, 0.0f, 5.609f, 2.501f, 5.609f, 5.578f)
                curveToRelative(0.0f, 3.076f, -2.504f, 5.578f, -5.609f, 5.578f)
                close()
            }
        }
        .build()
        return _medusa!!
    }

private var _medusa: ImageVector? = null
