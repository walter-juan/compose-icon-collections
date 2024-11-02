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

public val Simpleicons.Indeed: ImageVector
    get() {
        if (_indeed != null) {
            return _indeed!!
        }
        _indeed = Builder(name = "Indeed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.566f, 21.563f)
                verticalLineToRelative(-8.762f)
                curveToRelative(0.255f, 0.023f, 0.501f, 0.035f, 0.758f, 0.035f)
                curveToRelative(1.222f, 0.0f, 2.374f, -0.321f, 3.351f, -0.893f)
                verticalLineToRelative(9.618f)
                curveToRelative(0.0f, 0.822f, -0.196f, 1.429f, -0.576f, 1.834f)
                curveToRelative(-0.378f, 0.403f, -0.881f, 0.605f, -1.491f, 0.605f)
                curveToRelative(-0.601f, 0.0f, -1.077f, -0.202f, -1.468f, -0.618f)
                curveToRelative(-0.378f, -0.403f, -0.574f, -1.01f, -0.574f, -1.818f)
                close()
                moveTo(11.589f, 0.566f)
                curveToRelative(2.545f, -0.893f, 5.442f, -0.845f, 7.619f, 0.987f)
                curveToRelative(0.405f, 0.369f, 0.867f, 0.833f, 1.051f, 1.381f)
                curveToRelative(0.221f, 0.691f, -0.77f, -0.073f, -0.906f, -0.167f)
                curveToRelative(-0.71f, -0.453f, -1.418f, -0.833f, -2.213f, -1.095f)
                curveTo(12.861f, 0.387f, 8.812f, 2.709f, 6.294f, 6.315f)
                curveToRelative(-1.052f, 1.594f, -1.737f, 3.272f, -2.299f, 5.117f)
                curveToRelative(-0.061f, 0.202f, -0.109f, 0.465f, -0.221f, 0.641f)
                curveToRelative(-0.111f, 0.204f, -0.048f, -0.545f, -0.048f, -0.57f)
                curveToRelative(0.084f, -0.762f, 0.244f, -1.5f, 0.441f, -2.237f)
                curveTo(5.329f, 5.338f, 7.897f, 2.066f, 11.589f, 0.566f)
                close()
                moveTo(16.517f, 7.625f)
                curveToRelative(0.0f, 1.669f, -1.353f, 3.022f, -3.02f, 3.022f)
                curveToRelative(-1.668f, 0.0f, -3.019f, -1.354f, -3.019f, -3.022f)
                curveToRelative(0.0f, -1.669f, 1.351f, -3.022f, 3.019f, -3.022f)
                curveToRelative(1.668f, 0.0f, 3.02f, 1.352f, 3.02f, 3.022f)
                close()
            }
        }
        .build()
        return _indeed!!
    }

private var _indeed: ImageVector? = null
