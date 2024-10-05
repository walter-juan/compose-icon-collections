package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Undo24: ImageVector
    get() {
        if (_undo24 != null) {
            return _undo24!!
        }
        _undo24 = Builder(name = "Undo24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.53f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineTo(2.22f, 8.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(6.25f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(4.56f, 9.75f)
                horizontalLineTo(16.0f)
                curveToRelative(0.797f, 0.0f, 2.008f, 0.245f, 3.0f, 0.959f)
                curveToRelative(0.952f, 0.686f, 1.75f, 1.835f, 1.75f, 3.791f)
                reflectiveCurveToRelative(-0.798f, 3.105f, -1.75f, 3.791f)
                curveToRelative(-0.992f, 0.714f, -2.203f, 0.959f, -3.0f, 0.959f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.037f, 0.0f, 2.575f, -0.305f, 3.876f, -1.241f)
                curveToRelative(1.339f, -0.964f, 2.374f, -2.565f, 2.374f, -5.009f)
                curveToRelative(0.0f, -2.444f, -1.035f, -4.045f, -2.374f, -5.009f)
                curveTo(18.575f, 8.555f, 17.036f, 8.25f, 16.0f, 8.25f)
                horizontalLineTo(4.56f)
                lineToRelative(4.97f, -4.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                close()
            }
        }
        .build()
        return _undo24!!
    }

private var _undo24: ImageVector? = null
