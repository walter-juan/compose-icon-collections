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

public val RegularGroup.BxTone: ImageVector
    get() {
        if (_bxTone != null) {
            return _bxTone!!
        }
        _bxTone = Builder(name = "BxTone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(4.069f, 11.0f)
                arcToRelative(7.965f, 7.965f, 0.0f, false, true, 0.52f, -2.0f)
                lineTo(11.0f, 9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(4.589f, 15.0f)
                arcToRelative(7.965f, 7.965f, 0.0f, false, true, -0.52f, -2.0f)
                lineTo(11.0f, 13.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 4.069f)
                lineTo(11.0f, 7.0f)
                lineTo(5.765f, 7.0f)
                arcTo(7.996f, 7.996f, 0.0f, false, true, 11.0f, 4.069f)
                close()
                moveTo(5.765f, 17.0f)
                lineTo(11.0f, 17.0f)
                verticalLineToRelative(2.931f)
                arcTo(7.996f, 7.996f, 0.0f, false, true, 5.765f, 17.0f)
                close()
                moveTo(13.0f, 19.931f)
                lineTo(13.0f, 4.069f)
                curveToRelative(3.939f, 0.495f, 7.0f, 3.858f, 7.0f, 7.931f)
                reflectiveCurveToRelative(-3.061f, 7.436f, -7.0f, 7.931f)
                close()
            }
        }
        .build()
        return _bxTone!!
    }

private var _bxTone: ImageVector? = null
