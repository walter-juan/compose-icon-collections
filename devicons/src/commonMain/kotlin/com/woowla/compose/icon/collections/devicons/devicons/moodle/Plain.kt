package com.woowla.compose.icon.collections.devicons.devicons.moodle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.MoodleGroup

public val MoodleGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFF7931E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.66f, 45.06f)
                curveToRelative(-5.07f, -3.89f, -12.29f, -5.75f, -21.09f, -5.75f)
                curveToRelative(-9.65f, 0.0f, -16.38f, 2.2f, -19.94f, 6.77f)
                curveToRelative(-1.63f, -1.76f, -3.66f, -3.16f, -5.96f, -4.23f)
                curveToRelative(-2.44f, -2.48f, -4.98f, -3.99f, -7.57f, -4.72f)
                curveToRelative(5.75f, -3.69f, 12.5f, -8.68f, 21.04f, -15.43f)
                curveToRelative(-34.69f, 3.56f, -51.46f, 6.94f, -81.25f, 24.88f)
                curveToRelative(1.22f, 0.0f, 2.4f, 0.01f, 3.55f, 0.02f)
                curveToRelative(-0.71f, 5.57f, -0.34f, 13.88f, -0.21f, 16.34f)
                curveToRelative(-3.99f, 10.2f, -0.41f, 18.49f, 2.58f, 25.94f)
                curveToRelative(0.0f, -8.98f, 0.44f, -16.24f, -2.11f, -25.56f)
                lineToRelative(20.25f, -16.05f)
                curveToRelative(-0.33f, 3.03f, -0.28f, 6.55f, 0.31f, 10.81f)
                lineToRelative(0.06f, 0.02f)
                lineToRelative(-0.23f, 1.16f)
                lineToRelative(0.92f, 0.16f)
                curveToRelative(-0.23f, 1.51f, 0.0f, 3.07f, 0.0f, 4.75f)
                verticalLineTo(106.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(66.38f)
                curveToRelative(0.0f, -1.98f, 0.65f, -3.72f, 1.05f, -5.22f)
                curveToRelative(2.77f, -0.47f, 5.64f, -1.26f, 8.17f, -2.34f)
                lineToRelative(0.18f, 0.45f)
                curveToRelative(0.16f, -0.2f, 0.36f, -0.45f, 0.51f, -0.66f)
                curveToRelative(2.03f, -0.91f, 4.17f, -2.01f, 6.0f, -3.32f)
                curveTo(64.18f, 56.99f, 66.0f, 60.65f, 66.0f, 66.38f)
                verticalLineTo(106.0f)
                horizontalLineToRelative(21.0f)
                verticalLineTo(66.38f)
                curveToRelative(0.0f, -8.12f, 2.4f, -12.18f, 9.0f, -12.18f)
                reflectiveCurveToRelative(9.0f, 4.06f, 9.0f, 12.18f)
                verticalLineTo(106.0f)
                horizontalLineToRelative(21.0f)
                verticalLineTo(64.19f)
                curveToRelative(0.0f, -8.46f, -3.42f, -14.73f, -9.34f, -19.13f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
