package com.woowla.compose.icon.collections.devicons.devicons.polygon

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
import com.woowla.compose.icon.collections.devicons.devicons.PolygonGroup

public val PolygonGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, 28.65f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.65f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveTo(0.0f, 99.35f, 0.0f, 64.0f)
                reflectiveCurveTo(28.65f, 0.0f, 64.0f, 0.0f)
                close()
                moveTo(64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF7950DD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.9f, 49.24f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, false, -5.42f, 0.0f)
                lineToRelative(-12.21f, 7.22f)
                lineToRelative(-8.53f, 4.74f)
                lineToRelative(-12.21f, 7.23f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, -5.42f, 0.0f)
                lineToRelative(-9.71f, -5.65f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, -2.71f, -4.52f)
                lineTo(29.68f, 46.99f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, true, 2.71f, -4.52f)
                lineToRelative(9.71f, -5.42f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, true, 5.42f, 0.0f)
                lineToRelative(9.71f, 5.42f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, 2.71f, 4.52f)
                verticalLineToRelative(7.22f)
                lineToRelative(8.33f, -4.97f)
                verticalLineToRelative(-7.0f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, false, -2.66f, -4.52f)
                lineToRelative(-17.86f, -10.38f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, false, -5.42f, 0.0f)
                lineTo(24.27f, 37.73f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -2.93f, 4.52f)
                verticalLineToRelative(20.99f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, 2.71f, 4.5f)
                lineToRelative(18.06f, 10.41f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, false, 5.42f, 0.0f)
                lineToRelative(12.21f, -7.0f)
                lineToRelative(8.35f, -4.97f)
                lineToRelative(12.17f, -6.98f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, 5.42f, 0.0f)
                lineToRelative(9.71f, 5.42f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, 2.71f, 4.52f)
                verticalLineToRelative(11.06f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, true, -2.71f, 4.52f)
                lineToRelative(-9.71f, 5.64f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, true, -5.42f, 0.0f)
                lineToRelative(-9.71f, -5.42f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, -2.71f, -4.51f)
                verticalLineToRelative(-7.25f)
                lineToRelative(-8.11f, 4.74f)
                verticalLineToRelative(7.22f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, 2.71f, 4.52f)
                lineTo(80.5f, 100.03f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 5.42f, 0.0f)
                lineToRelative(18.06f, -10.38f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, false, 2.69f, -4.51f)
                verticalLineToRelative(-21.0f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, false, -2.71f, -4.52f)
                close()
                moveTo(85.9f, 49.24f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
