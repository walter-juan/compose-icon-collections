package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxSun: ImageVector
    get() {
        if (_bxSun != null) {
            return _bxSun!!
        }
        _bxSun = Builder(name = "BxSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.993f, 12.0f)
                curveToRelative(0.0f, 2.761f, 2.246f, 5.007f, 5.007f, 5.007f)
                reflectiveCurveToRelative(5.007f, -2.246f, 5.007f, -5.007f)
                reflectiveCurveTo(14.761f, 6.993f, 12.0f, 6.993f)
                reflectiveCurveTo(6.993f, 9.239f, 6.993f, 12.0f)
                close()
                moveTo(12.0f, 8.993f)
                curveToRelative(1.658f, 0.0f, 3.007f, 1.349f, 3.007f, 3.007f)
                reflectiveCurveTo(13.658f, 15.007f, 12.0f, 15.007f)
                reflectiveCurveTo(8.993f, 13.658f, 8.993f, 12.0f)
                reflectiveCurveTo(10.342f, 8.993f, 12.0f, 8.993f)
                close()
                moveTo(10.998f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(10.998f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(1.998f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(18.998f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(4.219f, 18.363f)
                lineToRelative(2.12f, -2.122f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(-2.12f, 2.122f)
                close()
                moveTo(16.24f, 6.344f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.122f, 2.122f)
                close()
                moveTo(6.342f, 7.759f)
                lineTo(4.22f, 5.637f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(2.12f, 2.122f)
                close()
                moveTo(19.776f, 18.364f)
                lineTo(18.362f, 19.778f)
                lineTo(16.24f, 17.656f)
                lineTo(17.654f, 16.242f)
                close()
            }
        }
        .build()
        return _bxSun!!
    }

private var _bxSun: ImageVector? = null
