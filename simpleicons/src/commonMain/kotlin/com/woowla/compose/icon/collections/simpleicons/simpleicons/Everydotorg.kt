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

public val Simpleicons.Everydotorg: ImageVector
    get() {
        if (_everydotorg != null) {
            return _everydotorg!!
        }
        _everydotorg = Builder(name = "Everydotorg", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.151f, 9.36f)
                curveToRelative(0.0f, -4.467f, -3.728f, -7.855f, -8.517f, -7.855f)
                curveTo(4.278f, 1.505f, 0.0f, 6.028f, 0.0f, 11.63f)
                curveToRelative(0.0f, 6.038f, 4.808f, 10.864f, 11.28f, 10.864f)
                curveToRelative(6.474f, 0.0f, 12.266f, -5.13f, 12.72f, -11.848f)
                horizontalLineToRelative(-2.953f)
                curveToRelative(-0.549f, 5.034f, -4.807f, 8.896f, -9.766f, 8.896f)
                curveToRelative(-4.77f, 0.0f, -8.31f, -3.502f, -8.31f, -7.912f)
                curveToRelative(0.0f, -3.975f, 2.953f, -7.174f, 6.663f, -7.174f)
                curveToRelative(3.104f, 0.0f, 5.546f, 2.12f, 5.546f, 4.903f)
                curveToRelative(0.0f, 2.309f, -1.666f, 4.24f, -3.88f, 4.24f)
                verticalLineToRelative(2.952f)
                curveToRelative(3.918f, 0.0f, 6.851f, -3.274f, 6.851f, -7.192f)
            }
        }
        .build()
        return _everydotorg!!
    }

private var _everydotorg: ImageVector? = null
