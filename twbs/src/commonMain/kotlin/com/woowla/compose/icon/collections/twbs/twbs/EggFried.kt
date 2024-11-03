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

public val Twbs.EggFried: ImageVector
    get() {
        if (_eggFried != null) {
            return _eggFried!!
        }
        _eggFried = Builder(name = "EggFried", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.997f, 5.17f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -8.101f, -4.09f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 1.28f, 9.342f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 8.336f, 5.109f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 5.201f, -4.065f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, false, -0.822f, -5.216f)
                close()
                moveTo(12.997f, 5.136f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.668f, 0.977f)
                arcToRelative(2.001f, 2.001f, 0.0f, false, true, 0.547f, 3.478f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.341f, 1.113f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -3.715f, 2.905f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.262f, 0.152f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.67f, -4.087f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.2f, -1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.693f, -6.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.48f, 3.273f)
                close()
            }
        }
        .build()
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
