package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Robot: ImageVector
    get() {
        if (_robot != null) {
            return _robot!!
        }
        _robot = Builder(name = "Robot", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveTo(3.0f, 8.062f)
                curveTo(3.0f, 6.76f, 4.235f, 5.765f, 5.53f, 5.886f)
                arcToRelative(26.6f, 26.6f, 0.0f, false, false, 4.94f, 0.0f)
                curveTo(11.765f, 5.765f, 13.0f, 6.76f, 13.0f, 8.062f)
                verticalLineToRelative(1.157f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, -0.765f, 0.935f)
                curveToRelative(-0.845f, 0.147f, -2.34f, 0.346f, -4.235f, 0.346f)
                reflectiveCurveToRelative(-3.39f, -0.2f, -4.235f, -0.346f)
                arcTo(0.93f, 0.93f, 0.0f, false, true, 3.0f, 9.219f)
                close()
                moveTo(7.542f, 7.235f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.217f, 0.068f)
                lineToRelative(-0.92f, 0.9f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, -1.871f, -0.183f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.068f, 0.495f)
                curveToRelative(0.55f, 0.076f, 1.232f, 0.149f, 2.02f, 0.193f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.189f, -0.071f)
                lineToRelative(0.754f, -0.736f)
                lineToRelative(0.847f, 1.71f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.404f, 0.062f)
                lineToRelative(0.932f, -0.97f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, 1.922f, -0.188f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.068f, -0.495f)
                curveToRelative(-0.538f, 0.074f, -1.207f, 0.145f, -1.98f, 0.189f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.166f, 0.076f)
                lineToRelative(-0.754f, 0.785f)
                lineToRelative(-0.842f, -1.7f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.182f, -0.135f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 1.866f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 0.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-2.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 1.0f, 7.5f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                verticalLineToRelative(-0.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 10.5f, 3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 7.5f)
                verticalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 4.0f)
                horizontalLineToRelative(5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 14.0f, 7.5f)
            }
        }
        .build()
        return _robot!!
    }

private var _robot: ImageVector? = null
