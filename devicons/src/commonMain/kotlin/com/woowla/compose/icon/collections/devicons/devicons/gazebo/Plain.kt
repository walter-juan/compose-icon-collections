package com.woowla.compose.icon.collections.devicons.devicons.gazebo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.GazeboGroup

public val GazeboGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.91f, 35.2f)
                lineToRelative(43.09f, 26.76f)
                lineToRelative(43.1f, -26.83f)
                lineToRelative(-43.09f, -26.68f)
                lineToRelative(-43.1f, 26.76f)
                moveTo(63.99f, 0.64f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, false, -1.88f, 0.53f)
                lineTo(12.22f, 32.15f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, false, -1.69f, 3.06f)
                verticalLineToRelative(57.59f)
                curveToRelative(0.0f, 1.24f, 0.64f, 2.4f, 1.69f, 3.06f)
                lineToRelative(49.89f, 30.97f)
                curveToRelative(0.02f, 0.01f, 0.04f, 0.03f, 0.07f, 0.04f)
                curveToRelative(0.03f, 0.02f, 0.05f, 0.04f, 0.08f, 0.05f)
                curveToRelative(0.06f, 0.03f, 0.12f, 0.04f, 0.18f, 0.07f)
                curveToRelative(0.06f, 0.03f, 0.12f, 0.07f, 0.18f, 0.1f)
                curveToRelative(0.09f, 0.04f, 0.19f, 0.06f, 0.29f, 0.1f)
                curveToRelative(0.06f, 0.02f, 0.11f, 0.04f, 0.16f, 0.05f)
                curveToRelative(0.11f, 0.03f, 0.22f, 0.05f, 0.33f, 0.07f)
                curveToRelative(0.05f, 0.01f, 0.09f, 0.02f, 0.14f, 0.03f)
                curveToRelative(0.16f, 0.02f, 0.31f, 0.03f, 0.46f, 0.03f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, 0.97f, -0.14f)
                horizontalLineToRelative(0.01f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, false, 0.35f, -0.12f)
                curveToRelative(0.04f, -0.01f, 0.07f, -0.03f, 0.11f, -0.04f)
                curveToRelative(0.1f, -0.04f, 0.19f, -0.1f, 0.29f, -0.15f)
                curveToRelative(0.05f, -0.03f, 0.11f, -0.05f, 0.16f, -0.08f)
                lineToRelative(0.1f, -0.07f)
                lineToRelative(49.8f, -30.91f)
                arcToRelative(3.59f, 3.59f, 0.0f, false, false, 1.69f, -3.06f)
                lineToRelative(-0.1f, -28.87f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, -1.84f, -3.13f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, -3.63f, 0.09f)
                lineToRelative(-21.24f, 13.23f)
                lineToRelative(-16.37f, -10.14f)
                lineToRelative(41.49f, -25.83f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, 1.69f, -3.04f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -1.71f, -3.04f)
                lineTo(65.89f, 1.17f)
                arcTo(3.61f, 3.61f, 0.0f, false, false, 63.99f, 0.64f)
                close()
                moveTo(17.57f, 41.56f)
                lineTo(53.7f, 64.01f)
                lineTo(17.57f, 86.43f)
                close()
                moveTo(67.5f, 68.21f)
                lineTo(83.88f, 78.35f)
                lineTo(62.01f, 91.96f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, false, -1.68f, 3.04f)
                lineToRelative(0.05f, 22.32f)
                lineToRelative(-39.48f, -24.53f)
                lineToRelative(39.59f, -24.57f)
                lineToRelative(1.61f, 1.0f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, false, 1.88f, 0.53f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, 1.9f, -0.53f)
                close()
                moveTo(110.24f, 70.38f)
                lineTo(110.3f, 90.82f)
                lineTo(67.57f, 117.35f)
                lineTo(67.5f, 96.99f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
