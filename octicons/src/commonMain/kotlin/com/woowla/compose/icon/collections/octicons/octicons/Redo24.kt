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

public val Octicons.Redo24: ImageVector
    get() {
        if (_redo24 != null) {
            return _redo24!!
        }
        _redo24 = Builder(name = "Redo24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.72f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(6.25f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-6.25f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(4.97f, -4.97f)
                horizontalLineTo(8.25f)
                curveToRelative(-0.797f, 0.0f, -2.008f, 0.245f, -3.0f, 0.959f)
                curveToRelative(-0.952f, 0.686f, -1.75f, 1.835f, -1.75f, 3.791f)
                reflectiveCurveToRelative(0.798f, 3.105f, 1.75f, 3.791f)
                curveToRelative(0.992f, 0.714f, 2.203f, 0.959f, 3.0f, 0.959f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.037f, 0.0f, -2.575f, -0.305f, -3.876f, -1.241f)
                curveTo(3.035f, 18.545f, 2.0f, 16.944f, 2.0f, 14.5f)
                curveToRelative(0.0f, -2.444f, 1.035f, -4.045f, 2.374f, -5.009f)
                curveTo(5.675f, 8.555f, 7.214f, 8.25f, 8.25f, 8.25f)
                horizontalLineToRelative(11.44f)
                lineToRelative(-4.97f, -4.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        .build()
        return _redo24!!
    }

private var _redo24: ImageVector? = null
