package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.BrandAdobeXd: ImageVector
    get() {
        if (_brandAdobeXd != null) {
            return _brandAdobeXd!!
        }
        _brandAdobeXd = Builder(name = "BrandAdobeXd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -4.243f, 0.0f, -6.364f, 1.318f, -7.682f)
                reflectiveCurveToRelative(3.44f, -1.318f, 7.682f, -1.318f)
                reflectiveCurveToRelative(6.364f, 0.0f, 7.682f, 1.318f)
                reflectiveCurveToRelative(1.318f, 3.44f, 1.318f, 7.682f)
                reflectiveCurveToRelative(0.0f, 6.364f, -1.318f, 7.682f)
                reflectiveCurveToRelative(-3.44f, 1.318f, -7.682f, 1.318f)
                reflectiveCurveToRelative(-6.364f, 0.0f, -7.682f, -1.318f)
                reflectiveCurveToRelative(-1.318f, -3.44f, -1.318f, -7.682f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                lineToRelative(5.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 16.0f)
                lineToRelative(5.0f, -8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, -0.517f, 0.997f, -1.5f, 0.997f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.497f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                lineToRelative(1.5f, 0.0f)
                verticalLineToRelative(-3.0f)
            }
        }
        .build()
        return _brandAdobeXd!!
    }

private var _brandAdobeXd: ImageVector? = null
