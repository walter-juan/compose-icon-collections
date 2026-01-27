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

public val Simpleicons.Just: ImageVector
    get() {
        if (_just != null) {
            return _just!!
        }
        _just = Builder(name = "Just", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                moveToRelative(0.0f, 2.35f)
                arcToRelative(3.25f, 3.35f, 0.0f, false, true, 3.25f, 3.35f)
                arcTo(3.25f, 3.35f, 0.0f, false, true, 12.0f, 9.05f)
                arcTo(3.25f, 3.35f, 0.0f, false, true, 8.75f, 5.7f)
                arcTo(3.25f, 3.35f, 0.0f, false, true, 12.0f, 2.35f)
                moveToRelative(0.0f, 12.6f)
                arcToRelative(3.25f, 3.35f, 0.0f, false, true, 3.25f, 3.35f)
                arcTo(3.25f, 3.35f, 0.0f, false, true, 12.0f, 21.65f)
                arcToRelative(3.25f, 3.35f, 0.0f, false, true, -3.25f, -3.35f)
                arcTo(3.25f, 3.35f, 0.0f, false, true, 12.0f, 14.95f)
            }
        }
        .build()
        return _just!!
    }

private var _just: ImageVector? = null
