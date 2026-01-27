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

public val Simpleicons.Rekaui: ImageVector
    get() {
        if (_rekaui != null) {
            return _rekaui!!
        }
        _rekaui = Builder(name = "Rekaui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.348f, 1.327f)
                curveToRelative(-0.686f, 0.0f, -1.115f, 0.744f, -0.77f, 1.337f)
                lineToRelative(2.564f, 4.416f)
                horizontalLineToRelative(7.948f)
                curveToRelative(1.122f, 0.0f, 1.85f, 1.26f, 1.291f, 2.232f)
                lineToRelative(-3.954f, 6.869f)
                lineToRelative(3.408f, 5.869f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, 0.77f, 0.443f)
                horizontalLineToRelative(5.504f)
                curveToRelative(0.711f, 0.0f, 1.135f, -0.792f, 0.741f, -1.384f)
                lineToRelative(-3.629f, -5.45f)
                curveToRelative(-0.318f, -0.477f, -0.089f, -1.109f, 0.402f, -1.362f)
                curveToRelative(1.132f, -0.592f, 1.968f, -1.403f, 2.513f, -2.435f)
                curveToRelative(0.547f, -1.034f, 0.822f, -2.222f, 0.822f, -3.567f)
                curveToRelative(0.0f, -1.344f, -0.275f, -2.54f, -0.822f, -3.59f)
                curveToRelative(-0.545f, -1.046f, -1.385f, -1.869f, -2.524f, -2.468f)
                lineToRelative(-0.001f, -0.0f)
                curveToRelative(-1.137f, -0.605f, -2.598f, -0.911f, -4.388f, -0.911f)
                close()
                moveTo(0.991f, 7.58f)
                curveToRelative(-0.761f, 0.0f, -1.237f, 0.823f, -0.857f, 1.483f)
                lineToRelative(7.549f, 13.115f)
                curveToRelative(0.38f, 0.661f, 1.334f, 0.661f, 1.715f, 0.0f)
                lineTo(16.947f, 9.063f)
                curveToRelative(0.38f, -0.66f, -0.096f, -1.483f, -0.857f, -1.483f)
                close()
            }
        }
        .build()
        return _rekaui!!
    }

private var _rekaui: ImageVector? = null
