package com.woowla.compose.icon.collections.devicons.devicons.jeet

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.JeetGroup

public val JeetGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFFF664A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.45f, 41.34f)
                lineToRelative(-0.04f, -0.04f)
                curveToRelative(-10.82f, -1.23f, -19.4f, -9.81f, -20.63f, -20.63f)
                lineToRelative(-0.06f, -0.06f)
                curveTo(85.0f, 9.35f, 75.27f, 0.72f, 63.53f, 0.72f)
                curveToRelative(-12.96f, 0.0f, -23.47f, 10.51f, -23.47f, 23.47f)
                curveToRelative(0.0f, 0.37f, 0.01f, 0.74f, 0.03f, 1.1f)
                arcTo(23.49f, 23.49f, 0.0f, false, true, 24.61f, 40.32f)
                curveToRelative(-0.22f, -0.01f, -0.44f, -0.02f, -0.66f, -0.02f)
                curveTo(10.99f, 40.3f, 0.48f, 50.81f, 0.48f, 63.77f)
                curveToRelative(0.0f, 12.67f, 10.04f, 22.99f, 22.6f, 23.45f)
                curveToRelative(8.89f, 2.07f, 15.84f, 9.17f, 17.66f, 18.15f)
                curveToRelative(0.8f, 12.23f, 10.97f, 21.91f, 23.41f, 21.91f)
                curveToRelative(12.55f, 0.0f, 22.79f, -9.85f, 23.44f, -22.23f)
                arcToRelative(23.49f, 23.49f, 0.0f, false, true, 15.18f, -17.06f)
                curveToRelative(0.43f, 0.02f, 0.86f, 0.04f, 1.29f, 0.04f)
                curveToRelative(12.96f, 0.0f, 23.47f, -10.51f, 23.47f, -23.47f)
                curveToRelative(0.0f, -11.81f, -8.72f, -21.57f, -20.07f, -23.22f)
                close()
                moveTo(47.97f, 63.77f)
                curveToRelative(0.0f, -8.32f, 6.28f, -15.16f, 14.37f, -16.06f)
                curveToRelative(0.13f, -0.01f, 0.26f, -0.02f, 0.39f, -0.04f)
                curveToRelative(0.15f, -0.01f, 0.29f, -0.01f, 0.44f, -0.02f)
                curveToRelative(0.12f, 0.0f, 0.24f, 0.01f, 0.36f, 0.01f)
                curveToRelative(0.4f, 0.0f, 0.79f, -0.01f, 1.18f, -0.03f)
                curveToRelative(8.67f, 0.3f, 15.61f, 7.4f, 15.61f, 16.14f)
                curveToRelative(0.0f, 0.12f, -0.01f, 0.24f, -0.01f, 0.36f)
                curveToRelative(-0.19f, 8.44f, -6.84f, 15.29f, -15.2f, 15.78f)
                curveToRelative(-0.18f, 0.06f, -0.36f, 0.11f, -0.54f, 0.16f)
                curveToRelative(-0.19f, -0.05f, -0.37f, -0.09f, -0.56f, -0.14f)
                curveToRelative(-8.54f, -0.07f, -15.49f, -6.76f, -15.99f, -15.19f)
                curveToRelative(-0.04f, -0.12f, -0.07f, -0.25f, -0.11f, -0.37f)
                curveToRelative(0.03f, -0.12f, 0.05f, -0.24f, 0.09f, -0.35f)
                curveToRelative(0.0f, -0.08f, -0.01f, -0.17f, -0.01f, -0.25f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
