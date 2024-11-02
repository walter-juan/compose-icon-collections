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

public val Simpleicons.Twinmotion: ImageVector
    get() {
        if (_twinmotion != null) {
            return _twinmotion!!
        }
        _twinmotion = Builder(name = "Twinmotion", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.117f)
                curveTo(7.08f, 0.117f, 2.851f, 3.079f, 0.999f, 7.317f)
                horizontalLineToRelative(15.799f)
                verticalLineToRelative(0.004f)
                lineToRelative(-2.364f, 16.548f)
                curveTo(19.895f, 22.744f, 24.0f, 17.91f, 24.0f, 12.118f)
                horizontalLineToRelative(-6.261f)
                lineToRelative(0.688f, -4.8f)
                horizontalLineToRelative(4.574f)
                curveTo(21.148f, 3.078f, 16.921f, 0.117f, 12.0f, 0.117f)
                moveToRelative(-12.0f, 12.0f)
                curveToRelative(0.0f, 5.816f, 4.139f, 10.666f, 9.633f, 11.765f)
                lineToRelative(1.681f, -11.765f)
                close()
            }
        }
        .build()
        return _twinmotion!!
    }

private var _twinmotion: ImageVector? = null
