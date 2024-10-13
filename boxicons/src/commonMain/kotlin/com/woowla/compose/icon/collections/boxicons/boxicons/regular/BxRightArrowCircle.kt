package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxRightArrowCircle: ImageVector
    get() {
        if (_bxRightArrowCircle != null) {
            return _bxRightArrowCircle!!
        }
        _bxRightArrowCircle = Builder(name = "BxRightArrowCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 1.993f)
                curveToRelative(-5.514f, 0.001f, -10.0f, 4.487f, -10.0f, 10.001f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.001f, 10.0f)
                curveToRelative(5.513f, 0.0f, 9.999f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.001f, -10.001f)
                close()
                moveTo(12.0f, 19.994f)
                curveToRelative(-4.412f, 0.0f, -8.001f, -3.589f, -8.001f, -8.0f)
                reflectiveCurveToRelative(3.589f, -8.0f, 8.0f, -8.001f)
                curveTo(16.411f, 3.994f, 20.0f, 7.583f, 20.0f, 11.994f)
                curveToRelative(-0.001f, 4.411f, -3.59f, 8.0f, -8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.994f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(16.0f)
                lineToRelative(4.005f, -4.005f)
                lineTo(12.0f, 7.991f)
                close()
            }
        }
        .build()
        return _bxRightArrowCircle!!
    }

private var _bxRightArrowCircle: ImageVector? = null
