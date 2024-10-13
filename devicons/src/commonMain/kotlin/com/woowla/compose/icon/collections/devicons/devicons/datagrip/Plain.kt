package com.woowla.compose.icon.collections.devicons.devicons.datagrip

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.DatagripGroup

public val DatagripGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF21d789)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(73.16f, 5.48f)
                lineToRelative(-11.69f, 9.7f)
                lineToRelative(-55.98f, -8.87f)
                lineTo(5.48f, 59.5f)
                lineTo(26.93f, 76.59f)
                lineTo(26.93f, 26.78f)
                horizontalLineToRelative(74.14f)
                verticalLineToRelative(65.57f)
                lineToRelative(5.97f, 2.05f)
                lineToRelative(8.01f, -70.73f)
                lineTo(73.16f, 5.48f)
                close()
                moveTo(115.05f, 23.68f)
                lineTo(108.73f, 79.61f)
                lineTo(122.52f, 71.58f)
                lineTo(115.05f, 23.68f)
                close()
                moveTo(27.93f, 27.78f)
                verticalLineToRelative(72.14f)
                horizontalLineToRelative(72.14f)
                lineTo(100.07f, 27.78f)
                lineTo(27.93f, 27.78f)
                close()
                moveTo(79.79f, 36.26f)
                arcToRelative(16.61f, 16.61f, 0.0f, false, true, 11.9f, 4.16f)
                lineToRelative(-4.19f, 5.06f)
                arcToRelative(11.19f, 11.19f, 0.0f, false, false, -7.91f, -3.07f)
                curveToRelative(-4.88f, 0.0f, -8.7f, 4.29f, -8.7f, 9.44f)
                verticalLineToRelative(0.08f)
                curveToRelative(0.0f, 5.53f, 3.82f, 9.61f, 9.18f, 9.61f)
                arcToRelative(10.65f, 10.65f, 0.0f, false, false, 6.29f, -1.81f)
                verticalLineToRelative(-4.34f)
                lineTo(79.64f, 55.39f)
                lineTo(79.64f, 49.64f)
                horizontalLineToRelative(13.15f)
                verticalLineToRelative(13.15f)
                arcToRelative(19.63f, 19.63f, 0.0f, false, true, -12.94f, 4.8f)
                curveToRelative(-9.43f, 0.0f, -15.92f, -6.64f, -15.92f, -15.58f)
                verticalLineToRelative(-0.09f)
                arcToRelative(15.55f, 15.55f, 0.0f, false, true, 15.85f, -15.66f)
                close()
                moveTo(34.85f, 36.79f)
                horizontalLineToRelative(11.81f)
                curveToRelative(9.51f, 0.0f, 16.09f, 6.53f, 16.09f, 15.06f)
                verticalLineToRelative(0.08f)
                curveToRelative(0.0f, 8.53f, -6.59f, 15.14f, -16.09f, 15.14f)
                lineTo(34.85f, 67.07f)
                lineTo(34.85f, 36.79f)
                close()
                moveTo(41.51f, 42.8f)
                verticalLineToRelative(18.28f)
                horizontalLineToRelative(5.16f)
                arcToRelative(8.63f, 8.63f, 0.0f, false, false, 9.12f, -9.04f)
                verticalLineToRelative(-0.11f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -9.12f, -9.13f)
                horizontalLineToRelative(-5.16f)
                close()
                moveTo(19.56f, 70.72f)
                lineTo(6.5f, 109.98f)
                lineToRelative(78.07f, 12.53f)
                lineToRelative(-27.1f, -21.59f)
                lineTo(26.93f, 100.93f)
                lineTo(26.93f, 76.59f)
                lineToRelative(-7.38f, -5.88f)
                close()
                moveTo(84.57f, 122.52f)
                lineTo(90.54f, 100.93f)
                lineTo(57.47f, 100.93f)
                lineToRelative(27.09f, 21.59f)
                close()
                moveTo(34.16f, 86.7f)
                horizontalLineToRelative(27.43f)
                verticalLineToRelative(4.57f)
                horizontalLineToRelative(-27.43f)
                lineTo(34.16f, 86.7f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
