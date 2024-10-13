package com.woowla.compose.icon.collections.devicons.devicons.maya

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
import com.woowla.compose.icon.collections.devicons.devicons.MayaGroup

public val MayaGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF149B9A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.0f, 121.0f)
                horizontalLineToRelative(28.0f)
                verticalLineTo(7.0f)
                lineToRelative(-37.0f, -0.01f)
                lineToRelative(-24.37f, 58.38f)
                reflectiveCurveToRelative(2.3f, 5.78f, 4.23f, 11.71f)
                curveTo(71.8f, 86.14f, 75.0f, 97.0f, 75.0f, 97.0f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.4f, 0.0f, 0.97f, -0.25f, 2.0f, -2.0f)
                curveToRelative(4.07f, -7.55f, 44.0f, -82.0f, 44.0f, -82.0f)
                reflectiveCurveToRelative(-5.07f, 12.43f, -13.16f, 27.88f)
                curveTo(101.3f, 55.38f, 95.0f, 67.0f, 95.0f, 67.0f)
                verticalLineToRelative(47.0f)
                lineToRelative(3.0f, 7.0f)
                reflectiveCurveToRelative(0.22f, -0.66f, 1.0f, -3.0f)
                arcToRelative(396.84f, 396.84f, 0.0f, false, false, 14.0f, -40.93f)
                curveTo(120.13f, 51.45f, 124.0f, 29.0f, 124.0f, 29.0f)
                arcToRelative(316.85f, 316.85f, 0.0f, false, true, -9.27f, 49.01f)
                arcTo(219.93f, 219.93f, 0.0f, false, true, 99.0f, 118.0f)
                lineToRelative(-1.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF149B9A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.0f, 99.0f)
                horizontalLineTo(54.0f)
                curveToRelative(-0.4f, 0.0f, -0.96f, -0.22f, -2.0f, -2.0f)
                curveToRelative(-4.32f, -7.77f, -47.0f, -85.0f, -47.0f, -85.0f)
                reflectiveCurveToRelative(6.98f, 16.41f, 13.6f, 28.22f)
                arcToRelative(3265.48f, 3265.48f, 0.0f, false, true, 11.27f, 20.3f)
                arcToRelative(260.35f, 260.35f, 0.0f, false, true, -11.9f, 30.6f)
                curveTo(12.87f, 101.96f, 4.0f, 118.0f, 4.0f, 118.0f)
                arcToRelative(276.02f, 276.02f, 0.0f, false, false, 14.44f, -24.53f)
                curveTo(25.68f, 79.61f, 31.0f, 62.0f, 31.0f, 62.0f)
                lineToRelative(1.0f, 2.0f)
                verticalLineToRelative(52.0f)
                curveToRelative(-6.3f, 7.77f, -30.0f, 5.73f, -30.0f, 5.73f)
                verticalLineTo(7.43f)
                lineTo(38.0f, 4.0f)
                lineToRelative(37.0f, 93.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
