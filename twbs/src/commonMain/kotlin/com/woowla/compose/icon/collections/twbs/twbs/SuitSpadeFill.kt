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

public val Twbs.SuitSpadeFill: ImageVector
    get() {
        if (_suitSpadeFill != null) {
            return _suitSpadeFill!!
        }
        _suitSpadeFill = Builder(name = "SuitSpadeFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.184f, 11.246f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 1.0f, 9.0f)
                curveToRelative(0.0f, -1.602f, 1.14f, -2.633f, 2.66f, -4.008f)
                curveTo(4.986f, 3.792f, 6.602f, 2.33f, 8.0f, 0.0f)
                curveToRelative(1.398f, 2.33f, 3.014f, 3.792f, 4.34f, 4.992f)
                curveTo(13.86f, 6.367f, 15.0f, 7.398f, 15.0f, 9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.184f, 2.246f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 1.582f, 2.907f)
                curveToRelative(0.231f, 0.35f, -0.02f, 0.847f, -0.438f, 0.847f)
                horizontalLineTo(6.04f)
                curveToRelative(-0.419f, 0.0f, -0.67f, -0.497f, -0.438f, -0.847f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 1.582f, -2.907f)
            }
        }
        .build()
        return _suitSpadeFill!!
    }

private var _suitSpadeFill: ImageVector? = null
