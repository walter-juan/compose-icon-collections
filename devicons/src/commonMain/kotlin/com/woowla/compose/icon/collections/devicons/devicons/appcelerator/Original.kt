package com.woowla.compose.icon.collections.devicons.devicons.appcelerator

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AppceleratorGroup

public val AppceleratorGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFAC162C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(125.48f, 111.87f)
                lineTo(67.72f, 11.83f)
                arcToRelative(4.29f, 4.29f, 0.0f, false, false, -7.43f, 0.0f)
                lineTo(2.52f, 111.87f)
                curveToRelative(-0.77f, 1.33f, -0.77f, 2.81f, 0.0f, 4.14f)
                curveToRelative(0.77f, 1.33f, 2.18f, 1.99f, 3.72f, 1.99f)
                horizontalLineToRelative(115.52f)
                curveToRelative(1.53f, 0.0f, 2.94f, -0.66f, 3.71f, -1.99f)
                curveToRelative(0.77f, -1.33f, 0.77f, -2.81f, 0.0f, -4.14f)
                close()
                moveTo(88.73f, 103.8f)
                lineToRelative(0.16f, -4.34f)
                lineToRelative(-16.67f, 2.94f)
                lineToRelative(-0.76f, -0.7f)
                lineToRelative(0.22f, -5.71f)
                horizontalLineToRelative(-0.44f)
                reflectiveCurveToRelative(-4.57f, 7.55f, -14.68f, 7.55f)
                curveToRelative(-7.5f, 0.0f, -14.57f, -3.0f, -14.57f, -15.18f)
                curveTo(41.99f, 76.08f, 51.23f, 72.0f, 60.91f, 72.0f)
                lineTo(71.0f, 72.0f)
                verticalLineToRelative(-5.05f)
                curveToRelative(0.0f, -4.89f, -3.25f, -7.72f, -9.34f, -7.72f)
                curveToRelative(-6.85f, 0.0f, -15.01f, 1.09f, -15.01f, 1.09f)
                lineTo(46.0f, 59.55f)
                verticalLineToRelative(-8.27f)
                reflectiveCurveToRelative(8.75f, -1.09f, 17.78f, -1.09f)
                curveTo(72.05f, 50.2f, 82.0f, 52.38f, 82.0f, 64.56f)
                verticalLineToRelative(28.03f)
                lineToRelative(5.63f, -1.06f)
                lineToRelative(-1.55f, -4.06f)
                lineToRelative(13.91f, 6.09f)
                lineToRelative(-11.25f, 10.23f)
                close()
                moveTo(52.53f, 87.56f)
                curveToRelative(0.0f, 5.66f, 3.9f, 6.88f, 7.71f, 6.88f)
                curveToRelative(3.59f, 0.0f, 7.76f, -0.95f, 10.76f, -5.41f)
                lineTo(71.0f, 80.0f)
                horizontalLineToRelative(-7.26f)
                curveToRelative(-7.4f, 0.0f, -11.2f, 1.69f, -11.2f, 7.56f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
