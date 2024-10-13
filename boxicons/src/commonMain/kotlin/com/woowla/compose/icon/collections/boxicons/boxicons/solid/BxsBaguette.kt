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

public val SolidGroup.BxsBaguette: ImageVector
    get() {
        if (_bxsBaguette != null) {
            return _bxsBaguette!!
        }
        _bxsBaguette = Builder(name = "BxsBaguette", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.13f, 4.41f)
                lineToRelative(4.23f, 4.23f)
                lineTo(14.3f, 9.7f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(-1.77f, 1.77f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(-1.77f, 1.77f)
                lineTo(9.7f, 14.3f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-4.23f, -4.23f)
                curveTo(1.86f, 14.0f, 1.55f, 18.0f, 3.79f, 20.21f)
                arcToRelative(5.38f, 5.38f, 0.0f, false, false, 3.85f, 1.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, -2.47f)
                lineToRelative(6.0f, -6.0f)
                curveToRelative(2.87f, -2.87f, 3.31f, -7.11f, 1.0f, -9.45f)
                reflectiveCurveToRelative(-6.24f, -1.93f, -9.11f, 0.62f)
                close()
            }
        }
        .build()
        return _bxsBaguette!!
    }

private var _bxsBaguette: ImageVector? = null
