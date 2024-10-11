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

public val OutlineGroup.BrandAdobePremier: ImageVector
    get() {
        if (_brandAdobePremier != null) {
            return _brandAdobePremier!!
        }
        _brandAdobePremier = Builder(name = "BrandAdobePremier", defaultWidth = 24.0.dp,
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
                moveTo(7.263f, 15.79f)
                verticalLineToRelative(-3.79f)
                moveToRelative(0.0f, 0.0f)
                verticalLineToRelative(-3.248f)
                curveToRelative(0.0f, -0.335f, 0.222f, -0.541f, 0.542f, -0.541f)
                horizontalLineToRelative(1.353f)
                arcToRelative(1.895f, 1.895f, 0.0f, true, true, 0.0f, 3.789f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.895f, 10.579f)
                verticalLineToRelative(1.895f)
                moveToRelative(0.0f, 0.0f)
                verticalLineToRelative(3.315f)
                moveToRelative(0.0f, -3.315f)
                curveToRelative(0.531f, -0.709f, 1.026f, -1.592f, 1.894f, -1.832f)
                quadToRelative(0.22f, -0.062f, 0.474f, -0.063f)
            }
        }
        .build()
        return _brandAdobePremier!!
    }

private var _brandAdobePremier: ImageVector? = null
