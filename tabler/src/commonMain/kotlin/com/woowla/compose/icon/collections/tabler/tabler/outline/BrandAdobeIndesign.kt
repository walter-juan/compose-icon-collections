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

public val OutlineGroup.BrandAdobeIndesign: ImageVector
    get() {
        if (_brandAdobeIndesign != null) {
            return _brandAdobeIndesign!!
        }
        _brandAdobeIndesign = Builder(name = "BrandAdobeIndesign", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(14.842f, 11.053f)
                verticalLineToRelative(3.79f)
                curveToRelative(0.0f, 1.044f, -0.49f, 0.946f, -1.42f, 0.946f)
                arcToRelative(2.368f, 2.368f, 0.0f, false, true, 0.0f, -4.736f)
                close()
                moveTo(14.842f, 11.053f)
                verticalLineToRelative(-2.843f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.211f, 8.211f)
                verticalLineToRelative(7.578f)
            }
        }
        .build()
        return _brandAdobeIndesign!!
    }

private var _brandAdobeIndesign: ImageVector? = null
