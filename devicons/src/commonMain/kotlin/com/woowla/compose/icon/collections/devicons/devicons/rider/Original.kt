package com.woowla.compose.icon.collections.devicons.devicons.rider

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.RiderGroup

public val RiderGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFDD1265), 0.48f to Color(0xFFDD1265), 0.94f
                    to Color(0xFFFDB60D), start = Offset(94.33f,59.37f), end =
                    Offset(20.33f,16.91f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(122.51f, 50.87f)
                lineTo(40.47f, 5.34f)
                lineToRelative(54.93f, 81.61f)
                lineToRelative(11.29f, -7.4f)
                close()
            }
            path(fill = linearGradient(0.14f to Color(0xFF087CFA), 0.48f to Color(0xFFDD1265), 0.96f
                    to Color(0xFF087CFA), start = Offset(50.33f,12.76f), end =
                    Offset(79.66f,93.76f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(89.78f, 32.31f)
                lineTo(79.51f, 7.18f)
                lineTo(56.77f, 29.56f)
                lineToRelative(9.3f, 81.21f)
                lineTo(88.1f, 122.37f)
                lineToRelative(34.41f, -20.1f)
                close()
            }
            path(fill = linearGradient(0.28f to Color(0xFFDD1265), 0.97f to Color(0xFFFDB60D), start
                    = Offset(28.36f,15.26f), end = Offset(50.02f,92.26f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.47f, 5.34f)
                lineTo(5.49f, 28.9f)
                lineToRelative(13.01f, 80.37f)
                lineToRelative(33.55f, 12.9f)
                lineToRelative(43.36f, -35.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.43f, 27.43f)
                horizontalLineToRelative(73.14f)
                verticalLineToRelative(73.14f)
                horizontalLineTo(27.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.55f, 86.75f)
                horizontalLineToRelative(27.43f)
                verticalLineToRelative(4.57f)
                lineTo(36.55f, 91.32f)
                close()
                moveTo(36.57f, 36.47f)
                horizontalLineToRelative(12.56f)
                arcToRelative(10.97f, 10.97f, 0.0f, false, true, 8.01f, 2.79f)
                arcToRelative(8.63f, 8.63f, 0.0f, false, true, 2.37f, 6.29f)
                verticalLineToRelative(0.07f)
                arcToRelative(8.53f, 8.53f, 0.0f, false, true, -5.9f, 8.53f)
                lineToRelative(6.73f, 9.83f)
                horizontalLineToRelative(-7.08f)
                lineToRelative(-5.89f, -8.8f)
                horizontalLineToRelative(-4.69f)
                verticalLineToRelative(8.8f)
                horizontalLineToRelative(-6.09f)
                close()
                moveTo(48.76f, 49.88f)
                curveToRelative(2.95f, 0.0f, 4.64f, -1.57f, 4.64f, -3.89f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.0f, -2.6f, -1.8f, -3.94f, -4.75f, -3.94f)
                horizontalLineToRelative(-5.99f)
                verticalLineToRelative(7.9f)
                close()
                moveTo(64.52f, 36.47f)
                horizontalLineToRelative(10.73f)
                curveToRelative(8.64f, 0.0f, 14.63f, 5.94f, 14.63f, 13.68f)
                verticalLineToRelative(0.09f)
                curveToRelative(0.0f, 7.74f, -5.97f, 13.75f, -14.63f, 13.75f)
                lineTo(64.52f, 63.99f)
                close()
                moveTo(70.62f, 41.94f)
                verticalLineToRelative(16.58f)
                horizontalLineToRelative(4.68f)
                arcToRelative(7.84f, 7.84f, 0.0f, false, false, 8.29f, -8.22f)
                verticalLineToRelative(-0.07f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, -8.29f, -8.3f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
