package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Wxt: ImageVector
    get() {
        if (_wxt != null) {
            return _wxt!!
        }
        _wxt = Builder(name = "Wxt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.18f, 0.0f)
                curveToRelative(-2.081f, 0.0f, -3.807f, 1.608f, -4.0f, 3.64f)
                horizontalLineTo(4.019f)
                arcTo(4.033f, 4.033f, 0.0f, false, false, 0.0f, 7.66f)
                verticalLineToRelative(4.017f)
                horizontalLineToRelative(1.498f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 2.143f, 2.144f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, -2.143f, 2.143f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(8.036f)
                verticalLineToRelative(-1.498f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 2.144f, -2.143f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 2.143f, 2.143f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(4.018f)
                arcToRelative(4.03f, 4.03f, 0.0f, false, false, 4.018f, -4.018f)
                verticalLineToRelative(-2.163f)
                curveTo(22.392f, 17.627f, 24.0f, 15.901f, 24.0f, 13.821f)
                reflectiveCurveToRelative(-1.608f, -3.807f, -3.64f, -4.0f)
                verticalLineTo(7.66f)
                arcToRelative(4.03f, 4.03f, 0.0f, false, false, -4.019f, -4.018f)
                horizontalLineToRelative(-2.162f)
                curveTo(13.986f, 1.608f, 12.26f, 0.0f, 10.179f, 0.0f)
                moveToRelative(0.0f, 1.875f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 2.143f, 2.143f)
                verticalLineToRelative(1.498f)
                horizontalLineToRelative(4.018f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 2.143f, 2.143f)
                verticalLineToRelative(4.018f)
                horizontalLineToRelative(1.498f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 2.143f, 2.144f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, -2.143f, 2.143f)
                horizontalLineToRelative(-1.498f)
                verticalLineToRelative(4.018f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, -2.143f, 2.143f)
                horizontalLineToRelative(-2.162f)
                curveToRelative(-0.193f, -2.033f, -1.919f, -3.64f, -4.0f, -3.64f)
                reflectiveCurveToRelative(-3.806f, 1.607f, -3.998f, 3.64f)
                horizontalLineTo(1.875f)
                verticalLineTo(17.82f)
                curveToRelative(2.033f, -0.192f, 3.64f, -1.918f, 3.64f, -3.998f)
                reflectiveCurveToRelative(-1.607f, -3.807f, -3.64f, -4.0f)
                verticalLineTo(7.66f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 2.143f, -2.143f)
                horizontalLineToRelative(4.018f)
                verticalLineTo(4.018f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 2.144f, -2.143f)
            }
        }
        .build()
        return _wxt!!
    }

private var _wxt: ImageVector? = null
