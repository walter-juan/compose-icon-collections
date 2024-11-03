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

public val Twbs.Radar: ImageVector
    get() {
        if (_radar != null) {
            return _radar!!
        }
        _radar = Builder(name = "Radar", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.634f, 1.135f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 15.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.5f, 5.98f)
                verticalLineToRelative(-1.005f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 13.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.5f, 3.969f)
                verticalLineToRelative(-1.011f)
                arcTo(2.999f, 2.999f, 0.0f, true, true, 11.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.5f, 1.936f)
                verticalLineToRelative(-1.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 0.0f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-0.518f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.866f, -13.847f)
            }
        }
        .build()
        return _radar!!
    }

private var _radar: ImageVector? = null
