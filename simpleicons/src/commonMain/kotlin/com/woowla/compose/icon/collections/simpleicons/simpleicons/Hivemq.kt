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

public val Simpleicons.Hivemq: ImageVector
    get() {
        if (_hivemq != null) {
            return _hivemq!!
        }
        _hivemq = Builder(name = "Hivemq", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.01f)
                curveToRelative(6.06f, 0.0f, 10.99f, 4.93f, 10.99f, 10.99f)
                reflectiveCurveToRelative(-4.93f, 10.99f, -10.99f, 10.99f)
                reflectiveCurveTo(1.01f, 18.06f, 1.01f, 12.0f)
                reflectiveCurveTo(5.94f, 1.01f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 1.96f)
                curveTo(6.47f, 1.97f, 1.97f, 6.47f, 1.97f, 12.0f)
                reflectiveCurveToRelative(4.5f, 10.03f, 10.03f, 10.03f)
                reflectiveCurveToRelative(10.03f, -4.5f, 10.03f, -10.03f)
                reflectiveCurveTo(17.53f, 1.97f, 12.0f, 1.97f)
                close()
                moveTo(11.1f, 5.75f)
                curveToRelative(0.05f, 0.0f, 0.1f, 0.04f, 0.12f, 0.09f)
                lineToRelative(0.23f, 0.5f)
                curveToRelative(0.38f, -0.12f, 0.8f, -0.12f, 1.18f, 0.0f)
                lineToRelative(0.23f, -0.5f)
                curveToRelative(0.03f, -0.07f, 0.12f, -0.11f, 0.2f, -0.07f)
                curveToRelative(0.07f, 0.03f, 0.1f, 0.12f, 0.07f, 0.19f)
                lineToRelative(-0.21f, 0.46f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.2f, 0.1f, 0.39f, 0.23f, 0.55f, 0.39f)
                curveToRelative(0.3f, 0.29f, 0.49f, 0.67f, 0.56f, 1.09f)
                curveToRelative(0.02f, 0.11f, 0.03f, 0.23f, 0.03f, 0.34f)
                curveToRelative(0.0f, 0.31f, -0.07f, 0.62f, -0.21f, 0.9f)
                curveToRelative(2.77f, -1.25f, 5.03f, -1.6f, 5.57f, -0.85f)
                curveToRelative(0.48f, 0.85f, -0.49f, 1.92f, -2.12f, 3.31f)
                lineToRelative(-0.04f, -0.04f)
                curveToRelative(-0.11f, -0.11f, -0.1f, -0.29f, 0.01f, -0.4f)
                curveToRelative(0.62f, -0.58f, 1.98f, -1.96f, 1.2f, -2.36f)
                curveToRelative(-0.87f, -0.44f, -3.23f, 0.17f, -5.85f, 1.56f)
                curveToRelative(3.73f, 2.16f, 6.26f, 4.74f, 5.66f, 5.78f)
                curveToRelative(-0.38f, 0.65f, -1.94f, 0.56f, -3.94f, -0.14f)
                lineToRelative(0.07f, -0.12f)
                curveToRelative(0.07f, -0.11f, 0.2f, -0.16f, 0.33f, -0.12f)
                curveToRelative(1.39f, 0.42f, 2.25f, 0.62f, 2.55f, 0.17f)
                curveToRelative(0.42f, -0.72f, -1.7f, -3.22f, -4.99f, -5.12f)
                curveToRelative(-0.08f, -0.05f, -0.17f, -0.1f, -0.25f, -0.14f)
                lineToRelative(-0.25f, 0.14f)
                curveToRelative(-3.29f, 1.9f, -5.41f, 4.39f, -4.99f, 5.12f)
                curveToRelative(0.3f, 0.45f, 1.16f, 0.25f, 2.55f, -0.17f)
                curveToRelative(0.12f, -0.04f, 0.26f, 0.01f, 0.33f, 0.12f)
                lineToRelative(0.07f, 0.12f)
                curveToRelative(-2.0f, 0.71f, -3.56f, 0.79f, -3.94f, 0.14f)
                curveToRelative(-0.6f, -1.04f, 1.94f, -3.62f, 5.66f, -5.78f)
                curveToRelative(-0.72f, -0.38f, -1.47f, -0.72f, -2.23f, -1.02f)
                curveToRelative(-0.73f, -0.28f, -3.08f, -1.07f, -3.71f, -0.47f)
                curveToRelative(-0.2f, 0.19f, -0.19f, 0.54f, 0.23f, 1.12f)
                curveToRelative(0.32f, 0.44f, 0.78f, 0.9f, 1.07f, 1.17f)
                curveToRelative(0.11f, 0.11f, 0.12f, 0.28f, 0.01f, 0.4f)
                lineToRelative(-0.04f, 0.04f)
                curveToRelative(-0.6f, -0.51f, -2.83f, -2.3f, -2.1f, -3.32f)
                curveToRelative(0.8f, -1.12f, 4.78f, 0.52f, 5.5f, 0.85f)
                curveToRelative(-0.48f, -1.01f, -0.06f, -2.21f, 0.94f, -2.69f)
                lineToRelative(-0.02f, -0.04f)
                lineToRelative(-0.2f, -0.45f)
                curveToRelative(-0.03f, -0.07f, 0.0f, -0.16f, 0.07f, -0.2f)
                curveToRelative(0.02f, -0.01f, 0.05f, -0.02f, 0.08f, -0.01f)
                close()
                moveTo(11.32f, 6.71f)
                curveToRelative(-0.69f, 0.32f, -1.08f, 1.06f, -0.97f, 1.82f)
                curveToRelative(0.69f, -0.32f, 1.08f, -1.06f, 0.97f, -1.82f)
                close()
                moveTo(12.74f, 6.71f)
                curveToRelative(-0.12f, 0.75f, 0.27f, 1.49f, 0.97f, 1.82f)
                curveToRelative(0.12f, -0.75f, -0.28f, -1.49f, -0.97f, -1.82f)
                close()
                moveTo(12.04f, 11.29f)
                curveToRelative(0.78f, 0.46f, 1.54f, 0.95f, 2.27f, 1.49f)
                curveToRelative(0.13f, 0.4f, 0.2f, 0.81f, 0.18f, 1.23f)
                horizontalLineToRelative(-4.91f)
                curveToRelative(-0.02f, -0.42f, 0.05f, -0.83f, 0.18f, -1.23f)
                curveToRelative(0.73f, -0.53f, 1.49f, -1.03f, 2.27f, -1.49f)
                close()
                moveTo(9.73f, 14.86f)
                horizontalLineToRelative(4.63f)
                curveToRelative(-0.11f, 0.37f, -0.29f, 0.72f, -0.52f, 1.02f)
                horizontalLineToRelative(-3.58f)
                curveToRelative(-0.24f, -0.3f, -0.42f, -0.65f, -0.52f, -1.02f)
                close()
                moveTo(11.03f, 16.74f)
                horizontalLineToRelative(2.02f)
                curveToRelative(-0.31f, 0.32f, -0.55f, 0.61f, -1.01f, 1.44f)
                curveToRelative(-0.46f, -0.83f, -0.7f, -1.12f, -1.01f, -1.44f)
                close()
            }
        }
        .build()
        return _hivemq!!
    }

private var _hivemq: ImageVector? = null
