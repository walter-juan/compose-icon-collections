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

public val Simpleicons.Icon: ImageVector
    get() {
        if (_icon != null) {
            return _icon!!
        }
        _icon = Builder(name = "Icon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.927f, 23.935f)
                curveToRelative(-0.938f, -0.178f, -1.704f, -0.945f, -1.882f, -1.882f)
                curveToRelative(-0.32f, -1.688f, 1.132f, -3.14f, 2.82f, -2.82f)
                curveToRelative(0.938f, 0.178f, 1.705f, 0.945f, 1.882f, 1.882f)
                curveToRelative(0.32f, 1.688f, -1.132f, 3.14f, -2.82f, 2.82f)
                close()
                moveTo(21.135f, 4.768f)
                curveToRelative(-0.938f, -0.178f, -1.705f, -0.945f, -1.882f, -1.882f)
                curveToRelative(-0.32f, -1.688f, 1.133f, -3.14f, 2.821f, -2.82f)
                curveToRelative(0.938f, 0.178f, 1.704f, 0.945f, 1.882f, 1.882f)
                curveToRelative(0.32f, 1.688f, -1.133f, 3.14f, -2.82f, 2.82f)
                close()
                moveTo(12.021f, 6.01f)
                curveToRelative(1.148f, 0.0f, 2.219f, 0.323f, 3.13f, 0.883f)
                lineToRelative(2.585f, -2.586f)
                curveToRelative(-1.596f, -1.188f, -3.574f, -1.891f, -5.716f, -1.891f)
                curveToRelative(-5.293f, 0.0f, -9.583f, 4.29f, -9.583f, 9.583f)
                curveToRelative(0.0f, 2.142f, 0.703f, 4.12f, 1.891f, 5.716f)
                lineToRelative(2.585f, -2.585f)
                curveToRelative(-0.559f, -0.911f, -0.883f, -1.983f, -0.883f, -3.13f)
                curveToRelative(0.0f, -3.308f, 2.682f, -5.99f, 5.99f, -5.99f)
                close()
                moveTo(17.128f, 8.87f)
                curveToRelative(0.56f, 0.911f, 0.883f, 1.983f, 0.883f, 3.13f)
                curveToRelative(0.0f, 3.308f, -2.682f, 5.99f, -5.99f, 5.99f)
                curveToRelative(-1.148f, 0.0f, -2.219f, -0.323f, -3.13f, -0.883f)
                lineTo(6.305f, 19.692f)
                curveToRelative(1.596f, 1.188f, 3.574f, 1.891f, 5.716f, 1.891f)
                curveToRelative(5.293f, 0.0f, 9.583f, -4.29f, 9.583f, -9.583f)
                curveToRelative(0.0f, -2.142f, -0.703f, -4.12f, -1.891f, -5.716f)
                close()
            }
        }
        .build()
        return _icon!!
    }

private var _icon: ImageVector? = null
