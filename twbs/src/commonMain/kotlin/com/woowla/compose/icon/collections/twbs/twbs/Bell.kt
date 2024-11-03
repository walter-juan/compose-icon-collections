package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                moveTo(8.0f, 1.918f)
                lineToRelative(-0.797f, 0.161f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 6.0f)
                curveToRelative(0.0f, 0.628f, -0.134f, 2.197f, -0.459f, 3.742f)
                curveToRelative(-0.16f, 0.767f, -0.376f, 1.566f, -0.663f, 2.258f)
                horizontalLineToRelative(10.244f)
                curveToRelative(-0.287f, -0.692f, -0.502f, -1.49f, -0.663f, -2.258f)
                curveTo(12.134f, 8.197f, 12.0f, 6.628f, 12.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.203f, -3.92f)
                close()
                moveTo(14.22f, 12.0f)
                curveToRelative(0.223f, 0.447f, 0.481f, 0.801f, 0.78f, 1.0f)
                horizontalLineTo(1.0f)
                curveToRelative(0.299f, -0.199f, 0.557f, -0.553f, 0.78f, -1.0f)
                curveTo(2.68f, 10.2f, 3.0f, 6.88f, 3.0f, 6.0f)
                curveToRelative(0.0f, -2.42f, 1.72f, -4.44f, 4.005f, -4.901f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.99f, 0.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 6.0f)
                curveToRelative(0.0f, 0.88f, 0.32f, 4.2f, 1.22f, 6.0f)
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
