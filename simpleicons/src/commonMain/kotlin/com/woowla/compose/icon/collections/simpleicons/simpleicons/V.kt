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

public val Simpleicons.V: ImageVector
    get() {
        if (_v != null) {
            return _v!!
        }
        _v = Builder(name = "V", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.583f, 23.497f)
                curveToRelative(0.067f, 0.192f, -0.043f, 0.348f, -0.247f, 0.348f)
                horizontalLineToRelative(-6.262f)
                curveToRelative(-0.407f, 0.0f, -0.85f, -0.311f, -0.988f, -0.695f)
                lineTo(0.043f, 0.784f)
                curveTo(-0.105f, 0.393f, 0.149f, 0.115f, 0.528f, 0.16f)
                lineToRelative(6.393f, 0.616f)
                curveToRelative(0.406f, 0.039f, 0.844f, 0.383f, 0.979f, 0.767f)
                lineToRelative(7.684f, 21.953f)
                close()
                moveTo(23.474f, 0.16f)
                lineToRelative(-6.393f, 0.616f)
                curveToRelative(-0.405f, 0.039f, -0.844f, 0.383f, -0.978f, 0.768f)
                lineToRelative(-3.828f, 10.99f)
                lineToRelative(3.678f, 10.51f)
                lineTo(23.959f, 0.784f)
                curveToRelative(0.138f, -0.383f, -0.079f, -0.663f, -0.485f, -0.624f)
                close()
            }
        }
        .build()
        return _v!!
    }

private var _v: ImageVector? = null
