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

public val Twbs.Opencollective: ImageVector
    get() {
        if (_opencollective != null) {
            return _opencollective!!
        }
        _opencollective = Builder(name = "Opencollective", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.995f, 8.195f)
                curveToRelative(0.0f, 0.937f, -0.312f, 1.912f, -0.78f, 2.693f)
                lineToRelative(1.99f, 1.99f)
                curveToRelative(0.976f, -1.327f, 1.6f, -2.966f, 1.6f, -4.683f)
                curveToRelative(0.0f, -1.795f, -0.624f, -3.434f, -1.561f, -4.76f)
                lineToRelative(-2.068f, 2.028f)
                curveToRelative(0.468f, 0.781f, 0.78f, 1.679f, 0.78f, 2.732f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 13.151f)
                arcToRelative(4.995f, 4.995f, 0.0f, true, true, 0.0f, -9.99f)
                curveToRelative(1.015f, 0.0f, 1.951f, 0.273f, 2.732f, 0.82f)
                lineToRelative(1.95f, -2.03f)
                arcToRelative(7.805f, 7.805f, 0.0f, true, false, 0.04f, 12.449f)
                lineToRelative(-1.951f, -2.03f)
                arcToRelative(5.07f, 5.07f, 0.0f, false, true, -2.732f, 0.781f)
                close()
            }
        }
        .build()
        return _opencollective!!
    }

private var _opencollective: ImageVector? = null
