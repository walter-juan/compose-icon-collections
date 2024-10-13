package com.woowla.compose.icon.collections.devicons.devicons.reactrouter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ReactrouterGroup

public val ReactrouterGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(99.04f, 50.31f)
                curveToRelative(-3.65f, -1.15f, -5.53f, -0.76f, -9.35f, -1.18f)
                curveToRelative(-5.91f, -0.64f, -8.27f, -2.96f, -9.26f, -8.91f)
                curveToRelative(-0.56f, -3.32f, 0.1f, -8.19f, -1.33f, -11.2f)
                curveToRelative(-2.73f, -5.75f, -9.11f, -8.32f, -15.53f, -6.85f)
                curveToRelative(-5.42f, 1.24f, -9.92f, 6.67f, -10.17f, 12.23f)
                curveToRelative(-0.28f, 6.36f, 3.33f, 11.78f, 9.54f, 13.65f)
                curveToRelative(2.95f, 0.89f, 6.08f, 1.34f, 9.16f, 1.57f)
                curveToRelative(5.65f, 0.41f, 6.08f, 3.56f, 7.61f, 6.15f)
                curveToRelative(0.96f, 1.63f, 1.9f, 3.24f, 1.9f, 8.11f)
                reflectiveCurveToRelative(-0.94f, 6.47f, -1.9f, 8.11f)
                curveToRelative(-1.53f, 2.58f, -3.41f, 4.28f, -9.06f, 4.69f)
                curveToRelative(-3.08f, 0.23f, -6.22f, 0.68f, -9.16f, 1.57f)
                curveToRelative(-6.21f, 1.88f, -9.82f, 7.29f, -9.54f, 13.65f)
                curveToRelative(0.25f, 5.57f, 4.76f, 10.99f, 10.17f, 12.23f)
                curveToRelative(6.41f, 1.48f, 12.8f, -1.11f, 15.53f, -6.85f)
                curveToRelative(1.43f, -3.01f, 2.22f, -6.43f, 2.78f, -9.75f)
                curveToRelative(1.0f, -5.95f, 3.36f, -8.27f, 9.26f, -8.91f)
                curveToRelative(3.82f, -0.42f, 7.78f, 0.0f, 11.36f, -2.04f)
                curveToRelative(3.79f, -2.77f, 7.17f, -6.93f, 7.17f, -12.69f)
                curveToRelative(0.0f, -5.76f, -3.64f, -11.81f, -9.18f, -13.55f)
                close()
                moveTo(38.4f, 77.37f)
                curveToRelative(-7.45f, 0.0f, -13.53f, -6.1f, -13.53f, -13.57f)
                curveToRelative(0.0f, -7.48f, 6.08f, -13.57f, 13.53f, -13.57f)
                curveToRelative(7.45f, 0.0f, 13.53f, 6.1f, 13.53f, 13.57f)
                curveToRelative(0.0f, 7.47f, -6.08f, 13.57f, -13.53f, 13.57f)
                close()
                moveTo(13.48f, 104.96f)
                curveTo(6.04f, 104.94f, -0.02f, 98.82f, 0.0f, 91.34f)
                curveToRelative(0.02f, -7.47f, 6.12f, -13.55f, 13.57f, -13.53f)
                curveToRelative(7.44f, 0.02f, 13.5f, 6.14f, 13.48f, 13.62f)
                curveToRelative(-0.02f, 7.46f, -6.12f, 13.55f, -13.57f, 13.53f)
                close()
                moveTo(113.99f, 104.96f)
                curveToRelative(-7.46f, 0.04f, -13.59f, -6.01f, -13.63f, -13.47f)
                curveToRelative(-0.04f, -7.49f, 5.99f, -13.63f, 13.43f, -13.68f)
                curveToRelative(7.46f, -0.04f, 13.59f, 6.01f, 13.63f, 13.47f)
                curveToRelative(0.04f, 7.48f, -5.99f, 13.64f, -13.43f, 13.68f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
