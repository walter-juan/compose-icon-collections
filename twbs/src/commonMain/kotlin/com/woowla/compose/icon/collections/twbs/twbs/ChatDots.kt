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

public val Twbs.ChatDots: ImageVector
    get() {
        if (_chatDots != null) {
            return _chatDots!!
        }
        _chatDots = Builder(name = "ChatDots", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(4.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(3.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.165f, 15.803f)
                lineToRelative(0.02f, -0.004f)
                curveToRelative(1.83f, -0.363f, 2.948f, -0.842f, 3.468f, -1.105f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 8.0f, 15.0f)
                curveToRelative(4.418f, 0.0f, 8.0f, -3.134f, 8.0f, -7.0f)
                reflectiveCurveToRelative(-3.582f, -7.0f, -8.0f, -7.0f)
                reflectiveCurveToRelative(-8.0f, 3.134f, -8.0f, 7.0f)
                curveToRelative(0.0f, 1.76f, 0.743f, 3.37f, 1.97f, 4.6f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, true, -0.524f, 2.318f)
                lineToRelative(-0.003f, 0.011f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -0.244f, 0.637f)
                curveToRelative(-0.079f, 0.186f, 0.074f, 0.394f, 0.273f, 0.362f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.693f, -0.125f)
                moveToRelative(0.8f, -3.108f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.287f, -0.801f)
                curveTo(1.618f, 10.83f, 1.0f, 9.468f, 1.0f, 8.0f)
                curveToRelative(0.0f, -3.192f, 3.004f, -6.0f, 7.0f, -6.0f)
                reflectiveCurveToRelative(7.0f, 2.808f, 7.0f, 6.0f)
                reflectiveCurveToRelative(-3.004f, 6.0f, -7.0f, 6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.088f, -0.272f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.711f, 0.074f)
                curveToRelative(-0.387f, 0.196f, -1.24f, 0.57f, -2.634f, 0.893f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 0.398f, -2.0f)
            }
        }
        .build()
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
