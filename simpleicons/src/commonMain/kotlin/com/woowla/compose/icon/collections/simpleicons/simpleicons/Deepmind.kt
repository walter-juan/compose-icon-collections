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

public val Simpleicons.Deepmind: ImageVector
    get() {
        if (_deepmind != null) {
            return _deepmind!!
        }
        _deepmind = Builder(name = "Deepmind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.99f, 1.62f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, false, -2.54f, 6.83f)
                curveToRelative(0.35f, 4.4f, 4.51f, 7.99f, 8.28f, 7.99f)
                curveToRelative(3.5f, 0.0f, 4.88f, -3.06f, 4.54f, -5.14f)
                arcToRelative(4.32f, 4.32f, 0.0f, false, false, -0.95f, -2.07f)
                curveToRelative(0.63f, 0.34f, 1.24f, 0.77f, 1.81f, 1.3f)
                curveToRelative(1.52f, 1.41f, 2.44f, 3.23f, 2.58f, 5.1f)
                curveToRelative(0.33f, 4.13f, -2.73f, 8.37f, -7.85f, 8.37f)
                curveToRelative(-1.69f, 0.0f, -3.48f, -0.43f, -4.98f, -1.14f)
                curveToRelative(-4.06f, -1.92f, -6.88f, -6.06f, -6.88f, -10.86f)
                curveToRelative(0.0f, -4.43f, 2.41f, -8.3f, 5.99f, -10.38f)
                close()
                moveTo(12.14f, 0.0f)
                curveToRelative(1.69f, 0.0f, 3.48f, 0.43f, 4.98f, 1.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.88f, 10.86f)
                curveToRelative(0.0f, 4.43f, -2.41f, 8.3f, -5.99f, 10.38f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, false, 2.54f, -6.83f)
                curveToRelative(-0.35f, -4.4f, -4.51f, -7.99f, -8.28f, -7.99f)
                curveToRelative(-3.5f, 0.0f, -4.88f, 3.06f, -4.54f, 5.14f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 0.96f, 2.07f)
                arcToRelative(8.72f, 8.72f, 0.0f, false, true, -1.81f, -1.3f)
                curveToRelative(-1.52f, -1.41f, -2.44f, -3.23f, -2.59f, -5.1f)
                curveToRelative(-0.33f, -4.13f, 2.73f, -8.37f, 7.85f, -8.37f)
                close()
            }
        }
        .build()
        return _deepmind!!
    }

private var _deepmind: ImageVector? = null
