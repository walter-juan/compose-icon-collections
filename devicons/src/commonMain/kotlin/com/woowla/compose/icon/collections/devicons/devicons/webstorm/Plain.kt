package com.woowla.compose.icon.collections.devicons.devicons.webstorm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.WebstormGroup

public val WebstormGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF07c3f2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(80.01f, 5.48f)
                lineToRelative(-4.26f, 4.1f)
                lineToRelative(-5.39f, -2.07f)
                lineToRelative(-17.07f, 9.21f)
                lineToRelative(-18.63f, -11.07f)
                lineTo(5.48f, 17.75f)
                lineToRelative(15.78f, 93.5f)
                lineToRelative(64.71f, 11.27f)
                lineToRelative(4.09f, -20.79f)
                lineToRelative(1.11f, -0.66f)
                lineTo(26.93f, 101.07f)
                lineTo(26.93f, 26.93f)
                horizontalLineToRelative(74.14f)
                verticalLineToRelative(68.26f)
                lineToRelative(21.45f, -12.72f)
                lineToRelative(-12.8f, -24.0f)
                lineToRelative(12.8f, -13.35f)
                lineToRelative(-9.4f, -23.23f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-5.7f, -14.08f)
                lineToRelative(-27.4f, -2.33f)
                close()
                moveTo(27.93f, 27.93f)
                verticalLineToRelative(72.14f)
                horizontalLineToRelative(72.14f)
                lineTo(100.07f, 27.93f)
                lineTo(27.93f, 27.93f)
                close()
                moveTo(80.77f, 36.17f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, true, 10.22f, 3.5f)
                lineToRelative(-3.14f, 4.56f)
                arcToRelative(12.88f, 12.88f, 0.0f, false, false, -7.16f, -2.71f)
                curveToRelative(-2.32f, 0.0f, -3.54f, 1.06f, -3.54f, 2.44f)
                verticalLineToRelative(0.09f)
                curveToRelative(0.0f, 1.8f, 1.22f, 2.44f, 5.94f, 3.66f)
                curveToRelative(5.58f, 1.46f, 8.73f, 3.46f, 8.73f, 8.26f)
                verticalLineToRelative(0.07f)
                curveToRelative(0.0f, 5.46f, -4.17f, 8.53f, -10.11f, 8.53f)
                arcToRelative(17.48f, 17.48f, 0.0f, false, true, -11.66f, -4.4f)
                verticalLineToRelative(-0.11f)
                lineToRelative(3.57f, -4.28f)
                arcToRelative(12.63f, 12.63f, 0.0f, false, false, 8.22f, 3.34f)
                curveToRelative(2.44f, 0.0f, 3.97f, -0.98f, 3.97f, -2.6f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.0f, -1.53f, -0.95f, -2.32f, -5.55f, -3.5f)
                curveToRelative(-5.55f, -1.41f, -9.12f, -2.95f, -9.12f, -8.41f)
                verticalLineToRelative(-0.09f)
                curveToRelative(0.0f, -4.98f, 4.01f, -8.29f, 9.63f, -8.29f)
                close()
                moveTo(49.12f, 36.53f)
                horizontalLineToRelative(4.64f)
                lineToRelative(4.67f, 16.0f)
                lineToRelative(4.08f, -16.0f)
                horizontalLineToRelative(6.39f)
                lineToRelative(-7.83f, 27.44f)
                horizontalLineToRelative(-5.21f)
                lineTo(51.43f, 48.09f)
                lineToRelative(-4.49f, 15.89f)
                horizontalLineToRelative(-5.14f)
                lineToRelative(-7.84f, -27.44f)
                horizontalLineToRelative(6.4f)
                lineToRelative(4.07f, 16.0f)
                lineToRelative(4.68f, -16.01f)
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
