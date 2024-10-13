package com.woowla.compose.icon.collections.devicons.devicons.pycharm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PycharmGroup

public val PycharmGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(55.54f, 5.49f)
                lineToRelative(-42.87f, 17.97f)
                lineToRelative(-7.18f, 75.67f)
                lineToRelative(40.13f, 23.39f)
                lineToRelative(8.09f, -9.54f)
                lineToRelative(33.11f, 9.32f)
                lineToRelative(35.69f, -12.12f)
                lineToRelative(-10.19f, -38.63f)
                lineToRelative(9.41f, -19.15f)
                lineToRelative(-20.66f, -17.18f)
                verticalLineToRelative(65.86f)
                lineTo(26.93f, 101.07f)
                lineTo(26.93f, 26.93f)
                horizontalLineToRelative(68.75f)
                lineTo(92.53f, 5.49f)
                lineTo(76.87f, 19.47f)
                lineTo(55.54f, 5.49f)
                close()
                moveTo(27.93f, 27.93f)
                verticalLineToRelative(72.14f)
                horizontalLineToRelative(72.14f)
                lineTo(100.07f, 27.93f)
                lineTo(27.93f, 27.93f)
                close()
                moveTo(75.82f, 36.12f)
                arcToRelative(14.13f, 14.13f, 0.0f, false, true, 10.8f, 4.22f)
                lineToRelative(-3.83f, 4.43f)
                arcToRelative(10.15f, 10.15f, 0.0f, false, false, -7.01f, -3.1f)
                curveToRelative(-4.62f, 0.0f, -7.95f, 3.84f, -7.95f, 8.53f)
                verticalLineToRelative(0.09f)
                curveToRelative(0.0f, 4.69f, 3.25f, 8.61f, 7.95f, 8.61f)
                curveToRelative(3.13f, 0.0f, 5.05f, -1.22f, 7.2f, -3.2f)
                lineToRelative(3.83f, 3.86f)
                arcToRelative(13.97f, 13.97f, 0.0f, false, true, -11.23f, 4.88f)
                arcTo(13.84f, 13.84f, 0.0f, false, true, 61.55f, 50.36f)
                verticalLineToRelative(-0.07f)
                arcTo(13.91f, 13.91f, 0.0f, false, true, 75.82f, 36.12f)
                close()
                moveTo(36.57f, 36.57f)
                horizontalLineToRelative(11.22f)
                curveToRelative(6.53f, 0.0f, 10.5f, 3.88f, 10.5f, 9.47f)
                verticalLineToRelative(0.07f)
                curveToRelative(0.0f, 6.34f, -4.94f, 9.63f, -11.08f, 9.63f)
                horizontalLineToRelative(-4.53f)
                verticalLineToRelative(8.22f)
                horizontalLineToRelative(-6.1f)
                lineTo(36.57f, 36.57f)
                close()
                moveTo(42.67f, 42.01f)
                verticalLineToRelative(8.38f)
                horizontalLineToRelative(4.7f)
                curveToRelative(3.01f, 0.0f, 4.78f, -1.79f, 4.78f, -4.14f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.0f, -2.71f, -1.88f, -4.16f, -4.88f, -4.16f)
                horizontalLineToRelative(-4.61f)
                close()
                moveTo(36.55f, 86.75f)
                horizontalLineToRelative(27.43f)
                verticalLineToRelative(4.57f)
                horizontalLineToRelative(-27.43f)
                verticalLineToRelative(-4.57f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
