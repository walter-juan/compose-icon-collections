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

public val RegularGroup.BxRadar: ImageVector
    get() {
        if (_bxRadar != null) {
            return _bxRadar!!
        }
        _bxRadar = Builder(name = "BxRadar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.579f, 2.0f, 2.0f, 6.58f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.579f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.58f, 10.0f, -10.0f)
                reflectiveCurveTo(17.421f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.337f, 0.0f, -8.0f, -3.664f, -8.0f, -8.0f)
                curveToRelative(0.0f, -3.998f, 3.115f, -7.417f, 7.0f, -7.927f)
                lineTo(11.0f, 6.09f)
                curveTo(8.167f, 6.569f, 6.0f, 9.033f, 6.0f, 12.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.595f, 0.0f, 3.1f, -0.626f, 4.237f, -1.763f)
                lineToRelative(-1.414f, -1.415f)
                arcTo(3.97f, 3.97f, 0.0f, false, true, 12.0f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.858f, 1.279f, -3.411f, 3.0f, -3.858f)
                verticalLineToRelative(2.146f)
                curveToRelative(-0.59f, 0.353f, -1.0f, 0.993f, -1.0f, 1.712f)
                curveToRelative(0.0f, 1.081f, 0.919f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.919f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.719f, -0.41f, -1.359f, -1.0f, -1.712f)
                lineTo(13.0f, 4.073f)
                curveToRelative(3.885f, 0.51f, 7.0f, 3.929f, 7.0f, 7.927f)
                curveToRelative(0.0f, 4.336f, -3.663f, 8.0f, -8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _bxRadar!!
    }

private var _bxRadar: ImageVector? = null
