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

public val Simpleicons.Taketwointeractivesoftware: ImageVector
    get() {
        if (_taketwointeractivesoftware != null) {
            return _taketwointeractivesoftware!!
        }
        _taketwointeractivesoftware = Builder(name = "Taketwointeractivesoftware", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.012f, 16.776f)
                lineToRelative(0.417f, -0.257f)
                lineToRelative(4.155f, -3.1f)
                curveToRelative(1.413f, -1.248f, 2.293f, -2.686f, 2.293f, -4.607f)
                curveToRelative(-0.006f, -3.849f, -3.037f, -5.771f, -6.614f, -5.771f)
                curveToRelative(-1.663f, 0.0f, -3.122f, 0.447f, -4.283f, 1.256f)
                verticalLineTo(2.852f)
                lineTo(0.0f, 2.86f)
                lineToRelative(0.007f, 4.395f)
                lineToRelative(3.85f, -0.008f)
                lineToRelative(0.016f, 13.886f)
                lineToRelative(5.355f, -0.008f)
                lineToRelative(-0.016f, -13.886f)
                horizontalLineToRelative(1.443f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, false, -0.516f, 2.02f)
                lineToRelative(4.518f, 0.884f)
                curveToRelative(0.076f, -1.376f, 0.547f, -3.102f, 2.219f, -3.102f)
                curveToRelative(1.101f, 0.0f, 1.753f, 0.832f, 1.753f, 1.87f)
                curveToRelative(0.0f, 1.557f, -1.305f, 2.653f, -2.4f, 3.592f)
                lineToRelative(-6.082f, 4.56f)
                lineToRelative(0.006f, 4.085f)
                lineToRelative(13.642f, -0.016f)
                lineToRelative(0.205f, -4.371f)
                lineToRelative(-6.988f, 0.015f)
                close()
            }
        }
        .build()
        return _taketwointeractivesoftware!!
    }

private var _taketwointeractivesoftware: ImageVector? = null
