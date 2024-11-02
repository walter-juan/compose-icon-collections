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

public val Simpleicons.Calibreweb: ImageVector
    get() {
        if (_calibreweb != null) {
            return _calibreweb!!
        }
        _calibreweb = Builder(name = "Calibreweb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.736f, 0.083f)
                quadToRelative(4.935f, -0.678f, 5.525f, 4.192f)
                quadToRelative(-1.104f, 5.486f, -6.478f, 7.145f)
                quadToRelative(-1.313f, 0.398f, -2.667f, 0.191f)
                quadToRelative(-0.409f, -0.133f, -0.667f, -0.476f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, 0.0f, -1.715f)
                quadToRelative(4.073f, 0.442f, 6.478f, -3.048f)
                quadToRelative(0.867f, -1.316f, 0.572f, -2.858f)
                quadToRelative(-0.558f, -1.204f, -1.905f, -1.143f)
                quadToRelative(-2.707f, 0.45f, -4.382f, 2.667f)
                quadToRelative(-3.914f, 5.755f, -2.477f, 12.575f)
                quadToRelative(1.59f, 5.439f, 6.954f, 3.525f)
                quadToRelative(1.458f, -0.747f, 2.667f, -1.81f)
                quadToRelative(1.627f, 0.683f, 0.857f, 2.286f)
                quadToRelative(-4.452f, 3.901f, -9.812f, 1.429f)
                quadToRelative(-3.138f, -2.512f, -3.525f, -6.573f)
                quadToRelative(-0.858f, -7.33f, 3.62f, -13.146f)
                quadTo(10.673f, 0.927f, 13.736f, 0.083f)
            }
        }
        .build()
        return _calibreweb!!
    }

private var _calibreweb: ImageVector? = null
