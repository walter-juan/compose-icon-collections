package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsPhone: ImageVector
    get() {
        if (_bxsPhone != null) {
            return _bxsPhone!!
        }
        _bxsPhone = Builder(name = "BxsPhone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.487f, 17.14f)
                lineToRelative(-4.065f, -3.696f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -1.391f, 0.043f)
                lineToRelative(-2.393f, 2.461f)
                curveToRelative(-0.576f, -0.11f, -1.734f, -0.471f, -2.926f, -1.66f)
                curveToRelative(-1.192f, -1.193f, -1.553f, -2.354f, -1.66f, -2.926f)
                lineToRelative(2.459f, -2.394f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.043f, -1.391f)
                lineTo(6.859f, 3.513f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.391f, -0.087f)
                lineToRelative(-2.17f, 1.861f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.29f, 0.649f)
                curveToRelative(-0.015f, 0.25f, -0.301f, 6.172f, 4.291f, 10.766f)
                curveTo(11.305f, 20.707f, 16.323f, 21.0f, 17.705f, 21.0f)
                curveToRelative(0.202f, 0.0f, 0.326f, -0.006f, 0.359f, -0.008f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 0.648f, -0.291f)
                lineToRelative(1.86f, -2.171f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.085f, -1.39f)
                close()
            }
        }
        .build()
        return _bxsPhone!!
    }

private var _bxsPhone: ImageVector? = null