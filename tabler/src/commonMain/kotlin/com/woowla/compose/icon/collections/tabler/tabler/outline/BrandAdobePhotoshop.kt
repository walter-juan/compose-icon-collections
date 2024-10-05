package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.BrandAdobePhotoshop: ImageVector
    get() {
        if (_brandAdobePhotoshop != null) {
            return _brandAdobePhotoshop!!
        }
        _brandAdobePhotoshop = Builder(name = "BrandAdobePhotoshop", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.79f, 15.79f)
                verticalLineToRelative(-3.79f)
                moveToRelative(0.0f, 0.0f)
                verticalLineToRelative(-2.724f)
                curveToRelative(0.0f, -0.11f, 0.0f, -0.165f, 0.004f, -0.211f)
                curveToRelative(0.044f, -0.45f, 0.4f, -0.806f, 0.85f, -0.85f)
                curveToRelative(0.046f, -0.004f, 0.101f, -0.004f, 0.211f, -0.004f)
                horizontalLineToRelative(1.303f)
                arcToRelative(1.895f, 1.895f, 0.0f, true, true, 0.0f, 3.789f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.178f, 11.263f)
                curveToRelative(-0.164f, -0.659f, -0.935f, -1.158f, -1.862f, -1.158f)
                curveToRelative(-1.047f, 0.0f, -1.895f, 0.637f, -1.895f, 1.421f)
                curveToRelative(0.0f, 0.785f, 0.848f, 1.421f, 1.895f, 1.421f)
                curveToRelative(1.046f, 0.0f, 1.895f, 0.637f, 1.895f, 1.421f)
                curveToRelative(0.0f, 0.785f, -0.849f, 1.421f, -1.895f, 1.421f)
                curveToRelative(-0.93f, 0.0f, -1.704f, -0.502f, -1.864f, -1.165f)
            }
        }
        .build()
        return _brandAdobePhotoshop!!
    }

private var _brandAdobePhotoshop: ImageVector? = null
