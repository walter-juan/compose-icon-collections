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

public val Simpleicons.Linuxmint: ImageVector
    get() {
        if (_linuxmint != null) {
            return _linuxmint!!
        }
        _linuxmint = Builder(name = "Linuxmint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.438f, 5.906f)
                verticalLineToRelative(8.438f)
                curveToRelative(0.0f, 2.06f, 1.69f, 3.75f, 3.75f, 3.75f)
                horizontalLineToRelative(5.625f)
                curveToRelative(2.06f, 0.0f, 3.75f, -1.69f, 3.75f, -3.75f)
                verticalLineTo(9.656f)
                arcToRelative(2.827f, 2.827f, 0.0f, false, false, -2.813f, -2.812f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -1.875f, 0.737f)
                arcTo(2.8f, 2.8f, 0.0f, false, false, 12.0f, 6.844f)
                arcToRelative(2.827f, 2.827f, 0.0f, false, false, -2.812f, 2.812f)
                verticalLineToRelative(4.688f)
                horizontalLineToRelative(1.875f)
                verticalLineTo(9.656f)
                curveToRelative(0.0f, -0.529f, 0.408f, -0.937f, 0.937f, -0.937f)
                reflectiveCurveToRelative(0.938f, 0.408f, 0.938f, 0.937f)
                verticalLineToRelative(4.688f)
                horizontalLineToRelative(1.875f)
                verticalLineTo(9.656f)
                curveToRelative(0.0f, -0.529f, 0.408f, -0.937f, 0.937f, -0.937f)
                reflectiveCurveToRelative(0.938f, 0.408f, 0.938f, 0.937f)
                verticalLineToRelative(4.688f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, -1.875f, 1.875f)
                horizontalLineTo(9.188f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, -1.875f, -1.875f)
                verticalLineTo(5.906f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.384f, 0.0f, 0.0f, 5.384f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.384f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.384f, 12.0f, -12.0f)
                reflectiveCurveTo(18.616f, 0.0f, 12.0f, 0.0f)
                moveToRelative(0.0f, 1.875f)
                arcTo(10.11f, 10.11f, 0.0f, false, true, 22.125f, 12.0f)
                arcTo(10.11f, 10.11f, 0.0f, false, true, 12.0f, 22.125f)
                arcTo(10.11f, 10.11f, 0.0f, false, true, 1.875f, 12.0f)
                arcTo(10.11f, 10.11f, 0.0f, false, true, 12.0f, 1.875f)
            }
        }
        .build()
        return _linuxmint!!
    }

private var _linuxmint: ImageVector? = null
