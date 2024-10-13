package com.woowla.compose.icon.collections.devicons.devicons.tauri

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.TauriGroup

public val TauriGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(73.95f, 0.5f)
                arcToRelative(46.42f, 46.42f, 0.0f, false, false, -13.68f, 2.09f)
                arcToRelative(46.28f, 46.28f, 0.0f, false, false, -30.5f, 30.44f)
                curveToRelative(5.59f, -2.73f, 11.6f, -4.48f, 17.77f, -5.16f)
                curveToRelative(0.47f, -0.65f, 0.96f, -1.28f, 1.47f, -1.89f)
                curveToRelative(4.02f, -4.82f, 9.35f, -8.37f, 15.34f, -10.23f)
                arcToRelative(32.59f, 32.59f, 0.0f, false, true, 18.43f, -0.26f)
                arcToRelative(32.61f, 32.61f, 0.0f, false, true, 15.62f, 9.78f)
                curveToRelative(4.16f, 4.7f, 6.87f, 10.5f, 7.8f, 16.69f)
                arcToRelative(32.58f, 32.58f, 0.0f, false, true, -2.5f, 18.26f)
                curveToRelative(-2.58f, 5.72f, -6.75f, 10.57f, -12.02f, 13.97f)
                arcToRelative(32.59f, 32.59f, 0.0f, false, true, -6.97f, 3.4f)
                curveToRelative(0.16f, 1.31f, 0.24f, 2.65f, 0.24f, 4.0f)
                curveToRelative(0.0f, 3.74f, -0.63f, 7.33f, -1.79f, 10.67f)
                curveToRelative(5.69f, -1.14f, 11.11f, -3.35f, 15.99f, -6.5f)
                arcToRelative(46.4f, 46.4f, 0.0f, false, false, 17.1f, -19.89f)
                arcToRelative(46.41f, 46.41f, 0.0f, false, false, 3.56f, -25.98f)
                curveToRelative(-1.34f, -8.82f, -5.2f, -17.07f, -11.11f, -23.76f)
                reflectiveCurveTo(95.09f, 4.61f, 86.49f, 2.21f)
                arcTo(46.31f, 46.31f, 0.0f, false, false, 73.95f, 0.5f)
                close()
                moveTo(74.01f, 34.7f)
                curveToRelative(-6.7f, 0.0f, -12.14f, 5.43f, -12.14f, 12.14f)
                reflectiveCurveTo(67.31f, 58.98f, 74.01f, 58.98f)
                reflectiveCurveToRelative(12.14f, -5.44f, 12.14f, -12.14f)
                arcToRelative(12.14f, 12.14f, 0.0f, false, false, -12.14f, -12.14f)
                close()
                moveTo(44.48f, 36.14f)
                curveToRelative(-0.44f, 0.1f, -0.89f, 0.21f, -1.34f, 0.32f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, true, 0.01f, -0.03f)
                lineToRelative(-0.7f, 0.19f)
                arcToRelative(46.12f, 46.12f, 0.0f, false, false, -2.58f, 0.73f)
                arcToRelative(44.91f, 44.91f, 0.0f, false, false, -2.22f, 0.74f)
                curveToRelative(-0.71f, 0.26f, -1.41f, 0.54f, -2.1f, 0.83f)
                curveToRelative(-0.72f, 0.3f, -1.43f, 0.62f, -2.13f, 0.96f)
                reflectiveCurveToRelative(-1.39f, 0.69f, -2.08f, 1.07f)
                lineToRelative(-1.0f, 0.52f)
                lineToRelative(0.09f, 0.01f)
                curveToRelative(-0.69f, 0.38f, -1.38f, 0.77f, -2.06f, 1.19f)
                arcToRelative(46.33f, 46.33f, 0.0f, false, false, -17.1f, 19.89f)
                curveToRelative(-3.66f, 8.14f, -4.9f, 17.16f, -3.57f, 25.99f)
                reflectiveCurveToRelative(5.2f, 17.07f, 11.11f, 23.76f)
                reflectiveCurveToRelative(13.63f, 11.52f, 22.23f, 13.92f)
                arcToRelative(46.31f, 46.31f, 0.0f, false, false, 26.23f, -0.37f)
                curveToRelative(8.52f, -2.64f, 16.1f, -7.7f, 21.82f, -14.55f)
                curveToRelative(3.92f, -4.69f, 6.87f, -10.1f, 8.69f, -15.94f)
                curveToRelative(-5.58f, 2.74f, -11.6f, 4.5f, -17.78f, 5.2f)
                curveToRelative(-0.47f, 0.65f, -0.96f, 1.29f, -1.48f, 1.91f)
                arcToRelative(32.58f, 32.58f, 0.0f, false, true, -15.34f, 10.22f)
                arcToRelative(32.54f, 32.54f, 0.0f, false, true, -18.43f, 0.26f)
                curveToRelative(-6.04f, -1.69f, -11.47f, -5.08f, -15.62f, -9.78f)
                reflectiveCurveToRelative(-6.87f, -10.5f, -7.8f, -16.69f)
                arcToRelative(32.58f, 32.58f, 0.0f, false, true, 2.5f, -18.26f)
                curveToRelative(2.57f, -5.72f, 6.75f, -10.57f, 12.02f, -13.97f)
                arcToRelative(32.5f, 32.5f, 0.0f, false, true, 6.83f, -3.36f)
                curveToRelative(-0.12f, -1.15f, -0.18f, -2.32f, -0.18f, -3.5f)
                curveToRelative(0.0f, -3.96f, 0.7f, -7.75f, 1.99f, -11.25f)
                close()
                moveTo(30.33f, 41.48f)
                horizontalLineToRelative(-0.0f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(53.6f, 69.46f)
                curveToRelative(-6.7f, 0.0f, -12.14f, 5.43f, -12.14f, 12.14f)
                arcToRelative(12.14f, 12.14f, 0.0f, false, false, 12.14f, 12.14f)
                curveToRelative(6.7f, 0.0f, 12.14f, -5.44f, 12.14f, -12.14f)
                arcToRelative(12.14f, 12.14f, 0.0f, false, false, -12.14f, -12.14f)
                close()
                moveTo(97.14f, 86.96f)
                curveToRelative(-0.06f, 0.04f, -0.12f, 0.07f, -0.18f, 0.1f)
                curveToRelative(0.06f, -0.03f, 0.13f, -0.07f, 0.18f, -0.1f)
                close()
                moveTo(97.14f, 86.96f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
