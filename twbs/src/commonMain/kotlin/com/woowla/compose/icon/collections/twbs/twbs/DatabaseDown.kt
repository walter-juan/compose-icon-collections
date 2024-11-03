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

public val Twbs.DatabaseDown: ImageVector
    get() {
        if (_databaseDown != null) {
            return _databaseDown!!
        }
        _databaseDown = Builder(name = "DatabaseDown", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.354f, 5.854f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineToRelative(-0.646f, 0.647f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(2.793f)
                lineToRelative(-0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.708f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.096f, 6.223f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 13.0f, 5.698f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, 0.289f, -0.213f, 0.654f, -0.753f, 1.007f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 1.753f, 0.25f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.007f, -0.875f, -1.755f, -1.904f, -2.223f)
                curveTo(11.022f, 1.289f, 9.573f, 1.0f, 8.0f, 1.0f)
                reflectiveCurveToRelative(-3.022f, 0.289f, -4.096f, 0.777f)
                curveTo(2.875f, 2.245f, 2.0f, 2.993f, 2.0f, 4.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 15.71f, 6.427f, 16.0f, 8.0f, 16.0f)
                curveToRelative(0.536f, 0.0f, 1.058f, -0.034f, 1.555f, -0.097f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.813f, -0.927f)
                quadTo(8.378f, 15.0f, 8.0f, 15.0f)
                curveToRelative(-1.464f, 0.0f, -2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 13.875f, 3.0f, 13.373f, 3.0f, 13.0f)
                verticalLineToRelative(-1.302f)
                curveToRelative(0.271f, 0.202f, 0.58f, 0.378f, 0.904f, 0.525f)
                curveTo(4.978f, 12.71f, 6.427f, 13.0f, 8.0f, 13.0f)
                horizontalLineToRelative(0.027f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.464f, 0.0f, -2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 10.875f, 3.0f, 10.373f, 3.0f, 10.0f)
                verticalLineTo(8.698f)
                curveToRelative(0.271f, 0.202f, 0.58f, 0.378f, 0.904f, 0.525f)
                curveTo(4.978f, 9.71f, 6.427f, 10.0f, 8.0f, 10.0f)
                quadToRelative(0.393f, 0.0f, 0.774f, -0.024f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 1.102f, -1.132f)
                curveTo(9.298f, 8.944f, 8.666f, 9.0f, 8.0f, 9.0f)
                curveToRelative(-1.464f, 0.0f, -2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 7.875f, 3.0f, 7.373f, 3.0f, 7.0f)
                verticalLineTo(5.698f)
                curveToRelative(0.271f, 0.202f, 0.58f, 0.378f, 0.904f, 0.525f)
                curveTo(4.978f, 6.711f, 6.427f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                moveTo(3.0f, 4.0f)
                curveToRelative(0.0f, -0.374f, 0.356f, -0.875f, 1.318f, -1.313f)
                curveTo(5.234f, 2.271f, 6.536f, 2.0f, 8.0f, 2.0f)
                reflectiveCurveToRelative(2.766f, 0.27f, 3.682f, 0.687f)
                curveTo(12.644f, 3.125f, 13.0f, 3.627f, 13.0f, 4.0f)
                curveToRelative(0.0f, 0.374f, -0.356f, 0.875f, -1.318f, 1.313f)
                curveTo(10.766f, 5.729f, 9.464f, 6.0f, 8.0f, 6.0f)
                reflectiveCurveToRelative(-2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 4.875f, 3.0f, 4.373f, 3.0f, 4.0f)
            }
        }
        .build()
        return _databaseDown!!
    }

private var _databaseDown: ImageVector? = null
