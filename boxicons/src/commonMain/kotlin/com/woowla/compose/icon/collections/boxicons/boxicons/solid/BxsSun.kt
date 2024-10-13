package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsSun: ImageVector
    get() {
        if (_bxsSun != null) {
            return _bxsSun!!
        }
        _bxsSun = Builder(name = "BxsSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.995f, 12.0f)
                curveToRelative(0.0f, 2.761f, 2.246f, 5.007f, 5.007f, 5.007f)
                reflectiveCurveToRelative(5.007f, -2.246f, 5.007f, -5.007f)
                reflectiveCurveToRelative(-2.246f, -5.007f, -5.007f, -5.007f)
                reflectiveCurveTo(6.995f, 9.239f, 6.995f, 12.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 13.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(5.637f, 19.778f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(16.242f, 6.344f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.122f, 2.122f)
                close()
                moveTo(6.344f, 7.759f)
                lineTo(4.223f, 5.637f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(2.12f, 2.122f)
                close()
                moveTo(19.778f, 18.364f)
                lineTo(18.364f, 19.778f)
                lineTo(16.242f, 17.656f)
                lineTo(17.656f, 16.242f)
                close()
            }
        }
        .build()
        return _bxsSun!!
    }

private var _bxsSun: ImageVector? = null
