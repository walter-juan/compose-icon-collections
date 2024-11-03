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

public val Twbs.Reddit: ImageVector
    get() {
        if (_reddit != null) {
            return _reddit!!
        }
        _reddit = Builder(name = "Reddit", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.167f, 8.0f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, false, -0.83f, 0.83f)
                curveToRelative(0.0f, 0.459f, 0.372f, 0.84f, 0.83f, 0.831f)
                arcToRelative(0.831f, 0.831f, 0.0f, false, false, 0.0f, -1.661f)
                moveToRelative(1.843f, 3.647f)
                curveToRelative(0.315f, 0.0f, 1.403f, -0.038f, 1.976f, -0.611f)
                arcToRelative(0.23f, 0.23f, 0.0f, false, false, 0.0f, -0.306f)
                arcToRelative(0.213f, 0.213f, 0.0f, false, false, -0.306f, 0.0f)
                curveToRelative(-0.353f, 0.363f, -1.126f, 0.487f, -1.67f, 0.487f)
                curveToRelative(-0.545f, 0.0f, -1.308f, -0.124f, -1.671f, -0.487f)
                arcToRelative(0.213f, 0.213f, 0.0f, false, false, -0.306f, 0.0f)
                arcToRelative(0.213f, 0.213f, 0.0f, false, false, 0.0f, 0.306f)
                curveToRelative(0.564f, 0.563f, 1.652f, 0.61f, 1.977f, 0.61f)
                close()
                moveTo(9.002f, 8.84f)
                curveToRelative(0.0f, 0.458f, 0.373f, 0.83f, 0.831f, 0.83f)
                reflectiveCurveToRelative(0.83f, -0.381f, 0.83f, -0.83f)
                arcToRelative(0.831f, 0.831f, 0.0f, false, false, -1.66f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-3.828f, -1.165f)
                curveToRelative(-0.315f, 0.0f, -0.602f, 0.124f, -0.812f, 0.325f)
                curveToRelative(-0.801f, -0.573f, -1.9f, -0.945f, -3.121f, -0.993f)
                lineToRelative(0.534f, -2.501f)
                lineToRelative(1.738f, 0.372f)
                arcToRelative(0.83f, 0.83f, 0.0f, true, false, 0.83f, -0.869f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, false, -0.744f, 0.468f)
                lineToRelative(-1.938f, -0.41f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.153f, 0.028f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.086f, 0.134f)
                lineToRelative(-0.592f, 2.788f)
                curveToRelative(-1.24f, 0.038f, -2.358f, 0.41f, -3.17f, 0.992f)
                curveToRelative(-0.21f, -0.2f, -0.496f, -0.324f, -0.81f, -0.324f)
                arcToRelative(1.163f, 1.163f, 0.0f, false, false, -0.478f, 2.224f)
                quadToRelative(-0.03f, 0.17f, -0.029f, 0.353f)
                curveToRelative(0.0f, 1.795f, 2.091f, 3.256f, 4.669f, 3.256f)
                reflectiveCurveToRelative(4.668f, -1.451f, 4.668f, -3.256f)
                curveToRelative(0.0f, -0.114f, -0.01f, -0.238f, -0.029f, -0.353f)
                curveToRelative(0.401f, -0.181f, 0.688f, -0.592f, 0.688f, -1.069f)
                curveToRelative(0.0f, -0.65f, -0.525f, -1.165f, -1.165f, -1.165f)
            }
        }
        .build()
        return _reddit!!
    }

private var _reddit: ImageVector? = null
