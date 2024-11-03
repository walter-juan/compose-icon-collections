package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.TaxiFrontFill: ImageVector
    get() {
        if (_taxiFrontFill != null) {
            return _taxiFrontFill!!
        }
        _taxiFrontFill = Builder(name = "TaxiFrontFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.181f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.52f, 4.515f)
                lineToRelative(-0.792f, 1.848f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.38f, 0.404f)
                curveToRelative(-0.5f, 0.25f, -0.855f, 0.715f, -0.965f, 1.262f)
                lineTo(0.05f, 9.708f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.049f, 0.49f)
                verticalLineToRelative(0.413f)
                curveToRelative(0.0f, 0.814f, 0.39f, 1.543f, 1.0f, 1.997f)
                verticalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.338f)
                curveToRelative(1.292f, 0.048f, 2.745f, 0.088f, 4.0f, 0.088f)
                reflectiveCurveToRelative(2.708f, -0.04f, 4.0f, -0.088f)
                verticalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.892f)
                curveToRelative(0.61f, -0.454f, 1.0f, -1.183f, 1.0f, -1.997f)
                verticalLineToRelative(-0.413f)
                quadToRelative(0.0f, -0.248f, -0.049f, -0.49f)
                lineToRelative(-0.335f, -1.68f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.964f, -1.261f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.381f, -0.404f)
                lineToRelative(-0.792f, -1.848f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.181f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(4.309f, 4.0f)
                horizontalLineToRelative(7.382f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.447f, 0.276f)
                lineToRelative(0.956f, 1.913f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.497f, 0.731f)
                curveToRelative(-0.91f, -0.073f, -3.35f, -0.17f, -4.597f, -0.17f)
                reflectiveCurveToRelative(-3.688f, 0.097f, -4.597f, 0.17f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.497f, -0.731f)
                lineToRelative(0.956f, -1.913f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.309f, 4.0f)
                moveTo(4.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(10.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(-9.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
            }
        }
        .build()
        return _taxiFrontFill!!
    }

private var _taxiFrontFill: ImageVector? = null
