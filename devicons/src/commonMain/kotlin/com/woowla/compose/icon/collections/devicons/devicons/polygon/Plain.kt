package com.woowla.compose.icon.collections.devicons.devicons.polygon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PolygonGroup

public val PolygonGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.65f, 0.0f, 0.0f, 28.65f, 0.0f, 64.0f)
                reflectiveCurveToRelative(28.65f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.65f, 64.0f, -64.0f)
                reflectiveCurveTo(99.35f, 0.0f, 64.0f, 0.0f)
                close()
                moveTo(44.1f, 26.74f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, true, 3.65f, 0.6f)
                lineToRelative(17.86f, 10.38f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, true, 2.66f, 4.52f)
                verticalLineToRelative(6.99f)
                lineToRelative(-8.33f, 4.97f)
                verticalLineTo(46.99f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, false, -2.71f, -4.52f)
                lineTo(47.52f, 37.05f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, false, -5.42f, 0.0f)
                lineToRelative(-9.71f, 5.42f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, -2.71f, 4.52f)
                verticalLineToRelative(11.27f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, false, 2.71f, 4.52f)
                lineToRelative(9.71f, 5.65f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, false, 5.42f, 0.0f)
                lineToRelative(12.21f, -7.23f)
                lineToRelative(8.53f, -4.74f)
                lineToRelative(12.21f, -7.22f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, 5.42f, 0.0f)
                lineToRelative(18.06f, 10.38f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, true, 2.71f, 4.52f)
                verticalLineToRelative(21.0f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, -2.69f, 4.51f)
                lineTo(85.92f, 100.03f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -5.42f, 0.0f)
                lineTo(62.44f, 89.65f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, true, -2.71f, -4.52f)
                verticalLineToRelative(-7.22f)
                lineToRelative(8.11f, -4.74f)
                verticalLineToRelative(7.25f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, false, 2.71f, 4.51f)
                lineToRelative(9.71f, 5.42f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, false, 5.42f, 0.0f)
                lineToRelative(9.71f, -5.64f)
                arcTo(4.97f, 4.97f, 0.0f, false, false, 98.09f, 80.2f)
                verticalLineTo(69.14f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, false, -2.71f, -4.52f)
                lineTo(85.68f, 59.2f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, false, -5.42f, 0.0f)
                lineToRelative(-12.17f, 6.98f)
                lineToRelative(-8.35f, 4.97f)
                lineToRelative(-12.21f, 7.0f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, -5.42f, 0.0f)
                lineTo(24.04f, 67.73f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, true, -2.71f, -4.5f)
                verticalLineTo(42.25f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, true, 2.93f, -4.52f)
                lineToRelative(18.06f, -10.38f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, true, 1.77f, -0.6f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
