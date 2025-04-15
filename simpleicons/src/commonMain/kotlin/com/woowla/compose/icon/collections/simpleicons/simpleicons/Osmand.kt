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

public val Simpleicons.Osmand: ImageVector
    get() {
        if (_osmand != null) {
            return _osmand!!
        }
        _osmand = Builder(name = "Osmand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.11f, 0.0f, 1.332f, 4.777f, 1.332f, 10.668f)
                arcToRelative(10.67f, 10.67f, 0.0f, false, false, 6.52f, 9.828f)
                curveToRelative(1.927f, 0.836f, 2.667f, 1.282f, 3.26f, 2.467f)
                quadToRelative(0.085f, 0.172f, 0.152f, 0.326f)
                curveToRelative(0.189f, 0.422f, 0.318f, 0.711f, 0.736f, 0.711f)
                reflectiveCurveToRelative(0.546f, -0.289f, 0.736f, -0.71f)
                quadToRelative(0.069f, -0.155f, 0.153f, -0.327f)
                curveToRelative(0.593f, -1.186f, 1.28f, -1.63f, 3.26f, -2.467f)
                arcToRelative(10.67f, 10.67f, 0.0f, false, false, 6.519f, -9.828f)
                curveTo(22.668f, 4.777f, 17.89f, 0.0f, 12.0f, 0.0f)
                moveToRelative(-0.443f, 4.758f)
                arcToRelative(5.926f, 5.926f, 0.0f, false, true, 6.369f, 5.91f)
                arcToRelative(5.926f, 5.926f, 0.0f, false, true, -11.852f, 0.0f)
                arcToRelative(5.926f, 5.926f, 0.0f, false, true, 5.483f, -5.91f)
            }
        }
        .build()
        return _osmand!!
    }

private var _osmand: ImageVector? = null
