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

public val Twbs.ExclamationLg: ImageVector
    get() {
        if (_exclamationLg != null) {
            return _exclamationLg!!
        }
        _exclamationLg = Builder(name = "ExclamationLg", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.005f, 3.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.99f, 0.0f)
                lineToRelative(-0.388f, 6.35f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -1.214f, 0.0f)
                close()
                moveTo(7.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _exclamationLg!!
    }

private var _exclamationLg: ImageVector? = null
