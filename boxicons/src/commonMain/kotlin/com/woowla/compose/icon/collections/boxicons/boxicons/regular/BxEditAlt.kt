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

public val RegularGroup.BxEditAlt: ImageVector
    get() {
        if (_bxEditAlt != null) {
            return _bxEditAlt!!
        }
        _bxEditAlt = Builder(name = "BxEditAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.045f, 7.401f)
                curveToRelative(0.378f, -0.378f, 0.586f, -0.88f, 0.586f, -1.414f)
                reflectiveCurveToRelative(-0.208f, -1.036f, -0.586f, -1.414f)
                lineToRelative(-1.586f, -1.586f)
                curveToRelative(-0.378f, -0.378f, -0.88f, -0.586f, -1.414f, -0.586f)
                reflectiveCurveToRelative(-1.036f, 0.208f, -1.413f, 0.585f)
                lineTo(4.0f, 13.585f)
                lineTo(4.0f, 18.0f)
                horizontalLineToRelative(4.413f)
                lineTo(19.045f, 7.401f)
                close()
                moveTo(16.045f, 4.401f)
                lineTo(17.632f, 5.986f)
                lineTo(16.042f, 7.57f)
                lineTo(14.456f, 5.985f)
                lineTo(16.045f, 4.401f)
                close()
                moveTo(6.0f, 16.0f)
                verticalLineToRelative(-1.585f)
                lineToRelative(7.04f, -7.018f)
                lineToRelative(1.586f, 1.586f)
                lineTo(7.587f, 16.0f)
                lineTo(6.0f, 16.0f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 22.0f)
                close()
            }
        }
        .build()
        return _bxEditAlt!!
    }

private var _bxEditAlt: ImageVector? = null
