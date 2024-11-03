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

public val Twbs.Ubuntu: ImageVector
    get() {
        if (_ubuntu != null) {
            return _ubuntu!!
        }
        _ubuntu = Builder(name = "Ubuntu", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.273f, 9.53f)
                arcToRelative(2.273f, 2.273f, 0.0f, true, false, 0.0f, -4.546f)
                arcToRelative(2.273f, 2.273f, 0.0f, false, false, 0.0f, 4.547f)
                close()
                moveTo(11.74f, 4.546f)
                arcToRelative(2.273f, 2.273f, 0.0f, true, false, 0.0f, -4.546f)
                arcToRelative(2.273f, 2.273f, 0.0f, false, false, 0.0f, 4.546f)
                moveTo(7.4f, 13.108f)
                arcToRelative(5.54f, 5.54f, 0.0f, false, true, -3.775f, -2.88f)
                arcToRelative(3.27f, 3.27f, 0.0f, false, true, -1.944f, 0.24f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, false, 5.328f, 4.465f)
                curveToRelative(0.53f, 0.113f, 1.072f, 0.169f, 1.614f, 0.166f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -0.666f, -1.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.557f, -0.091f)
                moveToRelative(3.828f, 2.285f)
                arcToRelative(2.273f, 2.273f, 0.0f, true, false, 0.0f, -4.546f)
                arcToRelative(2.273f, 2.273f, 0.0f, false, false, 0.0f, 4.546f)
                moveToRelative(3.163f, -3.108f)
                arcToRelative(7.44f, 7.44f, 0.0f, false, false, 0.373f, -8.726f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, -1.278f, 1.498f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, -0.183f, 5.535f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, true, 1.088f, 1.693f)
                moveTo(2.098f, 3.998f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 1.897f, 0.486f)
                arcToRelative(5.54f, 5.54f, 0.0f, false, true, 4.464f, -2.388f)
                curveToRelative(0.037f, -0.67f, 0.277f, -1.313f, 0.69f, -1.843f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, false, -7.051f, 3.745f)
            }
        }
        .build()
        return _ubuntu!!
    }

private var _ubuntu: ImageVector? = null
