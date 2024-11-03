package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Number6SquareFill: ImageVector
    get() {
        if (_number6SquareFill != null) {
            return _number6SquareFill!!
        }
        _number6SquareFill = Builder(name = "Number6SquareFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.111f, 7.863f)
                curveToRelative(-0.92f, 0.0f, -1.564f, 0.65f, -1.564f, 1.576f)
                curveToRelative(0.0f, 1.032f, 0.703f, 1.635f, 1.558f, 1.635f)
                curveToRelative(0.868f, 0.0f, 1.553f, -0.533f, 1.553f, -1.629f)
                curveToRelative(0.0f, -1.06f, -0.744f, -1.582f, -1.547f, -1.582f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(8.21f, 3.855f)
                curveToRelative(1.612f, 0.0f, 2.515f, 0.99f, 2.573f, 1.899f)
                lineTo(9.494f, 5.754f)
                curveToRelative(-0.1f, -0.358f, -0.51f, -0.815f, -1.312f, -0.815f)
                curveToRelative(-1.078f, 0.0f, -1.817f, 1.09f, -1.805f, 3.036f)
                horizontalLineToRelative(0.082f)
                curveToRelative(0.229f, -0.545f, 0.855f, -1.155f, 1.98f, -1.155f)
                curveToRelative(1.254f, 0.0f, 2.508f, 0.88f, 2.508f, 2.555f)
                curveToRelative(0.0f, 1.77f, -1.218f, 2.783f, -2.847f, 2.783f)
                curveToRelative(-0.932f, 0.0f, -1.84f, -0.328f, -2.409f, -1.254f)
                curveToRelative(-0.369f, -0.603f, -0.597f, -1.459f, -0.597f, -2.642f)
                curveToRelative(0.0f, -3.012f, 1.248f, -4.407f, 3.117f, -4.407f)
                close()
            }
        }
        .build()
        return _number6SquareFill!!
    }

private var _number6SquareFill: ImageVector? = null
