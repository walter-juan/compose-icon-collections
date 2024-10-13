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

public val SolidGroup.BxsCylinder: ImageVector
    get() {
        if (_bxsCylinder != null) {
            return _bxsCylinder!!
        }
        _bxsCylinder = Builder(name = "BxsCylinder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(5.131f, 0.0f, 9.0f, -1.935f, 9.0f, -4.5f)
                lineTo(21.0f, 7.0f)
                curveToRelative(0.0f, -0.051f, -0.024f, -0.097f, -0.033f, -0.146f)
                curveToRelative(0.016f, -0.117f, 0.033f, -0.234f, 0.033f, -0.354f)
                curveTo(21.0f, 3.935f, 17.131f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(3.0f, 3.935f, 3.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 2.565f, 3.869f, 4.5f, 9.0f, 4.5f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(4.273f, 0.0f, 7.0f, 1.48f, 7.0f, 2.5f)
                arcToRelative(0.683f, 0.683f, 0.0f, false, true, -0.025f, 0.158f)
                curveToRelative(-0.004f, 0.01f, -0.012f, 0.018f, -0.015f, 0.027f)
                curveToRelative(-0.274f, 0.848f, -2.29f, 1.98f, -5.496f, 2.253f)
                lineToRelative(-0.05f, 0.003f)
                curveTo(12.965f, 8.979f, 12.494f, 9.0f, 12.0f, 9.0f)
                curveTo(7.727f, 9.0f, 5.0f, 7.52f, 5.0f, 6.5f)
                reflectiveCurveTo(7.727f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxsCylinder!!
    }

private var _bxsCylinder: ImageVector? = null
