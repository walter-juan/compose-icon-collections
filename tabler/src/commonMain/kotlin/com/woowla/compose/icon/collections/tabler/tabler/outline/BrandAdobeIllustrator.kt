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

public val OutlineGroup.BrandAdobeIllustrator: ImageVector
    get() {
        if (_brandAdobeIllustrator != null) {
            return _brandAdobeIllustrator!!
        }
        _brandAdobeIllustrator = Builder(name = "BrandAdobeIllustrator", defaultWidth = 24.0.dp,
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
                moveTo(12.947f, 15.79f)
                lineToRelative(-0.82f, -2.653f)
                moveToRelative(-4.864f, 2.652f)
                lineToRelative(0.82f, -2.652f)
                moveToRelative(0.0f, 0.0f)
                lineToRelative(0.687f, -2.218f)
                curveToRelative(0.558f, -1.806f, 0.838f, -2.708f, 1.335f, -2.708f)
                curveToRelative(0.498f, 0.0f, 0.777f, 0.902f, 1.336f, 2.708f)
                lineToRelative(0.686f, 2.218f)
                moveToRelative(-4.043f, 0.0f)
                horizontalLineToRelative(4.043f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.789f, 15.789f)
                verticalLineToRelative(-4.736f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.789f, 8.684f)
                verticalLineToRelative(-0.473f)
            }
        }
        .build()
        return _brandAdobeIllustrator!!
    }

private var _brandAdobeIllustrator: ImageVector? = null
