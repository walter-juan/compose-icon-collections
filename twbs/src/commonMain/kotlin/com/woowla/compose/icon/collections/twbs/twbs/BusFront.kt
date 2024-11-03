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

public val Twbs.BusFront: ImageVector
    get() {
        if (_busFront != null) {
            return _busFront!!
        }
        _busFront = Builder(name = "BusFront", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(-6.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                close()
                moveTo(8.0f, 4.0f)
                curveToRelative(-1.876f, 0.0f, -3.426f, 0.109f, -4.552f, 0.226f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 4.723f)
                verticalLineToRelative(3.554f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.448f, 0.497f)
                curveTo(4.574f, 8.891f, 6.124f, 9.0f, 8.0f, 9.0f)
                reflectiveCurveToRelative(3.426f, -0.109f, 4.552f, -0.226f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.0f, 8.277f)
                lineTo(13.0f, 4.723f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.448f, -0.497f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 8.0f, 4.0f)
                moveToRelative(0.0f, -1.0f)
                curveToRelative(-1.837f, 0.0f, -3.353f, 0.107f, -4.448f, 0.22f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.104f, -0.994f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 8.0f, 2.0f)
                curveToRelative(1.876f, 0.0f, 3.426f, 0.109f, 4.552f, 0.226f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.104f, 0.994f)
                arcTo(43.0f, 43.0f, 0.0f, false, false, 8.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                verticalLineTo(2.64f)
                curveToRelative(0.0f, -1.188f, -0.845f, -2.232f, -2.064f, -2.372f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 8.0f, 0.0f)
                curveTo(5.9f, 0.0f, 4.208f, 0.136f, 3.064f, 0.268f)
                curveTo(1.845f, 0.408f, 1.0f, 1.452f, 1.0f, 2.64f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.818f, 0.393f, 1.544f, 1.0f, 2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.607f, -0.456f, 1.0f, -1.182f, 1.0f, -2.0f)
                close()
                moveTo(8.0f, 1.0f)
                curveToRelative(2.056f, 0.0f, 3.71f, 0.134f, 4.822f, 0.261f)
                curveToRelative(0.676f, 0.078f, 1.178f, 0.66f, 1.178f, 1.379f)
                verticalLineToRelative(8.86f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 11.5f)
                verticalLineTo(2.64f)
                curveToRelative(0.0f, -0.72f, 0.502f, -1.301f, 1.178f, -1.379f)
                arcTo(43.0f, 43.0f, 0.0f, false, true, 8.0f, 1.0f)
            }
        }
        .build()
        return _busFront!!
    }

private var _busFront: ImageVector? = null
